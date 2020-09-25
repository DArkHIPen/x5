import java.io.File;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import Exception.NotEnoughMoneyException;
import Exception.UnknownAccountException;

import java.io.FileWriter;

public class AccountService {
    private File file;
    ArrayList<Account> accounts = new ArrayList<>();

    public AccountService(File file) {
        this.file = file;
    }

    public void withdraw(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException, IOException {
        accounts.clear();
        writeAccounts();
        if (accountId > accounts.size()) {
            throw new UnknownAccountException("Unknown Account");
        } else {
            if (accounts.get(accountId).getAmount() - amount < 0) {
                throw new NotEnoughMoneyException("Not Enough Money");

            } else {
                accounts.get(accountId).setAmount(accounts.get(accountId).getAmount() - amount);
                PrintWriter pw = new PrintWriter(file);
                pw.close();
                recordAccount();
                accounts.get(accountId).AccountInfo();
            }
        }
    }


    public void balance(int accountId) throws UnknownAccountException, IOException {
        accounts.clear();
        writeAccounts();
        if (accountId > accounts.size()) {
            throw new UnknownAccountException("Unknown Account");
        } else {
            accounts.get(accountId).AccountInfo();
        }
    }

    public void deposit(int accountId, int amount) throws UnknownAccountException, IOException {
        accounts.clear();
        writeAccounts();
        if (accountId > accounts.size()) {
            throw new UnknownAccountException("Unknown Account");
        } else {
            accounts.get(accountId).AccountInfo();
            accounts.get(accountId).setAmount(accounts.get(accountId).getAmount() + amount);
            PrintWriter pw = new PrintWriter(file);
            pw.close();
            recordAccount();
            System.out.println("На счет зачислено " + amount);
            accounts.get(accountId).AccountInfo();
        }
    }


    public void transfer(int from, int to, int amount) throws NotEnoughMoneyException, UnknownAccountException, IOException {
        accounts.clear();
        writeAccounts();
        if (from > accounts.size() | to > accounts.size()) {
            throw new UnknownAccountException("Unknown Account");
        } else {
            if (accounts.get(from).getAmount() - amount < 0) {
                throw new NotEnoughMoneyException("Not Enough Money");
            } else {
                accounts.get(from).setAmount(accounts.get(from).getAmount() - amount);
                accounts.get(to).setAmount(accounts.get(to).getAmount() + amount);
                PrintWriter pw = new PrintWriter(file);
                pw.close();
                recordAccount();
                accounts.get(from).AccountInfo();
                accounts.get(to).AccountInfo();
            }
        }
    }

    public void writeAccounts() throws IOException { //загрузить базу из файла
        FileWriter fr = null;
        String absolutePath = file.getAbsolutePath();
        if (file.length() == 0) {
            String str = "1|Андрей Иванов|5000\n" +
                    "2|Дмитрий Долговязов|500\n" +
                    "3|Григорий Ломов|133123\n" +
                    "4|Василий Уткин|2023311\n" +
                    "5|Людмила Иванова|15021333\n" +
                    "6|Жора Дьяков|10000000\n" +
                    "7|Александр Нарышкин|11\n" +
                    "8|Борис Зайцев|325678457\n" +
                    "9|Роман Романов|98768822\n" +
                    "10|Имя Фамилия|1111111111";
            try {
                Files.createFile(Paths.get(absolutePath));
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fr = new FileWriter(absolutePath);
                fr.write(str);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {

                try {
                    assert fr != null;
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        BufferedReader reader = new BufferedReader(new FileReader(absolutePath));
        String str;
        while ((str = reader.readLine()) != (null)) {
            String[] arr = str.split("\\|");
            Account temp = new Account(Integer.parseInt(arr[0]), arr[1], Integer.parseInt(arr[2]));
            accounts.add(temp);
        }
        reader.close();
    }


    public void printAll() {//вывод аккаунтов на печать
        for (Account account : accounts) {
            System.out.println(account);
        }

    }

    public void recordAccount() {//записать базу в файл
        FileWriter fileWriter = null;
        String absolutePath = file.getAbsolutePath();
        try {
            fileWriter = new FileWriter(absolutePath, false);
            for (Account account : accounts) {
                fileWriter.write((account.toString()) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert fileWriter != null;
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

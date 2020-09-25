import Exception.NotEnoughMoneyException;
import Exception.UnknownAccountException;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnknownAccountException, NotEnoughMoneyException, IOException {


        File file = new File("D:/x5/AccountsBase.txt");//путь к базе

        AccountService accountService = new AccountService(file);
        accountService.writeAccounts();//стандартная база данных

        Scanner sc = new Scanner(System.in);
        System.out.println("Какую банковскую операцию хотите произвести: ");
        String input = sc.nextLine();
        String[] arr = input.split(" ");
        switch (arr[0]) {
            case "balance" -> accountService.balance(Integer.parseInt(arr[1]) - 1);
            case "withdraw" -> accountService.withdraw(Integer.parseInt(arr[1]) - 1, Integer.parseInt(arr[2]));
            case "deposite" -> accountService.deposit(Integer.parseInt(arr[1]) - 1, Integer.parseInt(arr[2]));
            case "transfer" -> accountService.transfer(Integer.parseInt(arr[1]) - 1, Integer.parseInt(arr[2]) - 1, Integer.parseInt(arr[3]));
            case "list" -> accountService.printAll();
            default -> System.out.println("Неизвестная операция");
        }
    }
}
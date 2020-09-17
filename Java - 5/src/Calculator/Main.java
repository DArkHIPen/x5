package Calculator;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Вас приветствует калькулятор! Введите выражение:");
        double tempA, tempB;
        String input = sc.nextLine();
        String operand = "";

        try {
            input = input.replaceAll("\\s+", "");
            String[] strings = input.split("\\W", 2);
            int c = input.indexOf('+');
            if (c > -1) {
                strings = input.split("\\+", 2);
                operand = "+";
            }
            c = input.indexOf('-');
            if (c > -1) {
                strings = input.split("-", 2);
                operand = "-";
            }
            c = input.indexOf('*');
            if (c > -1) {
                strings = input.split("\\*", 2);
                operand = "*";
            }
            c = input.indexOf('/');
            if (c > -1) {
                strings = input.split("/", 2);
                operand = "/";
            }
            tempA = Double.parseDouble(strings[0]);
            tempB = Double.parseDouble(strings[1]);

            System.out.println("Введите путь: ");
            PathType type = null;
            try {
                type = PathType.valueOf(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Не возможно сохранить " + e);
            }
            Logger logger = null;
            switch (Objects.requireNonNull(type)) {
                case DB:
                    logger = new DBLogger();
                    break;
                case File:
                    logger = new FileLogger();
                    break;
                case Console:
                    logger = new ConsoleLogger();
                    break;
                default:
            }

            switch (operand) {
                case "*":
                    Calculator.multiplication(tempA, tempB, logger);
                    break;
                case "+":
                    Calculator.add(tempA, tempB, logger);
                    break;
                case "-":
                    Calculator.minus(tempA, tempB, logger);
                    break;
                case "/":
                    Calculator.division(tempA, tempB, logger);
                    break;
                default:
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e);
        }

    }

}
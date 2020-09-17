package Computer;

import java.util.Scanner;

public class PC implements PCinterface {
    public static void main(String[] args) {

        CPU cpu;
        RAM ram;
        GC gc;
        HDD hdd;
        Monitor monitor;

        Strategy cpu1 = new Strategy(); //создание компонентов через паттерн Стратегия
        cpu1.setComponentsPC(new CPU(1000, 2, 1024, "3m", "acer"));
        cpu1.createComponent();
        cpu1.setComponentsPC(new HDD("China", 500, TypeHDD.HDD, FormFactorHDD.LFF));
        cpu1.createComponent();
        System.out.println();

        FacadePC comp1 = new FacadePC(); //создание полностью PC методом Фасад
        comp1.createPC();

        System.out.println("\n Вводите компонент для PC, который нужно создать:"); //создание компонента методом Factory
        Scanner sc = new Scanner(System.in);
        String component = sc.nextLine();
        FactoryComponents createprogram = null;
        switch (component) {
            case "CPU" -> createprogram = new CreateCPU();
            case "RAM" -> createprogram = new CreateRAM();
            case "GC" -> createprogram = new CreateGC();
            case "HDD" -> createprogram = new CreateHDD();
            case "Monitor" -> createprogram = new CreateMonitor();
            default -> System.out.println("Компонент не найден");
        }
        if (createprogram != null) {
            ComponentsPC message = createprogram.createComponent();
            message.output();
        }

    }
}
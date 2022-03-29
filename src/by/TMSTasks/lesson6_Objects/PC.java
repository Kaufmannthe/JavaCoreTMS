package by.TMSTasks.lesson6_Objects;

import java.util.Random;
import java.util.Scanner;

public class PC {
    String cpu;
    int ram;
    int hdd;
    int cycles;

    void systemInfo(){
        System.out.println("Процессор: " + cpu +
                "\n" + "Оперативная память: " + ram +
                "\n" + "Жесткий диск: " + hdd);     }   //Method 1



    void turnOnPC(){
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        int randomValue = r.nextInt(0,2);
        System.out.println("Введите значение от 0 до 1 для включения компьютера: ");
        int inputValue = s.nextInt();
        if (randomValue == inputValue){
            System.out.println("Компьютер включён");
            turnOffPc();
        }if (randomValue != inputValue) {
            System.out.println("Ошибка ввода");
        }

    }

    void turnOffPc(){
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        int randomValue = r.nextInt(0,2);
        System.out.println("Введите значение от 0 до 1 для выключения компьютера");
        int inputValue = s.nextInt();
        if (randomValue == inputValue){
            System.out.println("Компьютер выключен");
        }else {
            System.out.println("Ошибка ввода");
        }
    }

    public static void main(String[] args) {


        PC myPC = new PC();
        myPC.ram = 8;
        myPC.hdd = 1000;
        myPC.cycles = 3;
        myPC.cpu = "Intel Core i5 8530";

        myPC.systemInfo();

        for (int i = 0; i <= myPC.cycles; i++) {
            myPC.turnOnPC();
            if (i == myPC.cycles){
                System.out.println("Компьютер сгорел. Превышение ресурсов");
            }
        }
    }

}
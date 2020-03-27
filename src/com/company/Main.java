package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текущий курс доллара:");
        double curs = scanner.nextDouble();

        System.out.println("Введите количество рублей для обмена:");
        double rub = scanner.nextDouble();

        double pokupkadollars = rub / curs;


        System.out.printf("%.2f", pokupkadollars);






    }
}

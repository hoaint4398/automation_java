package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("2.3. Nhap vào 1 số và kiểm tra xem là số nguyên dương hay âm và sau đó in ra màn hình");
            System.out.println("Nhap mot so nguyen bat ky");
            System.out.println();
            boolean isValid = false;
            try {
                int numberInteger = scanner.nextInt();
                if (numberInteger > 0) {
                    System.out.println("Day la so nguyen duong");
                    isValid = true;
                } else if (numberInteger < 0) {
                    System.out.println("Day la so nguyen am");
                    isValid = true;
                } else {
                    System.out.println("So 0 khong phai la so nguyen duong hay la so nguyen am");
                    isValid = true;
                }
                break;

            } catch (Exception e) {
                System.out.println("Ban nhap sai dinh dang so nguyen.");
            }

        }

    }
}
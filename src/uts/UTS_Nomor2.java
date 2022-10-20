package uts;

// Created by Muhammad Asyrof_21343056

import java.util.Scanner;

public class UTS_Nomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah baris : ");
        int baris = input.nextInt();
        input.close();
        System.out.println();

        for (int a=0; a<=baris-1; a++) {
            for (int b=0; b<a; b++) {
                System.out.print(" ");
            }
            for (int c=a; c<=baris-1; c++) {
                System.out.print("# ");
            }
            System.out.println();
        }

        for (int a=baris; a>=0; a--) {
            for (int b=0; b<a; b++) {
                System.out.print(" ");
            }
            for (int c=a; c<=baris-1; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

package com.github.affandes.kuliah.pm;

import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Stack<String> history = new Stack<>();
        Scanner input = new Scanner(System.in);

        int pilih = -1;

        while (pilih != 0) {
            System.out.println("\n=== Browser History ===");
            System.out.println("1. Browse (buka website)");
            System.out.println("2. Back (balik ke halaman sebelumnya)");
            System.out.println("3. View History");
            System.out.println("0. Exit");
            System.out.print("Pilih menu: ");
            pilih = input.nextInt();
            input.nextLine();

            if (pilih == 1) {
                System.out.print("Masukkan website: ");
                String site = input.nextLine();
                history.push(site);
                System.out.println("Kunjungi: " + site);

            } else if (pilih == 2) {
                if (history.isEmpty()) {
                    System.out.println("Gak ada history buat balik...");
                } else {
                    String removed = history.pop();
                    System.out.println("Balik dari: " + removed);
                }

            } else if (pilih == 3) {
                if (history.isEmpty()) {
                    System.out.println("History masih kosong bro.");
                } else {
                    System.out.println("\n=== History (paling baru di atas) ===");

                    Stack<String> temp = new Stack<>();
                    temp.addAll(history);

                    while (!temp.isEmpty()) {
                        System.out.println(temp.pop());
                    }
                }

            } else if (pilih == 0) {
                System.out.println("Keluar program...");
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }

        input.close();
    }
}

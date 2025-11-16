package com.github.affandes.kuliah.pm;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>();

        while (true) {
            System.out.println("\n=== Mini Browser History ===");
            System.out.println("1. Browse (tambah website)");
            System.out.println("2. Back (kembali ke sebelumnya)");
            System.out.println("3. View History");
            System.out.println("4. Exit");
            System.out.print("Pilih menu: ");
            int pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan URL baru: ");
                    String url = input.nextLine();
                    history.add(url);
                    System.out.println("Website ditambahkan!");
                    break;

                case 2:
                    if (history.size() > 0) {
                        System.out.println("Kembali dari: " + history.get(history.size() - 1));
                        history.remove(history.size() - 1);
                    } else {
                        System.out.println("History kosong bro");
                    }
                    break;

                case 3:
                    if (history.size() == 0) {
                        System.out.println("History kosong bro");
                    } else {
                        System.out.println("\n--- History (paling baru di atas) ---");
                        for (int i = history.size() - 1; i >= 0; i--) {
                            System.out.println(history.get(i));
                        }
                    }
                    break;

                case 4:
                    System.out.println("Keluar...");
                    return;

                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }
    }
}

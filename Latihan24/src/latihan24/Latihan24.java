/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan24;
import java.util.Scanner;
public class Latihan24 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Meminta user untuk memasukkan dua nilai
        System.out.println("------Program Perbandingan Dua Nilai-----");
        System.out.println("Masukkan nilai pertama : ");
        int nilai1 = scanner.nextInt();
        System.out.println("Masukkan nilai kedua : ");
        int nilai2 = scanner.nextInt();

        // Membandingkan dua nilai
        if (nilai1 == nilai2) {
            System.out.println("Kedua nilai sama");
        } else if (nilai1 > nilai2) {
            System.out.println(nilai1 + " lebih besar dari " + nilai2);
        } else {
            System.out.println(nilai1 + " lebih kecil dari " + nilai2);
        }

        // Menanyakan apakah user ingin mengulang program
        System.out.println("Ulangi aktivitas (Ya/Tidak) : ");
        String ulangi = scanner.next();

        // Jika user menjawab "Ya", maka program akan diulang
        if (ulangi.equalsIgnoreCase("Ya")) {
            main(args);
        }
         }
    }


    
    

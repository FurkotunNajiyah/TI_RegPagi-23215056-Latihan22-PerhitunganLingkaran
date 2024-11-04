/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author apriy
 */
import java.util.Scanner;

public class PerhitunganLingkaran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan nilai diameter lingkaran: ");
            int diameter = scanner.nextInt();

            if (diameter <= 0) {
                System.out.println("Nilai diameter tidak valid. Harap masukkan bilangan bulat positif.");
            } else {
                double jariJari = diameter / 2.0;
                double luas = Math.PI * jariJari * jariJari;
                double keliling = Math.PI * diameter;

                System.out.println("Hasil Perhitungan Lingkaran");
                System.out.println("Jari-jari Lingkaran: " + jariJari + " cm");
                System.out.println("Luas Lingkaran: " + luas + " cm²");
                System.out.println("Keliling Lingkaran: " + keliling + " cm");
                break; // Keluar dari loop jika input valid
            }
        }
    }
}

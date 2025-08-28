/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maindosrecursividades;
import java.util.Scanner;
/**
 *
 * @author Arturo González
 */
public class Codigo_07_01 {
    public static long factorial(int n) {
        if (n < 2) return 1;
        return n * factorial(n - 1);
    }

    public static void run(Scanner sc) {
        System.out.print("n: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("factorial(" + n + ") = " + factorial(n));
    }
}
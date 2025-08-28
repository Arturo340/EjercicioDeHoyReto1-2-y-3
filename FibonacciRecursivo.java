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
public class FibonacciRecursivo {
    public static long fibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void run(Scanner sc) {
        System.out.print("n: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("fibonacci(" + n + ") = " + fibonacci(n));
    }
}
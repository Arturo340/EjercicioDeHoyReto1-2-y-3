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
public class SumadorDeDigitos {
    public static int sumaDigitos(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumaDigitos(n / 10);
    }

    public static void run(Scanner sc) {
        System.out.print("Numero: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("sumaDigitos(" + n + ") = " + sumaDigitos(n));
    }
}

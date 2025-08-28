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
public class InversorCadena {
    public static String invertirCadena(String s) {
        if (s == null || s.length() <= 1) return s;
        return invertirCadena(s.substring(1)) + s.charAt(0);
    }

    public static void run(Scanner sc) {
        System.out.print("Cadena: ");
        String s = sc.nextLine();
        System.out.println("invertirCadena(" + s + ") = " + invertirCadena(s));
    }
}

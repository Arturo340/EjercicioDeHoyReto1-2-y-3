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
public class ContadorVocales {
    public static int contarVocales(String s) {
        if (s == null || s.length() == 0) return 0;
        char c = Character.toLowerCase(s.charAt(0));
        int esVocal = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
        return esVocal + contarVocales(s.substring(1));
    }

    public static void run(Scanner sc) {
        System.out.print("Cadena: ");
        String s = sc.nextLine();
        System.out.println("contarVocales(\"" + s + "\") = " + contarVocales(s));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maindosrecursividades;
import java.util.Scanner;
/**
 *
 * @author Arturo González
 */
public class MainDosRecursividades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("11) Caso 1");
            System.out.println("2) Caso 2");
            System.out.println("3) Reto 1: Suma de digitos");
            System.out.println("0) Salir");
            System.out.print("Opcion: ");
            String op = sc.nextLine();
            if (op.equals("1")) {
                Codigo_07_01.run(sc);
            } else if (op.equals("2")) {
                Codigo_07_02.run(sc);
            } else if (op.equals("3")) {
                Reto1.run(sc);
            } else if (op.equals("0")) {
                break;
            } else {
                System.out.println("Opcion invalida");
            }
            System.out.println();
        }
        sc.close();
    }
}

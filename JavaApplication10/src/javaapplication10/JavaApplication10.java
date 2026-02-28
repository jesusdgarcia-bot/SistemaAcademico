/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class JavaApplication10 {

    
public static void registrarAsignatura() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese código de la asignatura: ");
        String codigo = scanner.nextLine();
        System.out.print("Ingrese nombre de la asignatura: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese créditos: ");
        int creditos = scanner.nextInt();
        scanner.nextLine(); // limpiar buffer
        System.out.print("Ingrese nombre del docente: ");
        String docente = scanner.nextLine();

        Asignatura nueva = new Asignatura(codigo, nombre, creditos, docente);
        asignaturas.add(nueva);
        System.out.println("¡Asignatura registrada exitosamente!");
    }
}

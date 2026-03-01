package sistemaacademico;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jssdv
 */
public class SistemaAcademico {

    private static ArrayList<Estudiante> estudiantes = new ArrayList<>();
    private static ArrayList<Asignatura> asignaturas = new ArrayList<>();
    
    private static final Scanner scanner = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // --------------------------------------------------
   System.out.println("Sistema Académico - Pruebas Desarrollador 1");
   registrarAsignatura();
   listarAsignaturas();
   buscarAsignatura();

    
    
}
    
public static void registrarAsignatura() {
        System.out.println("\n=== Registrar Nueva Asignatura ===");
        
        System.out.print("Código: ");
        String codigo = scanner.nextLine().trim();
        
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine().trim();
        
        System.out.print("Créditos: ");
        int creditos;
        try {
            creditos = Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Error: créditos deben ser un número entero.");
            return;
        }
        
        System.out.print("Docente a cargo: ");
        String docente = scanner.nextLine().trim();
        
        Asignatura nueva = new Asignatura(codigo, nombre, creditos, docente);
        asignaturas.add(nueva);
        
        System.out.println("¡Asignatura registrada con éxito!");
    }

public static void listarAsignaturas() {
        System.out.println("\n══════════════════════════════════════════");
        System.out.println("          LISTADO DE ASIGNATURAS");
        System.out.println("══════════════════════════════════════════");

        if (asignaturas.isEmpty()) {
            System.out.println("No hay asignaturas registradas todavía.");
            System.out.println("──────────────────────────────────────────");
            return;
        }

        System.out.printf("%-10s %-35s %-8s %-30s%n",
                "Código", "Nombre", "Créditos", "Docente");
        System.out.println("───────────────────────────────────────────────────────────────────────");

        for (Asignatura a : asignaturas) {
            System.out.printf("%-10s %-35s %-8d %-30s%n",
                    a.getCodigo(),
                    a.getNombre(),
                    a.getCreditos(),
                    a.getDocente());
        }

        System.out.println("───────────────────────────────────────────────────────────────────────");
        System.out.println("Total de asignaturas: " + asignaturas.size());
        System.out.println();
    }

public static void buscarAsignatura() {
        System.out.println("\n══════════════════════════════════════════");
        System.out.println("          BUSCAR ASIGNATURA");
        System.out.println("══════════════════════════════════════════");

        if (asignaturas.isEmpty()) {
            System.out.println("No hay asignaturas registradas para buscar.");
            System.out.println("──────────────────────────────────────────");
            return;
        }

        System.out.print("Ingrese el código de la asignatura a buscar: ");
        String codigoBuscado = scanner.nextLine().trim();

        boolean encontrada = false;
        for (Asignatura a : asignaturas) {
            if (a.getCodigo().equalsIgnoreCase(codigoBuscado)) {
                System.out.println("\nAsignatura encontrada:");
                System.out.println("──────────────────────────────────────────");
                System.out.println("Código   : " + a.getCodigo());
                System.out.println("Nombre   : " + a.getNombre());
                System.out.println("Créditos : " + a.getCreditos());
                System.out.println("Docente  : " + a.getDocente());
                System.out.println("──────────────────────────────────────────");
                encontrada = true;
                break;
            }
        }

        if (!encontrada) {
            System.out.println("No se encontró ninguna asignatura con código: " + codigoBuscado);
            System.out.println("──────────────────────────────────────────");
        }
    }
}


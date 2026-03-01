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

public static void actualizarAsignatura() {
        System.out.println("\n══════════════════════════════════════════");
        System.out.println("       ACTUALIZAR ASIGNATURA");
        System.out.println("══════════════════════════════════════════");

        if (asignaturas.isEmpty()) {
            System.out.println("No hay asignaturas registradas para actualizar.");
            System.out.println("──────────────────────────────────────────");
            return;
        }

        System.out.print("Ingrese el código de la asignatura a actualizar: ");
        String codigoBuscado = scanner.nextLine().trim();

        Asignatura asignaturaEncontrada = null;
        for (Asignatura a : asignaturas) {
            if (a.getCodigo().equalsIgnoreCase(codigoBuscado)) {
                asignaturaEncontrada = a;
                break;
            }
        }

        if (asignaturaEncontrada == null) {
            System.out.println("No se encontró ninguna asignatura con código: " + codigoBuscado);
            System.out.println("──────────────────────────────────────────");
            return;
        }

        // Mostrar datos actuales
        System.out.println("\nDatos actuales de la asignatura:");
        System.out.println("Código   : " + asignaturaEncontrada.getCodigo());
        System.out.println("Nombre   : " + asignaturaEncontrada.getNombre());
        System.out.println("Créditos : " + asignaturaEncontrada.getCreditos());
        System.out.println("Docente  : " + asignaturaEncontrada.getDocente());
        System.out.println("──────────────────────────────────────────");

        // Actualizar campos (dejar vacío para no cambiar)
        System.out.print("Nuevo nombre (Enter para mantener): ");
        String nuevoNombre = scanner.nextLine().trim();
        if (!nuevoNombre.isEmpty()) {
            asignaturaEncontrada.setNombre(nuevoNombre);
        }

        System.out.print("Nuevos créditos (Enter para mantener): ");
        String creditosStr = scanner.nextLine().trim();
        if (!creditosStr.isEmpty()) {
            try {
                int nuevosCreditos = Integer.parseInt(creditosStr);
                asignaturaEncontrada.setCreditos(nuevosCreditos);
            } catch (NumberFormatException e) {
                System.out.println("Error: créditos inválidos. No se actualizó.");
            }
        }

        System.out.print("Nuevo docente (Enter para mantener): ");
        String nuevoDocente = scanner.nextLine().trim();
        if (!nuevoDocente.isEmpty()) {
            asignaturaEncontrada.setDocente(nuevoDocente);
        }

        System.out.println("\n¡Asignatura actualizada exitosamente!");
        System.out.println("──────────────────────────────────────────");
    }

    public static void eliminarAsignatura() {
        System.out.println("\n══════════════════════════════════════════");
        System.out.println("         ELIMINAR ASIGNATURA");
        System.out.println("══════════════════════════════════════════");

        if (asignaturas.isEmpty()) {
            System.out.println("No hay asignaturas registradas para eliminar.");
            System.out.println("──────────────────────────────────────────");
            return;
        }

        System.out.print("Ingrese el código de la asignatura a eliminar: ");
        String codigoEliminar = scanner.nextLine().trim();

        Asignatura asignaturaAEliminar = null;
        for (Asignatura a : asignaturas) {
            if (a.getCodigo().equalsIgnoreCase(codigoEliminar)) {
                asignaturaAEliminar = a;
                break;
            }
        }

        if (asignaturaAEliminar == null) {
            System.out.println("No se encontró ninguna asignatura con código: " + codigoEliminar);
            System.out.println("──────────────────────────────────────────");
            return;
        }

        // Confirmación para evitar eliminaciones accidentales
        System.out.println("\nAsignatura encontrada:");
        System.out.println("Código   : " + asignaturaAEliminar.getCodigo());
        System.out.println("Nombre   : " + asignaturaAEliminar.getNombre());
        System.out.println("Créditos : " + asignaturaAEliminar.getCreditos());
        System.out.println("Docente  : " + asignaturaAEliminar.getDocente());
        
        System.out.print("\n¿Está seguro que desea ELIMINAR esta asignatura? (sí/no): ");
        String confirmacion = scanner.nextLine().trim().toLowerCase();

        if (confirmacion.equals("sí") || confirmacion.equals("si") || confirmacion.equals("s")) {
            asignaturas.remove(asignaturaAEliminar);
            System.out.println("\n¡Asignatura eliminada exitosamente!");
        } else {
            System.out.println("\nOperación cancelada. La asignatura NO fue eliminada.");
        }
        
        System.out.println("──────────────────────────────────────────");
    }
    
    
    public Nota verificarEstudianteYAsignatura(){
        String codEstudiante;
        String codAsignatura;

        System.out.print("Ingrese el codigo del estudiante: "); codEstudiante = scanner.nextLine();
        Estudiante estudiante = null;

          for(Estudiante est : estudiantes){
            if(est.getCodigo().equals(codEstudiante)){
              estudiante = est;
              break;
            }
          }

        System.out.print("Ingrese el codigo de la asignatura: "); codAsignatura = scanner.nextLine();
        Asignatura asignatura = null;

          for(Asignatura asig : asignaturas){
            if(asig.getCodigo().equals(codAsignatura)){
              asignatura = asig;
              break;
            }
          }

        Nota nota = null;

          if(estudiante != null && asignatura != null){
            nota = new Nota();
            nota.setEstudiante(estudiante);
            nota.setAsignatura(asignatura);
            return nota;
          }else if(estudiante == null && asignatura == null){
            System.out.println("Estudiante no encontrado..."); 
            System.out.println("Asignatura no encontrada...");
            System.out.println("Presione enter para continuar..."); scanner.nextLine();
            return nota;
          }else if(estudiante == null){
            System.out.println("Estudiante no encontrado...");
            System.out.println("Presione enter para continuar..."); scanner.nextLine();
            return nota;
          }else{
            System.out.println("Asignatura no encontrada...");
            System.out.println("Presione enter para continuar..."); scanner.nextLine();
            return nota;
          }
    }
    
    
}
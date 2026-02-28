package sistemaacademico; 

import java.util.ArrayList; 
import java.util.Scanner;   

public class SistemaAcademico {
    
    static ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    static ArrayList<String> listaAsignaturas = new ArrayList<>(); 
    static ArrayList<Double> listaNotas = new ArrayList<>();

    
    public static void main(String[] args) {
      mostrarMenu();
    }
    
    public static void mostrarMenu() {
        Scanner leer = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n . . . : : :SISTEMA ACADEMICO: : : . . .");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Listar estudiantes");
            System.out.println("3. Buscar estudiante por numero de identificacion");
            System.out.println("4. Actualizar estudiante");
            System.out.println("5. Eliminar estudiante");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");
            
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Opcion 1 seleccionada...");
                    break;
                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion >= 6 && opcion <= 1);
    }
    
}
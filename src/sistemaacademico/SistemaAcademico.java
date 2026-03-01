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
                case 1: registrarEstudiante(); break;
                case 2: listarEstudiantes(); break;
                case 3: buscarEstudiante(); break;
                case 4: actualizarEstudiante(); break;
                case 5: eliminarEstudiante(); break;
                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion >= 6 && opcion <= 1);
    }
    
    public static void registrarEstudiante() {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("\n--- REGISTRO DE NUEVO ESTUDIANTE ---");
        
        System.out.print("Ingrese el numero de identificacion: ");
        String codigo = leer.nextLine();
        
        System.out.print("Ingrese el nombre: ");
        String nombre = leer.nextLine();
        
        System.out.print("Ingrese el apellido: ");
        String apellido = leer.nextLine();
        
        System.out.print("Ingrese la edad: ");
        int edad = leer.nextInt();
        
        System.out.print("Ingrese el semestre: ");
        int semestre = leer.nextInt();

        Estudiante nuevo = new Estudiante(codigo, nombre, apellido, edad, semestre);
        
        listaEstudiantes.add(nuevo);
        
        System.out.println("Estudiante guardado exitosamente en el sistema...");
    }
    
    
public static void listarEstudiantes() {
        if (listaEstudiantes.isEmpty()) {
            System.out.println("No hay registros.");
        } else {
            for (Estudiante e : listaEstudiantes) {
                System.out.println(e.toString());
            }
        }
    }

    public static void buscarEstudiante() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el numero de identificacion a buscar: ");
        String busqueda = leer.nextLine();
        boolean encontrado = false;

        for (Estudiante e : listaEstudiantes) {
            if (e.getcodigo().equals(busqueda)) {
                System.out.println("Estudiante encontrado: " + e.toString());
                encontrado = true;
                break;
            }
        }
       if (!encontrado) System.out.println("Estudiante no encontrado.");
    
 public static void actualizarEstudiante() {
Scanner leer = new Scanner(System.in);
System.out.print("Ingrese la identificacion del estudiante a actualizar: ");
String codigoBusqueda = leer.nextLine();

for (Estudiante e : listaEstudiantes) {
if (e.getcodigo().equals(codigoBusqueda)) {
System.out.print("Nuevo nombre: ");
e.setNombre(leer.nextLine());
System.out.print("Nuevo apellido: ");
e.setApellido(leer.nextLine());
System.out.print("Nueva edad: ");
e.setEdad(leer.nextInt());
System.out.print("Nuevo semestre: ");
e.setSemestre(leer.nextInt());
System.out.println("Datos actualizados con exito");
return; }
}
System.out.println("No se encontro el estudiante.");
}
    
public static void eliminarEstudiante() {
  Scanner leer = new Scanner (System.in);
    System.out.println("Ingrese el numero de identificacion a eliminar"); 
     String busqueda = leer.nextLine();
        boolean encontrado = false;
        
          for (Estudiante e : listaEstudiantes) {
           if (e.getcodigo().equals(busqueda)) {
               e.setEstado("inactivo");
               System.out.println("el estudiante de identificacion  " + busqueda + " ha sido eliminado");
             encontrado = true;
                break;
        
}
}

}
 if (!encontrado) System.out.println("Estudiante no encontrado.");
 
 
}
    
    

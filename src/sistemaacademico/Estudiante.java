package sistemaacademico;


public class Estudiante {
 private String codigo;
    private String nombre;
    private String apellido;
    private int edad;
    private int semestre;
    private boolean estado;

// Constructor con todos los parámetros (recomendado para crear objetos completos)
    public Estudiante(String codigo, String nombre, String apellido, int edad, int semestre, boolean estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.semestre = semestre;
        this.estado= estado;
    }
    
    // Constructor vacío (útil para crear objeto y luego setear valores)
    public Estudiante() {
    }
    
    // Getters y Setters → esto es el encapsulamiento
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString() {
        return "Estudiante{" +
               "codigo='" + codigo + '\'' +
               ", nombre='" + nombre + '\'' +
               ", apellido='" + apellido + '\'' +
               ", edad=" + edad +
               ", semestre=" + semestre +
              ", estado=" + estado + '}';
        
    }
}

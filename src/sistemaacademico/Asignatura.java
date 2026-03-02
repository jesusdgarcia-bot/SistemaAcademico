package sistemaacademico;


public class Asignatura {
    private String codigo;
    private String nombre;
    private int creditos;
    private String docente;
  
    public Asignatura(String codigo, String nombre, int creditos, String docente){
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.docente = docente;
    }
  
    public Asignatura(){
      this.codigo = null;
      this.nombre = null;
      this.creditos = 0;
      this.docente = null;
    }
  
    public String getCodigo(){
      return this.codigo;
    }

    public String getNombre(){
      return this.nombre;
    }

    public int getCreditos(){
      return this.creditos;
    }

    public String getDocente(){
      return this.docente;
    }

    public void setCodigo(String codigo){
      this.codigo = codigo;
    }

    public void setNombre(String nombre){
      this.nombre = nombre;
    }

    public void setCreditos(int creditos){
      this.creditos = creditos;
    }

    public void setDocente(String docente){
      this.docente = docente;
    }
    
    @Override
    public String toString() {
        return "Asignatura{" + 
                "codigo='" + codigo + '\'' + 
                ", nombre='" + nombre + '\'' +
               ", creditos=" + creditos + 
                ", docente='" + docente + '\'' + '}';
    }
}

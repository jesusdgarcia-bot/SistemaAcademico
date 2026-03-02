package sistemaacademico;


public class Nota {
    private Estudiante estudiante;
    private Asignatura asignatura;
    private double valor;
    private int periodo;
      
    public Nota( Estudiante estudiante, Asignatura asignatura, double valor, int periodo){
      this.estudiante = estudiante;
      this.asignatura = asignatura;
      this.valor = valor;
      this.periodo = periodo;
    }

    public Nota(){
      this.estudiante = null;
      this.asignatura = null;
      this.valor = 0.0;
      this.periodo = 0;
    }

    public Estudiante getEstudiante(){ 
      return estudiante; 
    }

    public Asignatura getAsignatura(){ 
      return asignatura; 
    } 

    public double getValor(){ 
      return valor;
    } 

    public int getPeriodo(){ 
      return periodo; 
    } 

    public void setEstudiante(Estudiante estudiante){ 
      this.estudiante = estudiante; 
    }

    public void setAsignatura(Asignatura asignatura){ 
      this.asignatura = asignatura; 
    } 

    public void setValor(double valor){ 
      this.valor = valor; 
    } 

    public void setPeriodo(int periodo){ 
      this.periodo = periodo; 
    } 
    
    @Override
    public String toString(){
      return String.format(" %-15s %-15s | %-20s | %-8d | %-3d | %-7d | %-4.2f\n", 
                            estudiante.getNombre(), 
                            estudiante.getApellido(), 
                            asignatura.getNombre(), 
                            asignatura.getCreditos(),
                            estudiante.getSemestre(), 
                            this.periodo, this.valor);
    }
}

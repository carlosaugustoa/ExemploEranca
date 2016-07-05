package model;

public class Professor extends Funcionario{

    private String disciplina;
    private String turno; 
   
    public Professor(){}

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Professor{"
                + "\nmatricula=" + super.getMatricula() 
                + "\ndisciplina=" + disciplina
                + ", turno=" + turno
                + '}';
    }
    
    
   
}

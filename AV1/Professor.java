import java.util.ArrayList;

public class Professor extends Funcionario{
    private String tipo;
    private ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>(); //nao deve ter repetição

    public Professor(String matricula, String nome, String tipo){
        this.setMatricula(matricula);
        this.setNome(nome);
        this.setTipo(tipo);
    }
    
    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Aluno> getListaAlunos() {
        return this.listaAlunos;
    }

    public void setListaAlunos(ArrayList<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    public void addAluno(Aluno aluno){
        if(!listaAlunos.contains(aluno)){
            listaAlunos.add(aluno);
        }
    }

    public void removerAluno(Aluno aluno){
        if(listaAlunos.contains(aluno)){
            listaAlunos.remove(aluno);
        }
    }
}

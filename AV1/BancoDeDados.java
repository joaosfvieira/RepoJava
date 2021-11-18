import java.util.ArrayList;
import java.util.Calendar;

public class BancoDeDados {
    private ArrayList<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();

    public ArrayList<Funcionario> getListaFuncionarios() {
        return this.listaFuncionarios;
    }

    public void setListaFuncionarios(ArrayList<Funcionario> listaFuncionarios) {
        this.listaFuncionarios = listaFuncionarios;
    }

    public void addFuncionario(Funcionario funcionario){
        this.listaFuncionarios.add(funcionario);
    }

    public void removerFuncionario(Funcionario funcionario){
        this.listaFuncionarios.remove(funcionario);
    }

    public void imprimeListaFuncionarios(){
        System.out.println("\n####################### Funcionarios ###########################");
        for(int i=0; i<listaFuncionarios.size(); i++){
            if(listaFuncionarios.get(i) instanceof Professor){
                String aux = "[" + ((Professor) listaFuncionarios.get(i)).getTipo() + "]"; 
                System.out.println("Matrícula: " + listaFuncionarios.get(i).getMatricula() + "  Nome.: " + listaFuncionarios.get(i).getNome() + " Tipo.: class imd. " + listaFuncionarios.get(i).getClass() + " " + aux);
            }
            else
                System.out.println("Matrícula: " + listaFuncionarios.get(i).getMatricula() + "  Nome.: " + listaFuncionarios.get(i).getNome() + " Tipo.: class imd. " + listaFuncionarios.get(i).getClass());
        }
        System.out.println("################################################################");
    }

    public void imprimeListaAtividades(){
        System.out.println("\n######################## Professores ###########################");

        for(int i=0; i<listaFuncionarios.size(); i++){
            if(listaFuncionarios.get(i) instanceof Professor){
                System.out.println("Professor [" + listaFuncionarios.get(i).getNome() + "]");
                for(int j=0; j< ((Professor)listaFuncionarios.get(i)).getListaAlunos().size(); j++){
                    for(int z=0; z<((Professor)listaFuncionarios.get(i)).getListaAlunos().get(j).getListaTreinos().size(); z++){
                        System.out.println(("Aluno >>> " + ((Professor)listaFuncionarios.get(i)).getListaAlunos().get(j).getNome()) + " {" + ((Professor)listaFuncionarios.get(i)).getListaAlunos().get(j).getListaTreinos().get(z) + "}");
                    }
                }
            }
        }
        System.out.println("################################################################");
    }

    public void imprimeAlunos(){
        System.out.println("\n######################     Alunos     ##########################");

        for(int i=0; i<listaFuncionarios.size(); i++){
            if(listaFuncionarios.get(i) instanceof Professor){
                for(int j=0; j< ((Professor)listaFuncionarios.get(i)).getListaAlunos().size(); j++){ 
                    System.out.println("CPF.: " + ((Professor)listaFuncionarios.get(i)).getListaAlunos().get(j).getCpf() + "  Nome.: " + ((Professor)listaFuncionarios.get(i)).getListaAlunos().get(j).getNome() + "   Idade.: " + ((Professor)listaFuncionarios.get(i)).getListaAlunos().get(j).getDataNasc());
                }
            }
        }
        System.out.println("################################################################");
    }
}

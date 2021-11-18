import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;

public class Aluno {
    private String nome;
    private String cpf;
    private Date dataNasc;
    private ArrayList<String> listaTreinos = new ArrayList<String>(); //sem repetir

    public Aluno(String nome, String cpf, Calendar cal){
        this.setNome(nome);
        this.setCpf(cpf);
        this.setDataNasc(cal.getTime());
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNasc() {
        return this.dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }


    public ArrayList<String> getListaTreinos() {
        return this.listaTreinos;
    }

    public void setListaTreinos(ArrayList<String> listaTreinos) {
        this.listaTreinos = listaTreinos;
    }

    public void addTreino(String treino){
        this.listaTreinos.add(treino);
    }
    public void removerTreino(String treino){
        for(int i=0; i<listaTreinos.size(); i++){
            if(treino == listaTreinos.get(i)){
                listaTreinos.remove(i);
            }
        }
    }
    //add treino remove treino

}

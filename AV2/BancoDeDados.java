import java.util.ArrayList;
import java.time.LocalDate;
import java.time.Period;

public class BancoDeDados {
    protected ArrayList<Professor> grupoProfessors = new ArrayList<Professor>();

    public void informarNumeroProfessores(){
        System.out.println("A escola possui " + grupoProfessors.size() + " professores.\n");
    }

    public void informarProfessorDeMaiorSalario(){
        Professor aux = new Professor();
        aux.setSalario(0);
        for(Professor prof : grupoProfessors){
            if(prof.getSalario() > aux.getSalario())
                aux = prof;
        }
        System.out.println("O professor " + aux.getNome() + ", possui o maior salário da escola.\n");
    }

    public void informarProfessorMaisJovem(){
        LocalDate dataAtual = LocalDate.of(2021, 11, 18);
        Professor aux = new Professor();
        LocalDate nascAux = LocalDate.of(1000, 10, 10);
        aux.setDataNascimento(nascAux);
        for(Professor prof : grupoProfessors){
            if(Period.between(prof.getDataNascimento(), dataAtual).getYears() < Period.between(aux.getDataNascimento(), dataAtual).getYears()){
                aux = prof;
            }
        }
        System.out.println("O professor mais jovem é " + aux.getNome() + ", ele tem " + Period.between(aux.getDataNascimento(), dataAtual).getYears() + " anos.\n");
    }

    public void informarProfessorMaisAntigo(){
        LocalDate dataAtual = LocalDate.of(2021, 11, 18);
        Professor aux = new ProfessorIntegral();
        LocalDate entradaAux = LocalDate.of(2021, 11, 17);
        ((ProfessorIntegral)aux).setDataInicio(entradaAux);
        for(Professor prof : grupoProfessors){
            if(prof instanceof ProfessorIntegral){
                if(Period.between(((ProfessorIntegral)prof).getDataInicio(), dataAtual).getYears() > Period.between(((ProfessorIntegral)aux).getDataInicio(), dataAtual).getYears()){
                    aux = prof;
                }
            }
        }
        System.out.println("O professor mais antigo na escola é " + aux.getNome() + ", ele leciona há " + Period.between(((ProfessorIntegral)aux).getDataInicio(), dataAtual).getYears() + " anos na escola.\n");
    }

    public void informarTotalSalarioPagoPelaEscola(){
        double aux = 0;
        for(Professor prof : grupoProfessors){
            aux += prof.getSalario();
        }
        System.out.println("O total a ser pago pela escola, em salários, é de R$" + aux +"\n");
    }

    public void informarMediaHorasTrabalhadasHoristas(){
        int mediaHoras = 0;
        int numeroHoristas = 0;
        for(Professor prof : grupoProfessors){
            if(prof instanceof ProfessorHorista){
                mediaHoras += ((ProfessorHorista)prof).getHorasTrabalhadas();
                numeroHoristas++;
            }
        }
        mediaHoras = mediaHoras / numeroHoristas;
        System.out.println("Os professores horistas trabalham " + mediaHoras + " horas, em média.\n");
    }

    public void listarProfessoresDePortuguesMatematica(){
        for(Professor prof : grupoProfessors){
            if(prof.getDisciplina() == "Português" || prof.getDisciplina() == "Matemática"){
                System.out.println("Professor " + prof.getNome() + ", leciona " + prof.getDisciplina());
            }
        }
        System.out.println("\n");
    }

    public void listarProfessoresComMestradoOuDoutorado(){
        for(Professor prof : grupoProfessors){
            if(prof.getNivelEscolaridade() == "Mestrado" || prof.getNivelEscolaridade() == "Doutorado"){
                System.out.println("Professor " + prof.getNome() + ", possui escolaridade de nível " + prof.getNivelEscolaridade());
            }
        }
        System.out.println("\n");
    }
}

import java.util.Date;
import java.util.Calendar;

public class NatalFitness {
    private Funcionario funcionario = new Funcionario();

    public static void main(String[] args){
        System.out.println("TESTANDO O EXEC");
        Funcionario gerente = new Gerente("001", "Bernardo", 7500.00);
        Funcionario professor1 = new Professor("002", "Popeye", "Musculacao");
        Funcionario professor2 = new Professor("003", "Phelps", "Natacao");
        Funcionario professor3 = new Professor("004", "Arnold", "Musculacao");
        
        Calendar cal = Calendar.getInstance();
        cal.set(1990, 14, 8);
        Aluno aluno1 = new Aluno("Neymar", "543.126.611-07", cal);
        cal.set(1985, 31, 2);
        Aluno aluno2 = new Aluno("Marta", "812.066.317-25", cal);
        cal.set(2000, 14, 8);
        Aluno aluno3 = new Aluno("Joao", "083.681.469-09", cal);

        aluno1.addTreino("10:00 = Hipertrofia, 11:00 = Ergometria");
        aluno2.addTreino("08:00 = Nado de Costas, 07:00 = Nado Livre, 09:00 = Nado Borboleta");
        aluno3.addTreino("15:30 = Impulsão, 17:25 = Musculação, 18:45 = Vôlei");
        ((Professor)professor1).addAluno(aluno1);
        ((Professor)professor2).addAluno(aluno2);
        ((Professor)professor3).addAluno(aluno3);

        BancoDeDados bancoDeDados = new BancoDeDados();

        bancoDeDados.addFuncionario(gerente);
        bancoDeDados.addFuncionario(professor1);
        bancoDeDados.addFuncionario(professor2);
        bancoDeDados.addFuncionario(professor3);

        bancoDeDados.imprimeListaFuncionarios();
        bancoDeDados.imprimeListaAtividades();
        bancoDeDados.imprimeAlunos();

        ((Professor)professor1).removerAluno(aluno1);
        aluno2.removerTreino("08:00 = Nado de Costas, 07:00 = Nado Livre, 09:00 = Nado Borboleta");

        Funcionario professor4 = new Professor("005", "Bernardinho", "Vôlei");
        bancoDeDados.addFuncionario(professor4);

        bancoDeDados.imprimeListaFuncionarios();
        bancoDeDados.imprimeListaAtividades();
        bancoDeDados.imprimeAlunos();
    }
}

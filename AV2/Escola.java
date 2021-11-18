import java.time.LocalDate;

public class Escola {
    
    public static void main(String[] args){
        BancoDeDados bancoDeDados = new BancoDeDados();
        
        Professor horista1 = new ProfessorHorista();
        horista1.setNome("André Nascimento");
        horista1.setDisciplina("Matemática");
        horista1.setNumeroDependentes(3);
        horista1.setNivelEscolaridade("Superior");
        LocalDate dataNascimentoHorista1 = LocalDate.of(1980, 5, 10);
        horista1.setDataNascimento(dataNascimentoHorista1);
        ((ProfessorHorista)horista1).setHorasTrabalhadas(70);
        horista1.setSalario(1000);
        bancoDeDados.grupoProfessors.add(horista1);

        Professor horista2 = new ProfessorHorista();
        horista2.setNome("Guga");
        horista2.setDisciplina("Português");
        horista2.setNumeroDependentes(5);
        horista2.setNivelEscolaridade("Doutorado");
        LocalDate dataNascimentoHorista2 = LocalDate.of(1969, 4, 30);
        horista2.setDataNascimento(dataNascimentoHorista2);
        ((ProfessorHorista)horista2).setHorasTrabalhadas(100);
        horista2.setSalario(1000);
        bancoDeDados.grupoProfessors.add(horista2);

        Professor horista3 = new ProfessorHorista();
        horista3.setNome("Lucão");
        horista3.setDisciplina("FMC");
        horista3.setNumeroDependentes(1);
        horista3.setNivelEscolaridade("Doutorado");
        LocalDate dataNascimentoHorista3 = LocalDate.of(1991, 12, 2);
        horista3.setDataNascimento(dataNascimentoHorista3);
        ((ProfessorHorista)horista3).setHorasTrabalhadas(45);
        horista3.setSalario(1000);
        bancoDeDados.grupoProfessors.add(horista3);

        Professor integral1 = new ProfessorIntegral();
        integral1.setNome("Murilo Endres");
        integral1.setDisciplina("Matemática");
        integral1.setNumeroDependentes(2);
        integral1.setSalario(11000);
        LocalDate dataNascimentoIntegral1 = LocalDate.of(1973, 8, 14);
        integral1.setDataNascimento(dataNascimentoIntegral1);
        LocalDate dataEntradaEscolaIntegral1 = LocalDate.of(2010, 8, 14);
        ((ProfessorIntegral)integral1).setDataInicio(dataEntradaEscolaIntegral1);
        integral1.setNivelEscolaridade("Especialização");
        bancoDeDados.grupoProfessors.add(integral1);

        Professor integral2 = new ProfessorIntegral();
        integral2.setNome("Serginho");
        integral2.setDisciplina("Português");
        integral2.setNumeroDependentes(1);
        integral2.setSalario(8500);
        LocalDate dataNascimentoIntegral2 = LocalDate.of(1988, 1, 19);
        integral2.setDataNascimento(dataNascimentoIntegral2);
        LocalDate dataEntradaEscolaIntegral2 = LocalDate.of(2017, 8, 31);
        ((ProfessorIntegral)integral2).setDataInicio(dataEntradaEscolaIntegral2);
        integral2.setNivelEscolaridade("Mestrado");
        bancoDeDados.grupoProfessors.add(integral2);

        Professor integral3 = new ProfessorIntegral();
        integral3.setNome("Allan");
        integral3.setDisciplina("Redes");
        integral3.setNumeroDependentes(4);
        integral3.setSalario(12000);
        LocalDate dataNascimentoIntegral3 = LocalDate.of(1977, 7, 24);
        integral3.setDataNascimento(dataNascimentoIntegral3);
        LocalDate dataEntradaEscolaIntegral3 = LocalDate.of(2014, 12, 7);
        ((ProfessorIntegral)integral3).setDataInicio(dataEntradaEscolaIntegral3);
        integral3.setNivelEscolaridade("Doutorado");
        bancoDeDados.grupoProfessors.add(integral3);

        bancoDeDados.informarNumeroProfessores();
        bancoDeDados.informarProfessorDeMaiorSalario();
        bancoDeDados.informarProfessorMaisJovem();
        bancoDeDados.informarProfessorMaisAntigo();
        bancoDeDados.informarTotalSalarioPagoPelaEscola();
        bancoDeDados.informarMediaHorasTrabalhadasHoristas();
        bancoDeDados.listarProfessoresDePortuguesMatematica();
        bancoDeDados.listarProfessoresComMestradoOuDoutorado();
    }
}

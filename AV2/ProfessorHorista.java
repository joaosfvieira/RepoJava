public class ProfessorHorista extends Professor {
    private int horasTrabalhadas;

    public int getHorasTrabalhadas() {
        return this.horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    public void setSalario(double salario) {
        final int VALOR_HORA = 55;
        double aux = salario + (150 * numeroDependentes) + (VALOR_HORA * horasTrabalhadas);
        this.salario = aux;
    }
}

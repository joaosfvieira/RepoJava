import java.time.LocalDate;

public class ProfessorIntegral extends Professor {
    private LocalDate dataInicio;

    public LocalDate getDataInicio() {
        return this.dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setSalario(double salario) {
        double aux = salario + (150 * this.numeroDependentes);
        this.salario = aux;
    }
}

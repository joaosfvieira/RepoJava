import java.time.LocalDate;

public class Professor{
    private String nome;
    private String matricula;
    private LocalDate dataNascimento;
    protected double salario;
    private String nivelEscolaridade;
    private String disciplina;
    protected int numeroDependentes;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNivelEscolaridade() {
        return this.nivelEscolaridade;
    }

    public void setNivelEscolaridade(String nivelEscolaridade) {
        this.nivelEscolaridade = nivelEscolaridade;
    }

    public String getDisciplina() {
        return this.disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getNumeroDependentes() {
        return this.numeroDependentes;
    }

    public void setNumeroDependentes(int numeroDependentes) {
        this.numeroDependentes = numeroDependentes;
    }
}

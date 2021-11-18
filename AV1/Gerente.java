public class Gerente extends Funcionario {
    private double salario;

    public Gerente(String matricula, String nome, double salario){
        this.setMatricula(matricula);
        this.setNome(nome);
        this.setSalario(salario);
    }
    
    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}

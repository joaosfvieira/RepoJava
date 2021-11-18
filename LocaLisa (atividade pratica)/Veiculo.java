public class Veiculo {
    private String marca;
    private String modelo;
    private int numeroPlaca;
    private double valorAluguel;
    private boolean alugado;

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroPlaca() {
        return this.numeroPlaca;
    }

    public void setNumeroPlaca(int numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    public double getValorAluguel() {
        return this.valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public boolean getAlugado() {
        return this.alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }
}

public class Aluno {
    Prova prova1 = new Prova();
    Prova prova2 = new Prova();

    public void setProva1(Prova prova1) {
        this.prova1 = prova1;
    }
    public void setProva2(Prova prova2) {
        this.prova2 = prova2;
    }
    public Prova getProva1() {
        return prova1;
    }
    public Prova getProva2() {
        return prova2;
    }

    public double calcularMedia(){
        return ((prova1.calcularNotaTotal() + prova2.calcularNotaTotal()) / 2);
    }
}

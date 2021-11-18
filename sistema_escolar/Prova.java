public class Prova {
    //Atributos
    private double notaParte1;
    private double notaParte2;

    //Métodos setters
    public void setNotaParte1(double notaParte1){
        this.notaParte1 = notaParte1;
    }
    public void setNotaParte2(double notaParte2){
        this.notaParte2 = notaParte2;
    }
    //Métodos getters
    public double getNotaParte1(){
        return notaParte1;
    }
    public double getNotaParte2(){
        return notaParte2;
    }

    public double calcularNotaTotal(){
        return notaParte1 + notaParte2;
    }
}

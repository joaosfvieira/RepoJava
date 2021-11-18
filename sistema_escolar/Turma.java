import javax.swing.JOptionPane;

public class Turma{
    Aluno aluno1 = new Aluno();
    Aluno aluno2 = new Aluno();
    Aluno aluno3 = new Aluno();

    public void setAluno1(Aluno aluno1) {
        this.aluno1 = aluno1;
    }
    public void setAluno2(Aluno aluno2) {
        this.aluno2 = aluno2;
    }
    public void setAluno3(Aluno aluno3) {
        this.aluno3 = aluno3;
    }
    public Aluno getAluno1() {
        return aluno1;
    }
    public Aluno getAluno2() {
        return aluno2;
    }
    public Aluno getAluno3() {
        return aluno3;
    }

    public double calcularMedia(){
        return (aluno1.calcularMedia() + aluno2.calcularMedia() + aluno3.calcularMedia()) / 3;
    }

    public static void main(String[] args){
        Turma turma = new Turma();
        
        turma.aluno1.prova1.setNotaParte1(3.0);
        turma.aluno1.prova1.setNotaParte2(3.5);
        turma.aluno1.prova2.setNotaParte1(4.0);
        turma.aluno1.prova2.setNotaParte2(4.0);

        turma.aluno2.prova1.setNotaParte1(5.0);
        turma.aluno2.prova1.setNotaParte2(4.5);
        turma.aluno2.prova2.setNotaParte1(1.0);
        turma.aluno2.prova2.setNotaParte2(2.0);
        
        turma.aluno3.prova1.setNotaParte1(3.0);
        turma.aluno3.prova1.setNotaParte2(4.5);
        turma.aluno3.prova2.setNotaParte1(5.0);
        turma.aluno3.prova2.setNotaParte2(4.0);

        JOptionPane.showMessageDialog(null, "Media da turma: " + turma.calcularMedia() + "\n Medias individuais dos alunos:\n -Aluno 1: " + turma.aluno1.calcularMedia() +"\n-Aluno 2: " +turma.aluno2.calcularMedia() + "\n-Aluno 3: " + turma.aluno3.calcularMedia(), "Medias", JOptionPane.INFORMATION_MESSAGE);

        turma.calcularMedia();

    }
}

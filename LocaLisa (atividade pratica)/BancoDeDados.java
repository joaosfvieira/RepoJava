import java.util.ArrayList;

public class BancoDeDados {
    private ArrayList<Veiculo> grupoDeVeiculos = new ArrayList<Veiculo>();

    public ArrayList<Veiculo> getGrupoDeVeiculos(){
        return this.grupoDeVeiculos;
    }

    public void inserirVeiculo(Veiculo veiculo){
        grupoDeVeiculos.add(veiculo);
    }

    public void removerVeiculo(Veiculo veiculo){
        grupoDeVeiculos.remove(veiculo);
    }

    public void alugarVeiculo(Veiculo veiculo){
        int indice = grupoDeVeiculos.indexOf(veiculo);
        grupoDeVeiculos.get(indice).setAlugado(true);
    }

    public void exibirVeiculosCadastrados(){
        System.out.println(" == Veiculos Cadastrados na LocaLisa ==\n");
        for(int i=0; i<grupoDeVeiculos.size(); i++){
            System.out.println(grupoDeVeiculos.get(i).getMarca() + ", " + grupoDeVeiculos.get(i).getModelo());
        }
    }

    public void exibirVeiculosAlugadosLucro(){
        double lucroVeiculosAlugados = 0;
        System.out.println("\n\n == Veiculos ALUGADOS ==\n");
        for(int i=0; i<grupoDeVeiculos.size(); i++){
            if(grupoDeVeiculos.get(i).getAlugado()){
                lucroVeiculosAlugados += grupoDeVeiculos.get(i).getValorAluguel();
                System.out.println(grupoDeVeiculos.get(i).getMarca() + ", " + grupoDeVeiculos.get(i).getModelo());
            }
        }
        System.out.println("Valor a ser recebido pelos aluguéis: R$" + lucroVeiculosAlugados);
    }

    public void exibirVeiculosDisponiveisAluguel(){
        System.out.println("\n\n == Veiculos disponíveis para aluguel ==\n");
        for(int i=0; i<grupoDeVeiculos.size(); i++){
            if(!(grupoDeVeiculos.get(i).getAlugado())){
                System.out.println(grupoDeVeiculos.get(i).getMarca() + ", " + grupoDeVeiculos.get(i).getModelo() + ", Valor de Aluguel: R$" + grupoDeVeiculos.get(i).getValorAluguel());
            }
        }
    }

    public void exibirMaiorValorAluguel(){
        Veiculo maiorValor = new Veiculo();
        maiorValor.setValorAluguel(0);
        for(int i=0; i<grupoDeVeiculos.size(); i++){
            if(maiorValor.getValorAluguel() < grupoDeVeiculos.get(i).getValorAluguel()){
                maiorValor = grupoDeVeiculos.get(i);
            }
        }
        System.out.println("\nO veiculo de maior valor de aluguel é o " + maiorValor.getMarca() + ", " + maiorValor.getModelo() + " // ALUGUEL: R$" + maiorValor.getValorAluguel());
    }

    public void exibirMarcaComMaisCarros(){
        int contadorChevrolet = 0;
        int contadorFiat = 0;
        int contadorFord = 0;
        int contadorVolkswagen = 0;
        int contadorBmw = 0;

        ArrayList<Integer> contadoresDeMarcas = new ArrayList<Integer>();

        for(int i=0; i<grupoDeVeiculos.size(); i++){
            if(grupoDeVeiculos.get(i) instanceof Carro){
                switch(grupoDeVeiculos.get(i).getMarca()){
                    case "Chevrolet":
                    contadorChevrolet++;
                    break;
                    case "Fiat":
                    contadorFiat++;
                    break;
                    case "Ford":
                    contadorFord++;
                    break;
                    case "Volkswagen":
                    contadorVolkswagen++;
                    break;
                    case "Bmw":
                    contadorBmw++;
                    break;
                }
            }
        }

        contadoresDeMarcas.add(contadorChevrolet);
        contadoresDeMarcas.add(contadorFiat);
        contadoresDeMarcas.add(contadorFord);
        contadoresDeMarcas.add(contadorVolkswagen);
        contadoresDeMarcas.add(contadorBmw);

        int indiceAux = 0;
        int valorMaximoAux = 0;
        for(int i=0; i<contadoresDeMarcas.size(); i++){
            if(contadoresDeMarcas.get(i) > valorMaximoAux){
                valorMaximoAux = contadoresDeMarcas.get(i);
                indiceAux = i;
            }
        }
        System.out.println("\nA marca com maior número de carros na LocaLisa é: ");
        switch(indiceAux){
            case 0:
            System.out.println("Chevrolet");
            break;
            case 1:
            System.out.println("Fiat");
            break;
            case 2:
            System.out.println("Ford");
            break;
            case 3:
            System.out.println("Volkswagen");
            break;
            case 4:
            System.out.println("Bmw");
            break;
        }
    }
}

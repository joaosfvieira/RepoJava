public class LocaLisa {
    public static void main(String[] args){
        BancoDeDados bancoDeDados = new BancoDeDados();
        
        Veiculo primeiroCarro = new Carro();
        Veiculo segundoCarro = new Carro();
        Veiculo terceiroCarro = new Carro();
        Veiculo primeiraMoto = new Moto();
        Veiculo segundaMoto = new Moto();
        Veiculo terceiraMoto = new Moto();
        primeiroCarro.setMarca("Chevrolet");
        primeiroCarro.setModelo("Onix");
        primeiroCarro.setValorAluguel(225.0);
        segundoCarro.setMarca("Chevrolet");
        segundoCarro.setModelo("Camaro");
        segundoCarro.setValorAluguel(395.0);
        terceiroCarro.setMarca("Ford");
        terceiroCarro.setModelo("Ranger");
        terceiroCarro.setValorAluguel(305.0);
        primeiraMoto.setMarca("Suzuki");
        primeiraMoto.setModelo("v2");
        primeiraMoto.setValorAluguel(85.0);
        segundaMoto.setMarca("Kawasaki");
        segundaMoto.setModelo("Ninja");
        segundaMoto.setValorAluguel(120.0);
        terceiraMoto.setMarca("Bmw");
        terceiraMoto.setModelo("Braba");
        terceiraMoto.setValorAluguel(144.0);

        bancoDeDados.inserirVeiculo(primeiroCarro);
        bancoDeDados.inserirVeiculo(segundoCarro);
        bancoDeDados.inserirVeiculo(terceiroCarro);
        bancoDeDados.inserirVeiculo(primeiraMoto);
        bancoDeDados.inserirVeiculo(segundaMoto);
        bancoDeDados.inserirVeiculo(terceiraMoto);

        bancoDeDados.exibirVeiculosCadastrados();
        bancoDeDados.alugarVeiculo(segundoCarro);
        bancoDeDados.alugarVeiculo(terceiroCarro);
        bancoDeDados.alugarVeiculo(segundaMoto);
        

        bancoDeDados.exibirVeiculosAlugadosLucro();
        bancoDeDados.exibirVeiculosDisponiveisAluguel();
        bancoDeDados.exibirMaiorValorAluguel();
        bancoDeDados.exibirMarcaComMaisCarros();
    }
    
}

public class ContaBanco {
    double saldo = 100.0;

    public void sacar(double novoSaldo){ // veja que a variavel novoSaldo só existe nesse bloco de comando, caso seja executada fora dele, não irá funcionar
        saldo = saldo - novoSaldo;
    }

    public void depositar(double novoSaldo){
        saldo = saldo + novoSaldo;
    }

    public void imprimirSaldo(){
        System.out.println("Saldo atual: " + saldo);
    }
}

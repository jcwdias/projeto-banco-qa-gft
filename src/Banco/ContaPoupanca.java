package Banco;

public class ContaPoupanca extends Conta{

    public ContaPoupanca() {

    }

    @Override
    void infoConta(){
        System.out.println("");
        System.out.println("===== Conta Poupança =====");
        super.imprimirInfosComuns();
    }

}

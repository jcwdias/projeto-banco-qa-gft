package Banco;


public class Principal {
    public static void main(String[] args) {


        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        cc.depositar(1200);
        cc.transferir(300,cp);
        cc.infoConta();
        cp.infoConta();
        cp.sacar(500);
        cc.simulaEmprestimo();


    }
}





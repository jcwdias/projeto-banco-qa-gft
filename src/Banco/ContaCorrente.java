package Banco;

public class ContaCorrente extends Conta{

     public ContaCorrente() {

     }

     @Override
     void infoConta(){
          System.out.println("");
          System.out.println("===== Conta Corrente =====");
          super.imprimirInfosComuns();
     }



}

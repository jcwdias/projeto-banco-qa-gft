package Banco;

import java.util.Scanner;

public abstract class Conta {
    Scanner scan = new Scanner(System.in);

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    public Conta(){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;

    }

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected String titular;

    void sacar(double valor){
        System.out.println("");
        if(valor<=saldo) {
            saldo -= valor;
        }   else {
            System.out.println("====== Saldo Insuficiente ======");
        }
    }

    void depositar(double valor){
        saldo += valor;
    }

    void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfosComuns(){
        System.out.println("Agência: "+this.agencia);
        System.out.println("Número da conta: "+this.numero);
        System.out.printf("Saldo: %.2f%n", this.saldo);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    abstract void infoConta();

    protected void simulaEmprestimo(){
        System.out.println("");
        System.out.println("===== Simulação de empréstimo =====");
        System.out.println("Informe o valor do empréstimo: ");
        double valor = scan.nextDouble();
        System.out.println("Informe em quantas parcelas o pagamento será realizado:");
        double parcelas = scan.nextInt();
        double valorParcela = (valor/parcelas)+(1000*(parcelas/200));
        double totalPagar = valorParcela*parcelas;
        System.out.printf("São %.0f",parcelas);
        System.out.printf(" parcelas de: R$%.2f",valorParcela);
        System.out.printf(", totalizando R$%.2f", totalPagar);
    }
}

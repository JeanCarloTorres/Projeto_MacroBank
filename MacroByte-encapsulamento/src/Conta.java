/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jeans
 */
public class Conta {

    private double saldo = 100;
    private int agencia = 78;
    private int numero;
    private Cliente titular;
    private static int total;
    
    public Conta(int agencia, int numero){
        Conta.total++;
        System.out.println("O total de contas é: "+ Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estou criando uma conta "+ this.numero);
    }

    //Quando não existe qualquer tipo de retorno ao acionarmos um método, utilizamos a palavra-chave void
    public void deposita(double valor) {

        //Queremos que saldo seja relacionado à conta que está evocando o método deposita(), para isso, faremos uso da palavra-chave this
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
        

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }
        
        public double getSaldo(){
            return this.saldo;
            
        }
        
        public int getNumero(){
            return this.numero;
        }
        
        public void setNumero(int numero){
            if(numero <= 0){
                System.out.println("Erro não pode valor menor igual a 0");
                return;
            }
            this.numero = numero;
            
        }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0 ){
            System.out.println("Não pode valor menor igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }
        
    
    public static int getTotal(){
        return Conta.total;
    }
        
        

    }


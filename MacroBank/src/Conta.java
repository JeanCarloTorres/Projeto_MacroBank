/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jeans
 */
public class Conta {

    double saldo;
    int agencia = 78;
    int numero;
    String titular;

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
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jeans
 */
public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);
        
        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);
        
        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;
        
        System.out.println("O saldo da primeira conta é " + primeiraConta.saldo);
        System.out.println("O saldo da seguna conta é " + segundaConta.saldo);
        
        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);
        
        System.out.println(segundaConta.agencia);
        
        segundaConta.agencia = 1234;
        System.out.println("Agencia da segunda conta alterada para " + segundaConta.agencia);
    }
}

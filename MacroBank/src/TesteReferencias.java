/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jeans
 */
public class TesteReferencias {
    
    public static void main(String[] args){
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;
        
        System.out.println("Saldo da primeira conta: "+ primeiraConta.saldo);
        
        Conta segundaConta = primeiraConta;
        
        System.out.println("Saldo da segunda conta: "+ segundaConta.saldo);
        
        segundaConta.saldo += 100;
        System.out.println("Saldo da segunda conta: "+ segundaConta.saldo);
        
        System.out.println(primeiraConta.saldo);
        
        if(primeiraConta == segundaConta) {
            System.out.println("São a mesma conta");
        }
                
                
    }
    
}

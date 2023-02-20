/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jeans
 */
public class TestaContaSemCliente {
    
    public static void main(String[] args){
        Conta contaDoUsuario = new Conta();
        System.out.println(contaDoUsuario.getSaldo());
        
        contaDoUsuario.titular = new Cliente();
        System.out.println(contaDoUsuario.titular);
        
        contaDoUsuario.titular.nome = "Barbara";
        System.out.println(contaDoUsuario.titular.nome);
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jeans
 */
public class TestaValores {
    public static void main(String[] args) {
        
        Conta conta = new Conta(1234, 2468);
       
        System.out.println(conta.getAgencia());
        
        conta.setAgencia(123456);
        
        Conta conta2 = new Conta(1234, 36912);
        
        System.out.println(Conta.getTotal());
        
        
    }
}

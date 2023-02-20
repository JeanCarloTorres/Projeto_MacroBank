/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jeans
 */
public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(1234, 2468);
        
        System.out.println(conta.getNumero());
        
        Cliente jean = new Cliente();
        //conta.titular = "jean";
        jean.setNome("Jean Carlo");
        conta.setTitular(jean);
        System.out.println(conta.getTitular().getNome());
        
        
        conta.getTitular().setProfissao("Designer");
        //agora em duas linhas:
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("Designer");
        
        System.out.println(titularDaConta);
        System.out.println(jean);
        System.out.println(conta.getTitular());
        
    }
}

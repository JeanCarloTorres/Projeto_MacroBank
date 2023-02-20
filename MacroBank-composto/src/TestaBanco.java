/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jeans
 */
public class TestaBanco {
    public static void main(String[] args){
        Cliente Jean = new Cliente();
        Jean.nome = "Jean Carlo";
        Jean.cpf = "222.222.222-22";
        Jean.profissao = "Designer/programador";
        
        Conta minhaConta = new Conta();
        minhaConta.deposita(500);
        
        minhaConta.titular = Jean;
        System.out.println(minhaConta.titular.nome);
        System.out.println(minhaConta.titular);
    }
}

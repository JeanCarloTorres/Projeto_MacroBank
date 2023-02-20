/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jeans
 */
public class TestaMetodo {
    public static void main(String[] args){
        
        //nomeDaReferencia.nomeDoMetodo();
        Conta minhaConta = new Conta();
        minhaConta.saldo = 100;
        minhaConta.deposita(50);
        System.out.println(minhaConta.saldo);
        
        boolean conseguiuRetirar = minhaConta.saca(20);
        System.out.println(minhaConta.saldo);
        System.out.println(conseguiuRetirar);
        
        Conta outraConta = new Conta();
        outraConta.deposita(1000);
        
        boolean TransferidoComSucesso = 
                outraConta.transfere(300, minhaConta);
        if(TransferidoComSucesso){
            System.out.println("Transferencia com sucesso");
        }else{
            System.out.println("Saldo insuficiente");
        }
        System.out.println(outraConta.saldo);
        System.out.println(minhaConta.saldo);
        
        minhaConta.titular = "Jean Carlo";
        System.out.println(minhaConta.titular);
    }
}

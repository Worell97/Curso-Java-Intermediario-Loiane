/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.java.intermediario.Aula61;

/**
 *
 * @author worel
 */
public class PassagemParametroValorReferencia {
    public static void main(String[] args) {
        Contato contato = new Contato("Contato 1", "1234-1234", "contato@email.com");
        int valor = 10;
        
        System.out.println(contato);
        System.out.println(valor);
        
        testePassagemValorReferencia(valor, contato);
        System.out.println(contato);
        System.out.println(valor);
        
        testePassagemValorReferencia2(valor, contato);
        System.out.println(contato);
        System.out.println(valor);
    }
    
    private static void testePassagemValorReferencia(int valor, Contato contato){
        int novoValor = valor + 10;
        valor = novoValor;
        
        contato = new Contato("Contato 2", "1233-2232", "contato2@email.com");
        
    }
    
    private static void testePassagemValorReferencia2(int valor, Contato contato){
        int novoValor = valor + 10;
        valor = novoValor;
        
        contato.setNome("Contato"+novoValor);
        
    }
}

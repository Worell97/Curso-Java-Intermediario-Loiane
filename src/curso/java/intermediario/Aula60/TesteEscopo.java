/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.java.intermediario.Aula60;

/**
 *
 * @author worel
 */
public class TesteEscopo {
    public static void main(String[] args) {
        EscopoVariaveis escopo = new EscopoVariaveis();
        
        escopo.setValor(10);
        
        System.out.println(escopo.getValor());
        System.out.println(escopo.calculaValor(20));
        System.out.println(escopo.getValor());
    }
}

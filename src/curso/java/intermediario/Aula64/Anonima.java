/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.java.intermediario.Aula64;

/**
 *
 * @author worel
 */
public class Anonima {
    public void imprimeTexto(){
        System.out.println("Qualquer texto");
    }
    
    
    public void imprimeOutroTexto(){
        System.out.println("Qualquer texto");
    }
    
    public static void main(String[] args) {
        Anonima anonima = new Anonima(){
            @Override
            public void imprimeTexto(){
                System.out.println("Texto anonimo");
            }
        };
        
        anonima.imprimeTexto();
    }    
}

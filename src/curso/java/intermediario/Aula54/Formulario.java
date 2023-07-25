/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.java.intermediario.Aula54;

/**
 *
 * @author worel
 */
public class Formulario {
    enum Genero{
        FEMININO('f'), MASCULINO('m');
        
        private char valor;
        
        Genero(char valor){
            this.valor = valor;
        }
    }
    
    private String nome;
    private Genero genero;
    
}

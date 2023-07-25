/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.java.intermediario.Aula54;

/**
 *
 * @author worel
 */
public class Teste {
    public static void main(String[] args) {
        DiaSemana dia = DiaSemana.DOMINGO;
        System.out.println(dia.toString()+" - "+dia.getValor());
        
        Data data = new Data(1, 4, 2016, DiaSemana.SEXTA);
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.java.intermediario.Aula55;

import curso.java.intermediario.Aula54.DiaSemana;

/**
 *
 * @author worel
 */
public class Teste {
    public static void main(String[] args) {
        DiaSemana[] dias = DiaSemana.values();
        
        for (int i = 0; i < dias.length; i++) {
            System.out.println(dias[i]);
        }
        
        for(DiaSemana dia: DiaSemana.values()){
            System.out.println(dia);
        }
        System.out.println();
        System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));
    }
}

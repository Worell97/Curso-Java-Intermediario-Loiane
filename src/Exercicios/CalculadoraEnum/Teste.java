/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios.CalculadoraEnum;

/**
 *
 * @author worel
 */
public class Teste {
    public static void main(String[] args) {
        double resultado = 0;
        for(Operacoes operacao: Operacoes.values()){
            resultado = operacao.executarOperacao(8, 2);
            System.out.println("8" + operacao.getValue() + "2" + " = " + resultado);
        }
    }
}

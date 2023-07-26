/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Exercicios.CalculadoraEnum;

/**
 *
 * @author worel
 */
public enum Operacoes {
    SOMA("+") {
        @Override
        public double executarOperacao(double x, double y) {
            return x + y;
        }
    }, SUBTRACAO("-") {
        @Override
        public double executarOperacao(double x, double y) {
            return x - y;
        }
    }, MULTIPLICACAO("*") {
        @Override
        public double executarOperacao(double x, double y) {
            return x * y;
        }
    }, DIVISAO("/") {
        @Override
        public double executarOperacao(double x, double y){
            return (x / y);
        }
    };
    
    private String operacao;

    private Operacoes(String operacao) {
        this.operacao = operacao;
    }
    
    public String getValue(){
        return operacao;
    };
    
    public abstract double executarOperacao(double x, double y);
}

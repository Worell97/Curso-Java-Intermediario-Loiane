/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.java.intermediario.Aula62;

/**
 *
 * @author worel
 */
public class ExemploVarargs {
    public static void main(String[] args) {
        System.out.println(soma(1, 2));
        System.out.println(soma(1, 2, 3));
        
        int[] vetor = {1, 2, 3, 4, 5};
        
        System.out.println(soma(vetor));
        System.out.println(soma(1, 2, 3, 4, 5, 6, 7, 8));
    }
    
    static int soma(int a, int b){
        return a+b;
    }
    
    static int soma(int a, int b, int c){
        return a+b;
    }
    
    static int soma(int[] a){
        int resultado = 0;
        for (int i = 0; i < a.length; i++) {
            resultado += a[i];
        }
        return resultado;
    }
    
    static int soma(int a, int b, Integer... items){
        int resultado = 0;
        for (int i: items) {
            resultado += i;
        }
        return resultado;
    }
    
    
}

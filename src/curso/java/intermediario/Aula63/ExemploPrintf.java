/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.java.intermediario.Aula63;

/**
 *
 * @author worel
 */
public class ExemploPrintf {
    public static void main(String[] args) {
        System.out.printf("Hello %s %s", "World", "teste");
        System.out.println();
        System.out.printf("Hello %s%S", "World", "teste");
        System.out.println();
        System.out.printf("Hello %c", 'c');
        System.out.println();
        System.out.printf("Hello %C", 'c');
        System.out.println();
        System.out.printf("Hello %n %C %n", 'c');
        int valor = 123456789;
        System.out.printf("%d%n", valor);
        
        double pontoFlutuante = 3.42523999;
        System.out.printf("%f%n", pontoFlutuante);
        String olaMundo = "Olá, mundo!";
        System.out.printf("%20s%n", olaMundo);
        System.out.printf("%-20s%n", olaMundo);
        
        System.out.printf("%+d %n", valor);
        
        System.out.printf("%+015d %n", valor);
        System.out.printf("%,d %n", valor);
        
        int valor2 = -123456789;
        System.out.printf("% d %n", valor2);
        System.out.printf("R$%10.2f %n", pontoFlutuante);
        testeMaiscompleto();
    }
    
    private static void testeMaiscompleto(){
        double[] precos = {10000, 123.54, 231323.231312, 1, 4.56789};
        
        for(int i = 0; i < precos.length; i++){
            System.out.printf("%s %02d: total de R$%,15.2f %n", "Item", i+1, precos[i]);
        }
    }
}

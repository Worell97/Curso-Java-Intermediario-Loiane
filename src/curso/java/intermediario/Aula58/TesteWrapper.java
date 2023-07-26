/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.java.intermediario.Aula58;

/**
 *
 * @author worel
 */
public class TesteWrapper {
    public static void main(String[] args) {
        //autoboxing
        Short num1 = 1;
        Byte num2 = 10;
        Integer num9 = 100;
        Long num10 = 100l;
        Float num11 = 3.5f;
        Double num12 = 2.55555;
        Boolean flag2 = true;
        Character f = 'f';
        int num13 = num9;
        
        num9++;
        System.out.println(num9);
        
        Integer num14 = num13/num9;
        
        Double a, b, c;
        a = 10.0;
        b = 12.2;
        c = 4.7;
        Double media = (a + b + c) / 3;
        System.out.println(media);
    }
}

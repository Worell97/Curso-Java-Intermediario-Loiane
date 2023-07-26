/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.java.intermediario.Aula57;

/**
 *
 * @author worel
 */
public class TesteWrapper {
    public static void main(String[] args) {
        short num1 = 1;
        byte num2 = 10;
        int num3 = 100;
        long num4 = 10000l;
        float num5 = 0.5f;
        double num6 = 3.55555;
        boolean flag = true;
        char a = 'a';
        
        Short num7 = new Short(num1);
        Byte num8 = new Byte(num2);
        Integer num9 = new Integer(num3);
        Long num10 = new Long(num4);
        Float num11 = new Float(3.5f);
        Double num12 = new Double(3.5555);
        Boolean flag2 = new Boolean(true);
        Character b = new Character('b');
        Integer num13 = new Integer("100");
        
        //se o computador estiver em pt-br vai dar erro de conversão pois deve-se usar virgula
        Double num14 = new Double("3.5");
        
        System.out.println(num13.intValue());
        
        int num16 = Integer.parseInt("1000000");
        System.out.println(num16);
        
        double num17 =  Double.parseDouble("3.55555");
        System.out.println(num17);
        
        Integer num18 = Integer.valueOf(1343);
        
        System.out.println(num18);
        System.out.println(num9 == num13);
    }
}

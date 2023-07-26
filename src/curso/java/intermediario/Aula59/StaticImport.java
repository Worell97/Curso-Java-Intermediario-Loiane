/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.java.intermediario.Aula59;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
// não importar tudo a menos que vá utilizar tudo
//import static java.lang.Math.*;

/**
 *
 * @author worel
 */
public class StaticImport {
    public static void main(String[] args) {
        double a = 2;
        double b = 3;
        double c = 4;
        
        System.out.println(pow(a, b));
        System.out.println(sqrt(c));
        System.out.println(pow(a, b));
    }
}

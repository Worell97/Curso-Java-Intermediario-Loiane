/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.java.intermediario.Aula65;

/**
 *
 * @author worel
 */
@interface Annotations {
    String autor();
    int aulaNumero();

    String site() default "https://oscar-iota.vercel.app";
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.java.intermediario.Aula01;

/**
 *
 * @author worel
 */
public class Teste {
    public static void main(String[] args) {
        
    }
    
    private static void usandoConstantes(){
        int segunda = DiasSemanaConstantes.SEGUNDA;
        int terca = DiasSemanaConstantes.TERCA;
        int quarta = DiasSemanaConstantes.QUARTA;
        int quinta = DiasSemanaConstantes.QUINTA;
        int sexta = DiasSemanaConstantes.SEXTA;
        int sabado = DiasSemanaConstantes.SABADO;
        int domingo = DiasSemanaConstantes.DOMINGO;
        
        System.out.println("Teste utilizando constantes no Java");   
        imprimeDiaSemana(segunda);
        imprimeDiaSemana(terca);
        imprimeDiaSemana(quarta);
        imprimeDiaSemana(quinta);
        imprimeDiaSemana(sexta);
        imprimeDiaSemana(sabado);
        imprimeDiaSemana(domingo);
    }
    
    public static void imprimeDiaSemana(int dia){
        switch (dia) {
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sexta");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                throw new AssertionError();
        }
    }
}

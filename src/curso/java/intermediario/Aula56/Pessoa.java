/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.java.intermediario.Aula56;

/**
 *
 * @author worel
 */
public class Pessoa {
    private String nome;
    private TipoDocumento tipoDocumento;
    private String numeroDocumento;

    public Pessoa() {
    }

    public Pessoa(String nome, TipoDocumento tipoDocumento, String numeroDocumento) {
        this.nome = nome;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    @Override
    public String toString() {
        
        return nome + " - " + tipoDocumento.toString() + " - " + numeroDocumento;
    }
    
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soft_class;

/**
 *
 * @author GUSTAVO
 */
public class Produtos {
    
    private String codigo = "";
    private String nome = "";
    private String valor = "";
    private String fornecedor = "";
    private String estoque = "";

    public Produtos() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getEstoque() {
        return estoque;
    }

    public void setEstoque(String estoque) {
        this.estoque = estoque;
    }
            
}

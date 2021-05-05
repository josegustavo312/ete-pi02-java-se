/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soft_class;

import java.sql.Date;

/**
 *
 * @author GUSTAVO
 */
public class Venda {
    
    private int idvenda;
    private String cliente = "";
    private String produto = "";
    private Double quantidade;
    private Double desconto;
    private Double valor;
    private Date data;
    private Double total;

    public int getIdvenda() {
        return idvenda;
    }

    public void setIdvenda(int idvenda) {
        this.idvenda = idvenda;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
}

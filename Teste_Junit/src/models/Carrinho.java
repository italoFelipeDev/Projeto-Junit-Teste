package models;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    public Carrinho(String usuario) {
        this.usuario = usuario;
    }

    public Carrinho() {
    }

    private String usuario;

    private List<Produto> produtos = new ArrayList<>();

    private Double total = 0.0;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}

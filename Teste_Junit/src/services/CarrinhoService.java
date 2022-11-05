package services;

import models.Carrinho;
import models.Produto;

public class CarrinhoService {

    public static void addProduto (Carrinho carrinho, Produto produto){
        carrinho.getProdutos().add(produto);
        carrinho.setTotal(carrinho.getTotal() + produto.getPreco());
    }

    public static void removeProduto (Carrinho carrinho, Produto produto){
        carrinho.getProdutos().remove(produto);
    }
}

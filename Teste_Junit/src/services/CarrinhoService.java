package services;

import models.Carrinho;
import models.Produto;

import java.util.Objects;

public class CarrinhoService {

    public static void addProduto (Carrinho carrinho, Produto produto){
        if(Objects.isNull(produto) || Objects.isNull(carrinho)){
            throw new IllegalStateException("Produto ou carrinho é nulo");
        }
        carrinho.getProdutos().add(produto);
        carrinho.setTotal(carrinho.getTotal() + produto.getPreco());
    }

    public static void removeProduto (Carrinho carrinho, Produto produto){
        carrinho.getProdutos().remove(produto);
        carrinho.setTotal(carrinho.getTotal() - produto.getPreco());
    }
}

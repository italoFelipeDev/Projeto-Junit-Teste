package services;

import models.Carrinho;
import models.Produto;

public class CarrinhoService {

    private static CarrinhoService instance = null;

    private CarrinhoService(){}

    public static CarrinhoService getInstance(){
        if(instance == null){
            instance = new CarrinhoService();
        }
        return instance;
    }

    public static void addProduto (Carrinho carrinho, Produto produto){
        carrinho.getProdutos().add(produto);
        carrinho.setTotal(carrinho.getTotal() + produto.getPreco());
    }

    public static void removeProduto (Carrinho carrinho, Produto produto){
        carrinho.getProdutos().remove(produto);
    }
}

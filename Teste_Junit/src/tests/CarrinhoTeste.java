package tests;

import models.Carrinho;
import models.Produto;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CarrinhoTeste {

    public CarrinhoTeste() {
    }

    @Test
    public void testSetAndGetUsuario(){
        Carrinho carrinho = new Carrinho();
        carrinho.setUsuario("Morgana");

        assertEquals("Morgana", carrinho.getUsuario());
    }

    @Test
    public void testSetAndGetProdutos(){
        Carrinho carrinho = new Carrinho("Mario");
        Produto produto = new Produto("Leite", "1", 5.0);
        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto);

        carrinho.setProdutos(produtos);

        assertEquals(produtos, carrinho.getProdutos());
    }
}

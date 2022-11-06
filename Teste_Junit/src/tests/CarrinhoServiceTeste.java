package tests;

import models.Carrinho;
import models.Produto;
import org.junit.Test;
import services.CarrinhoService;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CarrinhoServiceTeste {

    public CarrinhoServiceTeste() {
    }

    @Test
    public void testAddProdutoSucesso(){
        System.out.println("Teste da funcao adicionar produto com sucesso:");
        Carrinho carrinho = new Carrinho("user");
        Produto produto = new Produto("Leite", "1", 5.0);

        CarrinhoService.addProduto(carrinho,produto);
        assertEquals(1, carrinho.getProdutos().size());
    }

    @Test
    public void testAddProdutoFalha(){
        System.out.println("Teste da funcao adicionar produto com falha:");
        Carrinho carrinho = new Carrinho("user");

        assertThrows(IllegalStateException.class,() -> CarrinhoService.addProduto(carrinho,null));
    }

    @Test
    public void testRemoveProduto(){
        System.out.println("Teste da funcao remover produto com sucesso:");
        Carrinho carrinho = new Carrinho("user");
        Produto produto = new Produto("Leite", "1", 5.0);
        Produto produto2 = new Produto("Vaso", "2", 15.0);

        CarrinhoService.addProduto(carrinho,produto);
        CarrinhoService.addProduto(carrinho,produto2);

        CarrinhoService.removeProduto(carrinho,produto);
        assertEquals(1, carrinho.getProdutos().size());
    }
}

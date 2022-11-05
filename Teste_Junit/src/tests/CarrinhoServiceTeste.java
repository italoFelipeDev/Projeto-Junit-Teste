package tests;

import models.Carrinho;
import models.Produto;
import org.junit.Test;
import services.CarrinhoService;

import static org.junit.Assert.assertEquals;

public class CarrinhoServiceTeste {

    public CarrinhoServiceTeste() {
    }

    @Test
    public void testAddProduto(){
        System.out.println("Teste da funcao testar:");
        Carrinho carrinho = new Carrinho("user");
        Produto produto = new Produto("Leite", "1", 5.0);

        CarrinhoService.addProduto(carrinho,produto);
        assertEquals(1, carrinho.getProdutos().size());
    }
}

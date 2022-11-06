package tests;

import models.Produto;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProdutoTeste {

    @Test
    public void testSetAndGetNome(){
        Produto produto = new Produto();
        produto.setNome("Test");

        assertEquals("Test", produto.getNome());
    }

    @Test
    public void testSetAndGetCodigo(){
        Produto produto = new Produto();
        produto.setCodigo("Test");

        assertEquals("Test", produto.getCodigo());
    }
    @Test
    public void testSetAndGetPreco(){
        Produto produto = new Produto();
        produto.setPreco(20.54);

        assertEquals("20.54", produto.getPreco().toString());
    }

}

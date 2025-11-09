package com.loja.grasp;

/*
 * PADRAO GRASP APLICADO: Controller
 * 
 * Qual padrao foi utilizado?
 * Controller
 * 
 * Em qual classe/metodo foi aplicado?
 * Classe CarrinhoController
 * Metodos adicionarProdutoAoCarrinho() e verTotalDoCarrinho()
 * 
 * Por que essa escolha atende ao principio GRASP?
 * A classe atua como intermediaria entre a interface do usuario e a logica de negocio,
 * delegando as requisicoes para os objetos corretos. Isso promove baixo acoplamento
 * pois a interface nao precisa conhecer detalhes internos do CarrinhoDeCompras.
 */
public class CarrinhoController {
    private CarrinhoDeCompras carrinho;

    public CarrinhoController() {
        this.carrinho = new CarrinhoDeCompras();
    }

    public void adicionarProdutoAoCarrinho(Produto produto, int quantidade) {
        carrinho.adicionarItem(produto, quantidade);
    }

    public double verTotalDoCarrinho() {
        return carrinho.calcularTotal();
    }
}

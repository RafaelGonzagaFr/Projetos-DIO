package Negocio;

import java.util.List;

import Entidades.Cliente;
import Entidades.Cupom;
import Entidades.Pedido;
import Entidades.Produto;

public class Banco {
    private List<Produto> produtos;
    private List<Pedido> pedidos;
    private List<Cupom> cupons;
    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public List<Cupom> getCupons() {
        return cupons;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void adicionarProduto(Produto produto){

    }

    public void removerProduto(int posicao){

    }

    public void adicionarPedido(Pedido pedido) {

    }

    public void removerPedido(int posicao){

        
    }
}

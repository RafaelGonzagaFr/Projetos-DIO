package Utilidades;

import java.util.Scanner;

import Entidades.Caderno;
import Entidades.Livro;
import Entidades.Pedido;
import Negocio.Banco;

public class LeitoraDados {
    private Scanner scanner;

    public String lerDado(){
        return "";
    }

    public Livro lerLivro(){
        return new Livro();
    }

    public Caderno lerCaderno(){
        return new Caderno();
    }

    public Pedido lerPedido(){
        return new Pedido();
    }

    public void/*Optional */ lerCupom(Banco banco){
    
    }
}
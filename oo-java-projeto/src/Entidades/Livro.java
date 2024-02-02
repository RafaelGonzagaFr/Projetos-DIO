package Entidades;
public class Livro extends Produto {
    private String nome;

    private Genero genero;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setTipo(Genero genero) {
        this.genero = genero;
    }
}

package Livro;

import Autor.Autor;
import java.util.Date;

public class Livro {
    private Integer id;
    private String titulo;
    private Autor autor;
    private Boolean disponivel;
    private Date dataCadastro;
    private Date dataAtualizacao;

    public Livro(Integer id, String titulo, Autor autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
        this.dataCadastro = new Date();
    }

    @Override
    public String toString() {
        return "Livro: {id=" + id + ", titulo='" + titulo + "', autor=" + autor.getNome() + "}";
    }
}

package Livro;

import java.util.Date;

public class Livro {
    private Integer id;
    private String titulo;
    private String autor;
    private Boolean disponivel;
    private Date dataCadastro;
    private Date dataAtualizacao;

    public Livro(Integer id, String titulo, String autor, Boolean disponivel) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
        this.dataCadastro = new Date();
    }
}

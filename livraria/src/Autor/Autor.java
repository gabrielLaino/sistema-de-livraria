package Autor;

import java.util.Date;

public class Autor {
    private Integer id;
    private String nome;
    private Date dataNascimento;

    public Autor (Integer id, String nome, Date dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
}

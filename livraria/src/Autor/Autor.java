package Autor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Autor {
    private Integer id;
    private String nome;
    private LocalDate dataNascimento;

    public Autor (Integer id, String nome, String dateNascimento) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(dateNascimento, formatter);
        this.id = id;
        this.nome = nome;
        this.dataNascimento = data;
    }

    public String getNome() {
        return nome;
    }
}

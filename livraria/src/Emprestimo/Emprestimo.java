package Emprestimo;

import Livro.Livro;

import java.time.LocalDate;

public class Emprestimo {
    private Livro livro;
    private String nomePessoa;
    private LocalDate dataEmprestimo;

    Emprestimo (Livro livro, String nomePessoa) {
        this.livro = livro;
        this.nomePessoa = nomePessoa;
        this.dataEmprestimo = LocalDate.now();
    }
}

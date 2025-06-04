package Biblioteca;

import Autor.Autor;
import Livro.Livro;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros= new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();

    public Biblioteca (List<Livro> livros, List<Autor> aurotes) {
        this.livros = livros;
        this.autores = aurotes;
    }

    public void imprimeLivros() {
        System.out.println(this.livros);
    }
}

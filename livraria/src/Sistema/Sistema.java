package Sistema;

import Autor.Autor;
import Biblioteca.Biblioteca;
import Livro.Livro;
import java.util.Arrays;
import java.util.List;

public class Sistema {
    public static void main(String[] args) {
        Autor autor1 = new Autor(1, "Gabriel", "17/08/1998");
        Livro livro1 = new Livro(1, "Memorias", autor1);
        Livro livro2 = new Livro(2, "Postumas", autor1);

        List<Autor> autores = Arrays.asList(autor1);
        List<Livro> livors = Arrays.asList(livro1, livro2);

        Biblioteca minhaBiblioteca = new Biblioteca(livors, autores);

        minhaBiblioteca.imprimeLivros();
    }
}

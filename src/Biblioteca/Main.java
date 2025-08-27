package Biblioteca;

public class Main {
    public static void main(String[] args){
        Livro livro1 = new Livro("O senhor dos anéis", "1954", "J.R.R Tolkien");
        Revista revista1 = new Revista("Ciência Hoje", "2022", 45);

        livro1.exibirInfo();
        revista1.exibirInfo();

        livro1.emprestar();
        livro1.emprestar();
        livro1.devolver();
    }
}

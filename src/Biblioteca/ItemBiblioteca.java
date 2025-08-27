package Biblioteca;

abstract class ItemBiblioteca {
    private String titulo;
    private String anoPublicacao;

    public ItemBiblioteca(String titulo, String anoPublicacao){
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAnoPublicacao(){
        return anoPublicacao;
    }

    abstract void exibirInfo();
}

interface Emprestavel{
    void emprestar();
    void devolver();
}

class Livro extends ItemBiblioteca implements Emprestavel{
    private String autor;
    private boolean emprestado;
    public Livro(String titulo, String anoPublicacao, String autor){
        super(titulo, anoPublicacao);
        this.autor = autor;
        this.emprestado = false;
    }

    @Override
    public void exibirInfo(){
        System.out.println("Livro: " + getTitulo() + " Autor " + autor + " Ano publicação " + getAnoPublicacao());
    }

    @Override
    public void emprestar(){
        if(!emprestado){
            emprestado = true;
            System.out.println("Livro " + getTitulo() + " emprestado com sucesso!");
        }
        else{
            System.out.println("Livro " + getTitulo() + " já foi emprestado!");
        }
    }

    @Override
    public void devolver(){
        if(emprestado){
            System.out.println("Livro " + getTitulo() + " devolvido com sucesso!");
        }
        else{
            System.out.println("Livro " + getTitulo() + " não foi emprestado!");
        }
    }
}

class Revista extends ItemBiblioteca{
    private int edicao;
    public Revista(String titulo, String anoPublicacao, int edicao){
        super(titulo, anoPublicacao);
        this.edicao = edicao;

    }

    public void exibirInfo(){
        System.out.println("Revista: " + getTitulo() + " Edição " + edicao + " Ano publicação " + getAnoPublicacao());
    }
}

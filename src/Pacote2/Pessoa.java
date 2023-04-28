package Pacote2;

public class Pessoa {
    public static String nome;
    public static int qtdLivrosLidos;
    public static Livro livro;
    
    

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public static int getQtdLivrosLidos(int qtdLivrosLidos) {
        return qtdLivrosLidos;
    }
    public void setQtdLivrosLidos(int qtdLivrosLidos) {
        this.qtdLivrosLidos = qtdLivrosLidos;
    }


    public static String getLivro(String string) {
        return string;
    }
    public static void setLivro(Livro livro) {
        Pessoa.livro = livro;
    }
    


}

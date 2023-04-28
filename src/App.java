import java.util.Scanner;

import Pacote2.Pessoa;
import Pacote2.Livro;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Livro lvr = new Livro();
        Pessoa pss = new Pessoa();

        /* Limpa o terminal */
        System.out.print("\033[H\033[2J");
        System.out.flush();
        /* Limpa o terminal */



        System.out.println("Izabel, qual livro você leu?");
        System.out.println("\nEu li o livro : " + Livro.getNomeLivro(sc.nextLine()));
        
        System.out.println("\nQuantas páginas tinha o livro? ");
        System.out.println("O livro tinha: " + Livro.getNumeroPaginas(sc.nextInt()));



        System.out.println("\nAgora, Izabel, quantos livros você já lêu?");
        System.out.println("\nEu já li " + Pessoa.getQtdLivrosLidos(sc.nextInt()));

        System.out.println("\nE entre todos os que você já leu, qual é o que mais gostou?");
        System.out.println("\nO que eu mais gostei foi " + Pessoa.getLivro(sc.nextLine()));
        
        
        

        
        
    }
}

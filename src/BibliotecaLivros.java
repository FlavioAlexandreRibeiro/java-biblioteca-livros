import java.util.Scanner;

public class BibliotecaLivros {

    private static final int ANO_ATUAL = 2026;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n==== BIBLIOTECA DE LIVROS ====");

        System.out.print("\nDigite o título do livro: ");
        String titulo = scanner.nextLine();

        System.out.print("Digite o nome do autor: ");
        String autor = scanner.nextLine();

        System.out.print("Digite o ano de publicação: ");
        int anoPublicacao = scanner.nextInt();

        System.out.print("Digite a quantidade de páginas: ");
        int quantidadePaginas = scanner.nextInt();

        String classificacao = verificarClassificacao(anoPublicacao);
        String categoria = verificarCategoria(quantidadePaginas);

        exibirDadosLivro(
                titulo,
                autor,
                anoPublicacao,
                quantidadePaginas,
                categoria,
                classificacao
        );

        scanner.close();
    }

    public static String verificarCategoria(int quantidadePaginas) {

        if (quantidadePaginas < 100) {
            return "Livro Curto";
        }

        if (quantidadePaginas < 300) {
            return "Livro Médio";
        }

        return "Livro Longo";
    }

    public static String verificarClassificacao(int anoPublicacao) {

        int idadeLivro = ANO_ATUAL - anoPublicacao;

        if (idadeLivro <= 5) {
            return "Lançamento";
        }

        if (idadeLivro <= 20) {
            return "Livro Recente";
        }

        return "Livro Antigo";
    }

    public static void exibirDadosLivro(
            String titulo,
            String autor,
            int anoPublicacao,
            int quantidadePaginas,
            String categoria,
            String classificacao) {

        System.out.println("\n==== DADOS DO LIVRO ====");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + anoPublicacao);
        System.out.println("Páginas: " + quantidadePaginas);
        System.out.println("Categoria: " + categoria);
        System.out.println("Classificação: " + classificacao);
    }
}


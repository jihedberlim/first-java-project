import java.util.Scanner;

public class Reading {
    public static void main(String[] args) {
        /*Scanner reading = new Scanner(System.in);

        // Exemplo 1 Scanner
        System.out.println("Digite seu filme favorito: ");
        String movie = reading.nextLine();

        System.out.println("Qual o ano de lançamento?: ");
        int releaseYear = reading.nextInt();

        System.out.println("Digite uma avaliação para o filme: ");
        double rating = reading.nextDouble();

        System.out.println(movie);
        System.out.println(releaseYear);
        System.out.println(rating);*/

        // Exemplo 2 Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.print("Digite o valor que pretende investir esse mês: ");
        double valor = scanner.nextDouble();

        System.out.println(nome + " que tem " + idade + " anos, irá investir R$ " + valor + " esse mês.");

        scanner.close();
    }
}

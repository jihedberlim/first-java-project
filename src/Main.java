public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int releaseYear = 2022;
        System.out.println("Ano de lançamento: " + releaseYear);
        boolean includedInPlan = true;
        double movieRating = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);

        String description;
        description = """
                Filme: Top Gun,
                Sinopse: Filme de aventura com ator dos anos 80,
                Ano de lançamento:
                """ + releaseYear;

        System.out.println(description);

        int classification;
        classification = (int) (media / 2);
        System.out.println(classification);

    }
}
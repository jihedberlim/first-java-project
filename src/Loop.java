import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        // Loop for
        Scanner reading = new Scanner(System.in);
        double mediaRating = 0;
        double note = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite uma avaliação para o filme: ");
            note = reading.nextDouble();
            mediaRating += note; //mediaRating = mediaRating + note
        }

        System.out.println("Média de avaliações " + mediaRating / 3);

    }
}

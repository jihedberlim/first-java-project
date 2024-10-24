import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        // Loop while
        Scanner reading = new Scanner(System.in);
        double mediaRating = 0;
        double note = 0;
        int totalNotes = 0;

        while (note != -1) {
            System.out.println("Digite uma avaliação para o filme ou -1 para encerrar: ");
            note = reading.nextDouble();
            if (note != -1) {
                mediaRating += note; //mediaRating = mediaRating + note
                totalNotes++;
            }
        }

        System.out.println("Média de avaliações " + mediaRating / totalNotes);

    }
}

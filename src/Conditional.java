public class Conditional {
    public static void main(String[] args) {
        int releaseYear = 1986;
        boolean includedInPlan = true;
        double movieRating = 8.1;
        String planType = "Plus";

        //Condicional if/else
        if (releaseYear >= 2022) {
            System.out.println("Lançamento que o público está gostando!");
        } else {
            System.out.println("Filme retrô que vale a pena!");
        }

        if (includedInPlan == true && planType.equals("Plus")) {
            System.out.println("Filme liberado!");
        } else {
            System.out.println("Deve pagar a locação!");
        }

        //Condicional switch/case
        int dia = 3;
        String nomeDia;

        switch (dia) {
            case 1:
                nomeDia = "domingo";
                break;
            case 2:
                nomeDia = "segunda-feira";
                break;
            case 3:
                nomeDia = "terça-feira";
                break;
            case 4:
                nomeDia = "quarta-feira";
                break;
            case 5:
                nomeDia = "quinta-feira";
                break;
            case 6:
                nomeDia = "sexta-feira";
                break;
            case 7:
                nomeDia = "sábado";
                break;
            default:
                nomeDia = "Dia inválido";
                break;
        }

        System.out.println("O dia " + dia + " é " + nomeDia);


    }
}

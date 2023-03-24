import java.util.Random;
import java.util.Scanner;
//Final
public class geradorLoteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.println("Em qual modalidade você quer sortear os números ?");
        System.out.println(" 1- Quadra , 2- Quina , 3- Cheia ");
        int modalidade = scanner.nextInt();


        if ( modalidade != 1 && modalidade != 2 && modalidade != 3)
        { do {
            System.out.println("Invalido! Tente novamente!");
            System.out.println("Em qual modalidade você quer sortear os números ?");
            System.out.println(" 1- Quadra , 2- Quina , 3- Cheia ");
            modalidade = scanner.nextInt(); }
        while (modalidade != 1 && modalidade != 2 && modalidade != 3);}


        if (modalidade == 1) {
            int numeroAleatorio1 = random.nextInt(100);
            int numeroAleatorio2 = random.nextInt(100);
            int numeroAleatorio3 = random.nextInt(100);
            int numeroAleatorio4 = random.nextInt(100);
            System.out.println("Seus números para quadra são: [ " + numeroAleatorio1 + " , " + numeroAleatorio2 + " , " + numeroAleatorio3 + " , " + numeroAleatorio4 + " ] ");
        }

        if (modalidade == 2) {
            int numeroAleatorio1 = random.nextInt(100);
            int numeroAleatorio2 = random.nextInt(100);
            int numeroAleatorio3 = random.nextInt(100);
            int numeroAleatorio4 = random.nextInt(100);
            int numeroAleatorio5 = random.nextInt(100);
            System.out.println("Seus números para Quina são: [ " + numeroAleatorio1 + " , " + numeroAleatorio2 + " , " + numeroAleatorio3 + " , " + numeroAleatorio4 + " , " + numeroAleatorio5 + " ] ");
        }
        if (modalidade == 3) {
            int numeroAleatorio1 = random.nextInt(100);
            int numeroAleatorio2 = random.nextInt(100);
            int numeroAleatorio3 = random.nextInt(100);
            int numeroAleatorio4 = random.nextInt(100);
            int numeroAleatorio5 = random.nextInt(100);
            int numeroAleatorio6 = random.nextInt(100);
            System.out.println("Seus números para Quina são: [ " + numeroAleatorio1 + " , " + numeroAleatorio2 + " , " + numeroAleatorio3 + " , " + numeroAleatorio4 + " , " + numeroAleatorio5 + " , " + numeroAleatorio6 + " ] ");
        }

    }

}


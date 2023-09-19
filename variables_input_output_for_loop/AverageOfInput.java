import java.util.Scanner;

public class AverageOfInput {

    public static void main(String[] args) {

        Scanner sc;

        sc = new Scanner(System.in);
        int sum = 0;

        int [] szamok = new int[5];

        for (int i = 0; i<szamok.length; i++){
            System.out.print("Please enter a number: ");
            szamok[i] = sc.nextInt();
            sum += szamok[i];
        }

        double avg = (double) sum/szamok.length;

        System.out.print("Sum: "+sum+", Average: "+avg);


    }
}

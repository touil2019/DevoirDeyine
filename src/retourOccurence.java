import java.util.Scanner;

public class retourOccurence {

    public static void main(String[] args) {
        int[] tableau = new int[5];
        Scanner t = new Scanner(System.in);
        int occurence;


        System.out.println("Entrez cinqs valeurs");
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = t.nextInt();
        }

        System.out.println("la première occurence du tableau est de :" + tableau[0]);
    }
}




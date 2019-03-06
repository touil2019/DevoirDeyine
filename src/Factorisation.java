import java.util.Scanner;

public class Factorisation {
    public static void main(String[] args) {

        System.out.println("Veuillez saisir un nombre");

        Scanner Nombre = new Scanner(System.in);

        int j=1;

        int n = Nombre.nextInt();


        for (int i =1; i<= n;i++){
            j= j*i;
        }
        System.out.println("la factorielle de " +n+ " est "  +  j);
    }
}

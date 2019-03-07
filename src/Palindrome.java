import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args){

        String mot1= "laval";

        StringBuffer mot2= new StringBuffer(mot1).reverse();

        String resultat = new String(mot2);

        if (mot1.equals(resultat)){

            System.out.println("c'est un palindrome");
        }
        else{
            System.out.println("ce n'est pas un palindrome");
        }


    }
}

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args){
String mot1="LavaL";
StringBuffer mot2= new StringBuffer(mot1);
mot2.reverse();

        System.out.println(mot1);
        System.out.println(mot2);


        if (mot1.equals(mot2)){
            System.out.println("ce mot est un palindrome");
        }
        else{
            System.out.println("ce mot n'est pas un palindrome");
        }
    }
}

import java.util.Scanner;

public class nbMax {
    public static void main(String[] args){

        int[] valeurs=new int[5];
        int min,max;
        Scanner sc=new Scanner(System.in);
        System.out.println("Entrez des valeurs");

        for (int i=0;i<valeurs.length;i++){
            valeurs[i]=sc.nextInt();
        }
        min = valeurs[0];
        max = valeurs[0];
        for (int i=0;i<valeurs.length;i++){

            if(valeurs[i]<min)
                min=valeurs[i];

            if(valeurs[i]>max)
            max=valeurs[i];
        }
        System.out.println("la valeur max est de :" +max);
        System.out.println("la valeur min est de :" +min);
    }
}

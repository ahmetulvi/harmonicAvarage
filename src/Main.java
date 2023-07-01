import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double sum= 0;

        System.out.println("Size of the array:");
        double n= sc.nextDouble();

        double[] list=new double[(int) n];
        System.out.println("Enter the array elements:");

        for (int i=0;i<n;i++){
            list[i]= sc.nextDouble();
            System.out.println("Next element please: ");
        }

        for (double i=0;i< list.length;i++){
            sum+= 1.0/ list[(int) i];
        }
        System.out.println("Harmonic Avarage ==> "+list.length/sum);
    }
}

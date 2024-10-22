import java.util.Scanner;

/**
 * Squareyola20
 */
public class Squareyola20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai N:");
        int N = input.nextInt();
        for(int i= 1; i <= N; i++ ){
            for (int j = 1; j<=N; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
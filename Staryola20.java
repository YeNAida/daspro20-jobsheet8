import java.util.Scanner;

/**
 * Staryola20
 */
public class Staryola20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nilai N:");
        int N = input.nextInt();

        for (int i = 1; i <= N; i++){
            System.out.print("*");
        }
    }
}

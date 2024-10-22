import java.util.Scanner;

public class RataNilaiyola20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int j;
        float nilai,totalnilai=0,ratanilai;
        int i=1;
        while (i<=5) {
            System.out.println("Input Nilai Mahasiswa ke-"+i);
            totalnilai=0;
            for (j=1;j<=5;j++){
            System.out.print("Nilai ke-" +j+"=");
            nilai = input. nextInt();
            totalnilai+=nilai;
            }
        ratanilai=totalnilai/5;
        System.out.println("Rata - rata nilai Mahasiswa ke-1 adalah "+ratanilai);
        i++;}
}
}

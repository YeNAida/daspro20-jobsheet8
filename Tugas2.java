import java.util.Scanner;
public class Tugas2 {
    private static int j;
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan jumlah politeknik yang mendaftar: ");
        int jumlahpoliteknik = input.nextInt();
        input.nextLine();

        final int jumlahAttletCabor =5;
        final int jumlaCabor=4;
        String[]namapoltiteknik=new String[jumlahpoliteknik];
        String[][][] atlet = new String[jumlahpoliteknik][jumlaCabor][jumlahAttletCabor];
        String[] namaCabor = {"Badminton", "Tenis Meja", "Basket", "Bola Voli"};

        for(int i =0;i<jumlahpoliteknik;i++){
            System.out.print("Masukkan Nama Politeknik"+(i+1)+":");
            namapoltiteknik[i] = input.nextLine();
        }
        for(int i=0;i<jumlahpoliteknik;i++){
            System.out.println("Politeknik"+namapoltiteknik[i]+":");
            for (int j =0; j< jumlahAttletCabor;j++){
                System.out.print("Masukkan Nama "+jumlahAttletCabor+"Atlet untuk"+namaCabor[j]+":");
                for(int k=0;k<jumlahAttletCabor;k++){
                    System.out.print("Atlet "+(k+1)+":");
                    atlet[i][j][k]=input.nextLine();
                }
            }
        }
    }
}



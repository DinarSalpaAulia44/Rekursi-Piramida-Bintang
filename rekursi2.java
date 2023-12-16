import java.util.Scanner;
public class rekursi2 {

    public static void main(String[] args) {
        Scanner masukan=new Scanner(System.in);
        System.out.print("Masukan Jumlah Baris:");
        int n= masukan.nextInt();

        baris(1,n);

        masukan.close();

    }

    public static void baris(int i, int n){
        if(i<=n){
            ruang(1,n,i);
            j1(1,i);
            System.out.println();

            baris(i+1,n);
        }
    }

    public static void ruang(int k, int n, int i){
        if(k<=n-i){
            System.out.print(" ");
        ruang(k+1,n,i);
        }
    }

    public static void j1(int j, int i){
        if(j<=i){
            System.out.print("* ");
            j1(j+1,i);
        }
    }

}

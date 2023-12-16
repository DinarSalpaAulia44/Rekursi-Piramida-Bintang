import java.util.Scanner;
public class rekursi {
    public static void main(String[] args) {
        Scanner masukan= new Scanner(System.in);
        System.out.print("Masukan jumlah baris: ");
        int n= masukan.nextInt();

        for(int i=1; i<=n; i++){
            for(int r=1; r<=n-i; r++){
                System.out.print(" ");
            }

            for(int j1=1; j1<=i; j1++){
                System.out.print("* ");
            }

            System.out.println();
        }

        masukan.close();
        
    }
    
}

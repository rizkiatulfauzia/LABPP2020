import java.util.Scanner;
public class Soal3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nilai N = ");
        int x = input.nextInt();

        int angka0 = 0;
        int angka1 = 1;
        int jumlah = 0;

        int i = 0;

        do{
            i++;
            angka0 = angka1;
            angka1 = jumlah;
            System.out.print(jumlah + " ");
            jumlah = angka0 + angka1;

        }while(i < x);

        input.close();
    }
} 
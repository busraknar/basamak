import java.util.Scanner;
public class Basamak {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int sayi= input.nextInt();
        int sonDeger,toplam=0; //1254
        int sonSayi=sayi;
        while(sayi!=0)
        {
            sonDeger= sayi%10;
            sayi/=10;
            toplam+= sonDeger;
        }
        System.out.println(sonSayi+" sayısının basamak sayılarının toplamı:"+toplam);
    }
}

import java.util.Scanner;
public class uklmudah1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    int jarakMinimum = 10;
    int harga1 = 4250;
    int harga2 = 6000;
    int harga3 = 50000;
    int volumeMinimum = 100;

    System.out.println("masukkan berat paket");
    int berat = input.nextInt();
    System.out.println("masukkan jarak tempuh");
    int jarakTempuh = input.nextInt();
    System.out.println("masukkan tinggi barang");
    int t = input.nextInt();
    System.out.println("masukkan lebar barang");
    int l = input.nextInt();
    System.out.println("masukkan panjang barang");
    int p = input.nextInt();

    int resultvolume = p * l * t;

    if (jarakTempuh <= jarakMinimum){
        int result1 = harga1 * berat;
        if (resultvolume > jarakMinimum){
            int finalresult = harga1 + harga3;
            System.out.println("biaya yang harsu dibayar Rp " + finalresult);
        }else{
            System.out.println("biaya yang harus dibayar Rp " + result1);
        }
    }else if(jarakTempuh > jarakMinimum){
        int result2 = harga2 * berat;
        if(resultvolume > volumeMinimum){
            int finalresult = result2 + harga3;
            System.out.println("biaya yg harus dibayar Rp "+ finalresult);
        }else{ 
            System.out.println("biaya yg harus dibayar Rp "+ result2);
        }
    }

    }
}
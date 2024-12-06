import java.util.Scanner;
public class uklsedang2 {
    static void hitungVolume (double r, double t){
        Double volume = Math.PI * r * r * t;
        System.out.println(volume);
    }
    static void tilte(){
        System.out.println("program ini digunakan untuk menghitung volume tabung");
    }
    static void luasLingkaran (double r){
        Double luasDouble = Math.PI * r * r;
        System.out.println(luasDouble);

    }
    public static void main(String[] args) {
        tilte();
        hitungVolume(20, 20);
        luasLingkaran(10);
        tilte();
    }


    
}

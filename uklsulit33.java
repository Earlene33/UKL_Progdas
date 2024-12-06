import java.util.Scanner;
public class uklsulit33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah elemen array: ");
        int n = scanner.nextInt();
        
        
        int[] array = new int[n];
        
        
        System.out.println("Masukkan " + n + " elemen array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        
        boolean sudahDihitung[] = new boolean[array.length];

        
        for (int i = 0; i < array.length; i++) {
            if (sudahDihitung[i]) {
                continue;
            }

            int frekuensi = 1; 
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    frekuensi++;
                    sudahDihitung[j] = true;  
                }
            }
            
            System.out.println(array[i] + " muncul " + frekuensi + " kali");
        }
        
        scanner.close();
    
    
    }
}
        
        
    
    


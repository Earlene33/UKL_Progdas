public class uklsulit3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4};
        
        
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
    }
}

package Array.java;

public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        
        int size = arr.length;

        for(int i=0; i<size - 1; i++) {

            // 1 0 2 0 3 0 4
            if(arr[i] == 0) {
               //For loop interno para fazer o shifting das posições 
                for(int j=size-2; j>i; j--) {
                    arr[j+1] = arr[j];
                }
                arr[i+1] = 0;
                i = i+1; // atualiza o contador para evitar checar o zero duplicado.
            }

             
        }
        
    }
}
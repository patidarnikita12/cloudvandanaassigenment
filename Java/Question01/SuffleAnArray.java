package Question01;

import java.util.Random;

public class SuffleAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        Random random = new Random();
       

        for(int i=0;i<arr.length;i++){
            int randomIndex = random.nextInt(arr.length);
            int temp = arr[randomIndex];
            arr[randomIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Array After Shuffling");
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }

}

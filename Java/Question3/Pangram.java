package Question3;

import java.util.HashSet;
import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String string = sc.nextLine().toLowerCase();
        HashSet<Character> stringSet = new HashSet<>();
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)>=97 && string.charAt(i)<=122){
                stringSet.add(string.charAt(i));
            }
        }
        if(stringSet.size()==26){
            System.out.println("Pangram");
        }
        else {
            System.out.println("Not Pangram");
        }
    }
}

package Question2;

import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a roman number");
        String roman = sc.next().toUpperCase();
        int number = romanToInteger(roman);
        System.out.println(roman+": "+number);
    }
    public static int romanToInteger(String s) {
        int num = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='I')
            {
                num+=1;
            }else if(s.charAt(i)=='V')
            {
                num+=5;
            }else if(s.charAt(i)=='X')
            {
                num+=10;
            }else if(s.charAt(i)=='L')
            {
                num+=50;
            }else if(s.charAt(i)=='C')
            {
                num+=100;
            }else if(s.charAt(i)=='D')
            {
                num+=500;
            }else if(s.charAt(i)=='M')
            {
                num+=1000;
            }
            if(i>0){
                if((s.charAt(i)=='V' || s.charAt(i)=='X')&& s.charAt(i-1)=='I')
                {
                    num -=2;
                }else if((s.charAt(i)=='L' || s.charAt(i)=='C')&& s.charAt(i-1)=='X')
                {
                    num -=20;
                }else if((s.charAt(i)=='D' || s.charAt(i)=='M')&& s.charAt(i-1)=='C')
                {
                    num -=200;
                }
            }
        }
        return num;
    }
}

package intToRoman;

import java.util.Scanner;
public class IntToRoman{
	//method for converting numeral to roman numeral
    public String converter(int num){
        String[] thousands = new String[]{"", "M", "MM", "MMM"};
        String[] hundreds = new String[]{"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = new String[] {"", "X", "XX", "XXX", "XL", "LX", "L", "LX", "LXX", "LXXX", "XC"};
        String[] units = new String[]{"","I","II", "III", "IV", "V", "VI", "VII","VIII", "IX"};

        return thousands[num/1000] +
            hundreds[(num%1000)/100] +
            tens[(num%100)/10] +
            units[num%10];
    }
    // main method
    public static void main(String[] args){
    	System.out.println("Enter no.: ");

        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        IntToRoman obj = new IntToRoman();
        String roman = obj.converter(no);

        System.out.println(roman);
        sc.close();// IDK
    }
  
}
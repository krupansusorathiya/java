package main.src.com.krupansu;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // int num = input.nextInt();

//        int num = input.nextInt();
//        System.out.println(num);


        // TypeCasting

//        int num = (int)(25.2545f);
//        System.out.println(num);

        // automatic type promotion and expression

//        int a = 257;
//        byte b = (byte) (a); // 257 % 256 = 1
//        System.out.println(b);
//

        //Next

//        byte a = 50;
//        byte b= 40;
//        byte c= 100;
//        int d = (a*b)/c;
//        System.out.println(d);


        //alpha num

//        int number = 'A';
//        System.out.println(number);

        //int * float

//        System.out.println(35*562.665);


        byte b = 25;
        char c = 'a';
        short s = 1024;
        int i = 500000;
        float f = 2535.5554f;
        double d =  0.25445;
        double result  = ( f * b) + ( i / c) - ( d - s );
        System.out.println(  (f * b) + " " +  ( i / c) + " " +  ( d - s ));
        System.out.println(result);


    }
}

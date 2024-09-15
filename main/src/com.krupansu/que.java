package main.src.com.krupansu;

import java.util.Scanner;

public class que {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

//        int max = a;
//        if (b > max){
//            max = b;
//        }
//        if (c > max){
//            max = c;
//        }

//        ---------------second method ------------------------------


//        int max = 0;
//        if (a > b ){
//            max = a ;
//        }
//        else {
//            max = b;
//        }
//        if (c > max){
//            max = c;
//        }


//----------------------------third method -------------------------------------

        int max = Math.max (c , Math.max(a , b ));



        System.out.println(max);
    }

}

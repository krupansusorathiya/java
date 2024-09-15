package main.src.com.krupansu;
import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

//       trim() is remove extra place
//         example :-        hello
//                    hello

//      charAt(); is char convert to string


//        String  word = "hello";
//        System.out.println(word.charAt(0));

//        System.out.println(in.next().trim());

        if ( ch >= 'a' && ch < 'z' ){
            System.out.println("lower case");
        }else{
            System.out.println("uper case");
        }
    }
}
import java.util.Scanner;

public class Main{
    public static void main(String args){

        Scanner in = Scanner(System.in);
        println("나이를 입력하시오 : ");
        int age = in.nextInt();

        if(age >= 19)
            println("성년");
        else
            println("미성년");

            
    }
}
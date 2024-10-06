import java.util.Scanner;

public class Main{
    public static void main(String args){

        int sum = 0;

        do{
            println("양의 정수를 입력하세요 :");
            int n = in.nextInt();
            if(n % 2 == 0)
                sum += n;
        }while(n <= 0);

        printf("입력한 양의 정수 중에서 짝수의 합은 %d", sum);
    }

}
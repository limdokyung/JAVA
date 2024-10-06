import java.util.Scanner;


public class main{
    public static void main(String[] args){
        println("정수를 입력하세요 : ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int result = x*x;
        printf("%d의 제곱은 %d", x, result);
    }
}
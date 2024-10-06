import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        System.out.println("0-999 사이의 숫자를 입력하세요 : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;

        while(n > 0){
            sum += n % 10;
            n /= 10;
        }

        System.out.printf("각 자릿수의 합 = %d", sum);

    }
}//sum을 만들어서 해당수를 10으로 나눈값을 넣음 그 후 마지막수를 제거함
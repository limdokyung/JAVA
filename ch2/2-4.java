import java.util.Scanner;

public class main{
    public static main(String[] args){
        println("초 단위 정수를 입력하세요 : ");
        Scanner in = new Scanner(System.in);

        int hour = in.nextInt() / 3600;
        int minute = (in.nextInt() % 3600) / 60;
        second = (in.nextInt() % 3600) % 60;

        printf("%d시간 %d분 %d초", hour, minute, second);
        
    }
}
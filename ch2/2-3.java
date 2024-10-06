import java.util.Scanner;

public class main{
    public static void main(String[] args){
        println("원기둥의 밑면 반지름은? ");
        Scanner in = new Scanner(System.in);
        radius = in.nextInt();
        
        println("원기둥의 높이는? ");
        Scanner in = new Scanner(System.in);
        height = in.nextInt();

        volumn = 3.14 * radius * radius * height;

        printf("원기둥의 부피는 %d", volumn);
    }
}
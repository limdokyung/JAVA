import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner in = Scanner(System.in);

        println("전공 이수 학점 : ");
        int major = in.nextInt();

        println("교양 이수 학점 : ");
        int general = in.nextInt();

        println("일반 이수 학점 : ");
        int elective = in.nextInt();

        graduate = (major > 70 && 
        ((general > 30) && (elective > 30)) || (general + elective > 80));

        
    }
}
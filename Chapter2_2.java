import java.util.Scanner;

public class Chapter2_2 {
    public Chapter2_2() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("마일을 입력하시오 : ");
        double mile = scanner.nextDouble();
        double kilo = mile * 1.609D;
        System.out.println(mile + "마일은" + kilo + "킬로미터입니다");
    }
}
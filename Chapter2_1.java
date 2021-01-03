import java.util.Scanner;

public class Chapter2_1 {
    public Chapter2_1() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("오렌지의 개수를 입력하시오: ");
        int orange = scanner.nextInt();
        int box = orange / 10;
        orange %= 10;
        System.out.println(box + "박스가 필요하고 " + orange + "개가 남습니다");
    }
}
import java.util.Scanner;

public class Multiplication100 {
    public static void main(String[] args) {
        System.out.println("整数値を入力してください");

        Scanner in = new Scanner(System.in);
        String inputLine = in.nextLine();

        int num = Integer.parseInt(inputLine);

        System.out.println(num*100);
    }
}

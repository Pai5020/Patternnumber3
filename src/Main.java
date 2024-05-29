import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int rows;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of rows: ");
        rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {

            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }


            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++;
            }


            num -= 2;
            for (int j = 1; j < i; j++) {
                System.out.print(num);
                num--;
            }


            System.out.println();
        }
    }
}

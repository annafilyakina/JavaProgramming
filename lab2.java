import java.util.Scanner;

public class lab2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");

        while (!in.hasNextInt()) {
            System.out.println("неверные данные");
            in.next();
        }
        int n = in.nextInt();
        if (n > 15 || n < 0) {
            System.out.println("вычислить факториал невозможно");
        } else {
            long fac = 1;
            for (int i = 1; i <= n; i++) {
                fac = fac * i;
            }
            System.out.print("факториал числа = " + fac);
        }
        in.close();
    }
}
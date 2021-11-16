import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = in.nextInt();
        System.out.print("Введите второе число: ");
        int b = in.nextInt();
        System.out.print("Введите тертье число: ");
        int c = in.nextInt();
        System.out.print("Введите четвертое число: ");
        int d = in.nextInt();
        System.out.print("Введите пятое число: ");
        int e = in.nextInt();

        int max = 0;
        int min = 0;

        if (a >= b && a >= c && a >= d && a >= e) {
            max = a;
        } else if (b >= c && b >= d && b >= e) {
            max = b;
        } else if (c >= d && c >= e) {
            max = c;
        } else if (d > e) {
            max = d;
        } else {
            max = e;
        }

        if (a <= b && a <= c && a <= d && a <= e) {
            min = a;
        } else if (b <= c && b <= d && b <= e) {
            min = b;
        } else if (c <= d && c <= e) {
            min = c;
        } else if (d < e) {
            min = d;
        } else {
            min = e;
        }
        System.out.println(min);
        System.out.println(max);
        in.close();
    }

}

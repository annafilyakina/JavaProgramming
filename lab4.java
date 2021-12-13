import java.util.Scanner;

public class lab4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter numbers using space bar |to finish enter 'quit'| : ");
        String NumberRow = in.nextLine();

        NumberRow = NumberRow.substring(0, NumberRow.indexOf("q"));
        String str[] = NumberRow.split(" ");
        float numberArray[] = new float[str.length];

        for (int i = 0; i < str.length; i++) {
            numberArray[i] = Float.parseFloat(str[i]);
        }

        System.out.print("Original row: ");

        for (float elem : numberArray) {
            System.out.print(elem + " ");
        }
        // надуюсь я правильно понимаю, что при таком выравнивании
        // первый элемент становится 0,
        // так как в исходном массиве перед ним соответственно нет чисел

        float NewArray[] = new float[numberArray.length];
        for (int i = 1; i < str.length; i++) {
            int j = i;
            float sum = 0;
            while (j > 0) {
                sum = sum + numberArray[j - 1];
                j--;
            }
            NewArray[i] = sum / i;

        }
        System.out.print("New row:");
        for (float elem : NewArray) {
            System.out.print(elem + " ");
        }

        in.close();

    }
}

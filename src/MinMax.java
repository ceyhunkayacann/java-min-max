import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter : ");
        int n = input.nextInt();

        int max = 0, min = 0;
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the %s. number : ",i + 1);
            int number = input.nextInt();

            if (i == 0) {
                max = number;
                min = number;
            }

            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }
        }
        System.out.printf("Lowest Value : %s\nHighest Value : %s%n",min,max);
    }
}

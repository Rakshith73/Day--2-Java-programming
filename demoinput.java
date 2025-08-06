import java.util.Scanner;

class Sample {
    Sample() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            int str1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int str2 = scanner.nextInt();

            System.out.println("Sum: " + (str1 + str2));
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers.");
        } finally {
            scanner.close();
        }
    }
}

public class demoinput {
    public static void main(String[] args) {
        new Sample();
    }
}

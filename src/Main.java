import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option = 0;
        Scanner sc = new Scanner(System.in);

        try {
            do {
                System.out.println("WELCOME TO CALCULATOR");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Power");
                System.out.println("6. Square Root");
                System.out.println("0. Exit");
                System.out.print("Type an option: ");
                option = sc.nextInt();

                switch (option) {
                    case 0:
                        System.exit(0);
                        break;
                    case 1:
                        System.out.println("ADDITION");
                        break;
                    case 2:
                        System.out.println("SUBTRACTION");
                        break;
                    case 3:
                        System.out.println("MULTIPLICATION");
                        break;
                    case 4:
                        System.out.println("DIVISION");
                        break;
                    case 5:
                        System.out.println("POWER");
                        break;
                    case 6:
                        System.out.println("SQUARE ROOT");
                        break;
                    default:
                        System.out.println("Invalid option");
                }
            }
            while (option != 7);
        }
        catch (Exception e) {

        }
    }
}

import java.util.Scanner;

public class DataTypes {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double firstDbl = scanner.nextDouble();
        int firstInt = scanner.nextInt();
        scanner.nextLine();
        String firstString = scanner.nextLine();
        solve(firstDbl, firstInt, firstString);
        scanner.close();
    }

    static void solve(double firstDbl, int firstInt, String firstString) {
        double secondDbl = 4.0;
        int secondInt = 12;
        String secondString = "is the best place to learn and practice coding!";
        System.out.println(firstDbl + secondDbl);
        System.out.println(firstInt + secondInt);
        System.out.println(firstString + secondString);
    }
}

import java.util.Scanner;

public class MonthToSeasonSwitch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the month name
        System.out.println("Enter the name of the month (e.g., January, jan, Jan, jan):");
        String month = scanner.nextLine().toLowerCase(); // Convert input to lowercase for easier matching

        // Switch case to determine the season based on the input month
        switch (month) {
            case "december":
            case "dec":
            case "january":
            case "jan":
            case "february":
            case "feb":
                System.out.println("The season is Winter.");
                break;

            case "march":
            case "mar":
            case "april":
            case "apr":
            case "may":
                System.out.println("The season is Spring.");
                break;

            case "june":
            case "jun":
            case "july":
            case "jul":
            case "august":
            case "aug":
                System.out.println("The season is Summer.");
                break;

            case "september":
            case "sep":
            case "october":
            case "oct":
            case "november":
            case "nov":
                System.out.println("The season is Fall (Autumn).");
                break;

            default:
                System.out.println("Invalid month. Please enter a valid month name.");
                break;
        }

        scanner.close(); // Close the scanner
    }
}

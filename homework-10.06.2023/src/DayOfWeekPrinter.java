import java.util.Scanner;

public class DayOfWeekPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-7): ");
        int userInput = scanner.nextInt();

        String dayOfWeek;
        switch (userInput) {
            case 1:
                dayOfWeek = "Sunday";
                break;
            case 2:
                dayOfWeek = "Monday";
                break;
            case 3:
                dayOfWeek = "Tuesday";
                break;
            case 4:
                dayOfWeek = "Wednesday";
                break;
            case 5:
                dayOfWeek = "Thursday";
                break;
            case 6:
                dayOfWeek = "Friday";
                break;
            case 7:
                dayOfWeek = "Saturday";
                break;
            default:
                dayOfWeek = "Invalid input";
                break;
        }

        System.out.println("The " + getOrdinalSuffix(userInput) + " day of the week is " + dayOfWeek);
    }

    private static String getOrdinalSuffix(int number) {
        if (number >= 11 && number <= 13) {
            return number + "th";
        } else {
            switch (number % 10) {
                case 1:
                    return number + "st";
                case 2:
                    return number + "nd";
                case 3:
                    return number + "rd";
                default:
                    return number + "th";
            }
        }
    }
}
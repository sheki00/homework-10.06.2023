
public class LargestNumberFinder {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 3, 8, 15, 7};

        int largestNumber = numbers[0];  // Assume the first number is the largest

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largestNumber) {
                largestNumber = numbers[i];
            }
        }

        System.out.println("The largest number in the array is: " + largestNumber);
    }
}


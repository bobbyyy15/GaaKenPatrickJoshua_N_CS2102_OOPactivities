// GetArrayMean

import java.util.Scanner;

public class GetArrayMean {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = s.nextInt();
        
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            numbers[i] = s.nextInt();
        }
        
        float mean = getArrayMean(numbers);
        System.out.printf("Mean of array is: %.2f%n", mean);
    }

    public static float getArrayMean(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return (float) sum / array.length;
    }
}
// Program to calculate the sum of array elements using a for-each loop
public class ForEach {
    public static void main(String[] args) {
        // Declare and initialize the array
        int[] numbers = {4, 5, 6, 7};

        // Variable to store the sum
        int sum = 0;

        // Use enhanced for loop (for-each) to calculate sum
        for (int num : numbers) {
            sum += num;
        }

        // Print the total sum
        System.out.println("Sum = " + sum);
    }
}

// sample output
// sum = 22
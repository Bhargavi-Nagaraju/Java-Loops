"Print the multiplication table of a given number using a while loop."
// Import Scanner to take user input
import java.util.Scanner;
public class Solution{
public static void main (String[]args){
// Create Scanner object to read input from the user
Scanner sc = new Scanner(System.in);
// Read an integer N from the user
int N =sc.nextInt();
// Initialize counter variable i to 1
int i = 1;
// Loop to print the multiplication table from 1 to 10
while (i<=10){
// Print in the format: N x i = result
System.out.println(N + " x " + i + " = " + (N * i));
// Increment i to move to the next multiple
i++;
}
sc.close();

}
}

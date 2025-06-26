// program to check prime
public class ForLoop{
public static void main (String[]args){
// Initialize the variable i with 5
int num = 5;
boolean isPrime = true;
// A number less than or equal to 1 is not prime
if(num<=1){
isPrime = false;
}
// Check if the number has any other divisors
for(int i = 2;i<=num/2;i++){
//If 'i' divides 'num' with no remainder, it's not prime
if (num % i == 0) {
isPrime = false;
break;
}
}
// Display the result
if (isPrime) {
System.out.println(num + " is a Prime Number.");
} else {
System.out.println(num + " is NOT a Prime Number.");
        }
    }
}







import java.util.*;

public class EvenNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter the number X: ");
        int x = sc.nextInt();

        System.out.print("Enter the number Y: ");
        int y = sc.nextInt();

        
        displayEvenDigitSumNumbers(x, y);

        sc.close();
    }

    
    public static void displayEvenDigitSumNumbers(int x, int y) {
        System.out.println("Numbers between " + x + " and " + y + " with even digit sums:");
        for (int i = x; i <= y; i++) {
            if (isDigitSumEven(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); 
    }

    
    public static boolean isDigitSumEven(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;  
            num /= 10;         
        }
        return sum % 2 == 0;
    }
}

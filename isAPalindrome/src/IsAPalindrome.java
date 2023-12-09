import java.util.Scanner;

public class IsAPalindrome {

    public static int palindrome (int x){
        int y = x;
        int newNum = 0;

        while(y > 0){
            newNum = newNum * 10 + (y % 10);
            y /= 10;
        }

        return newNum;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        if(num >= 1 && num <= 10000000){
            if(palindrome(num) == num){
                System.out.println(num + " is a palindrome.");
            } else {
                System.out.println(num + " is NOT a palindrome.");
            }
        } else {
            System.out.println("Incorrectly entered number.");
        }
    }
}

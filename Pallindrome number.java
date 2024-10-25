public class PalindromeNumber {

    
    public static int reverseNumber(int num, int reversed) {
        if (num == 0) {
            return reversed;
        }
        
        reversed = reversed * 10 + num % 10;
        return reverseNumber(num / 10, reversed);
    }

    
    public static boolean isPalindrome(int num) {
        if (num < 0) {
            return false; 
        }
        return num == reverseNumber(num, 0);
    }

    public static void main(String[] args) {
        int number = 12321; 

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}

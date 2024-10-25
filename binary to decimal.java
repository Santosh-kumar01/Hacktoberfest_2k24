import java.util.Scanner;

public class BinaryToDecimalConverter {

    
    public static int binaryToDecimal(String binaryString) {
        int decimalValue = 0;
        int base = 1; // 2^0

        
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            if (binaryString.charAt(i) == '1') {
                decimalValue += base;
            } else if (binaryString.charAt(i) != '0') {
                throw new IllegalArgumentException("Invalid binary number.");
            }
            base *= 2;
        }

        return decimalValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();

        try {
            int decimalValue = binaryToDecimal(binaryString);
            System.out.println("Decimal value: " + decimalValue);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}

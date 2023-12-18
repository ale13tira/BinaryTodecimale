import java.util.Scanner;

public class BinaryToDecimo {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner (System.in);

       System.out.println("inserisci stringa binaria: ");
       String binarystrString = scanner.nextLine();

       //int decimalValue = 0;
       int decimalvalue = binaryToDecimal(binarystrString);
       System.out.println("valore decimale "+ decimalvalue);
       scanner.close();
    }

    public static int binaryToDecimal(String binaryString)  {
        int decimalValue = 0;

        int len = binaryString.length();

        for (int i=0; i < binaryString.length(); i++)  {
            int digit = Character.getNumericValue(binaryString.charAt(i));
            int power = len - i - 1;
            decimalValue = decimalValue + (int)(digit * Math.pow(2, power));

        }

        return decimalValue;
    }
}

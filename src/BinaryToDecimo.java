import java.util.Scanner;

public class BinaryToDecimo {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner (System.in);

       System.out.println("inserisci stringa binaria: ");
       String binarystrString = scanner.nextLine();

       int decimalValue = 0;
       // int decimalvalue = binarytodecimo (binarystring);
       System.out.println("valore decimale"+ decimalValue);
       scanner.close();
    }
}

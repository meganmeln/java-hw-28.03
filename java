import java.util.Scanner;

public class ScannerHomeWork {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to convert to binary: ");

        int dec = sc.nextInt();
        int d, rem;
        String binary = "";
        d = dec;
        while (dec > 0)  { 
            
            dec = dec / 2;
            rem = dec % 2;
            binary = rem + binary;  
        
        }

        System.out.println("Number" + d + "In binary it: " + binary);
        System.out.println();
        

        sc.close ();


    }
}

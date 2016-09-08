import java.util.Scanner;
import java.util.Random;


public class LinearSearch {
    public static void main(String[] args) {
        int c, size, search, array[];
        Scanner input = new Scanner(System.in);
        Random rand = new Random ();
        System.out.print("Enter array Size : ");
        size = input.nextInt();
        array = new int[size];
        System.out.print("Enter number to find : ");
        search = input.nextInt();
        for (c = 0; c < size; c++) {
            array[c] = rand.nextInt(1000);
            if (array[c] == search)
                System.out.println("FOUND : " + search + " is at " + " array["+c+"]");
            break;
            
        }
        if (c == size)
            System.out.println("NOT FOUND : " + search + " is not in the array.");
    }
    
}

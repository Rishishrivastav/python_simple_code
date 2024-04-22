import java.util.Scanner;

public class searching {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = scanner.nextInt();
        
        // Validate input for array size
        while (size <= 0) {
            System.out.println("Size should be a positive integer. Please enter again: ");
            size = scanner.nextInt();
        }

        int[] array = new int[size];
        boolean found = false;

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        
        System.out.println("Enter the searching element:");
        int a = scanner.nextInt();
        
        for (int i = 0; i < size; i++) {
            if (a == array[i]) {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("Element is found: " + a);
        } else {
            System.out.println("Element is not found: " + a);
        }
    }
}

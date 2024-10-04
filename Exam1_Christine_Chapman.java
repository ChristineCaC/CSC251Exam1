import java.util.ArrayList;
import java.util.Scanner;

public class Exam1_Christine_Chapman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cookie> batches = new ArrayList<>();

        int totalCookies = 0;
        double totalSugar = 0.0, totalButter = 0.0, totalFlour = 0.0, totalChocoChips = 0.0;

        // Ask for the number of batches
        System.out.print("Enter the number of batches of cookies (min: 1 - max: 15): ");
        int numberOfBatches = sc.nextInt();
        while (numberOfBatches < 1 || numberOfBatches > 15) {
            System.out.println("ERROR: INVAILD NUMBER OF BATCHES ENTERED.TRY AGAIN.");
            System.out.print("Enter the number of batches of cookies (min: 1 - max: 15): ");
            numberOfBatches = sc.nextInt();
        }

        // Input for each batch
        for (int i = 0; i < numberOfBatches; i++) {
            System.out.print("\nHow many cookies are in a batch #" + (i + 1) + "? (min: 12 - max: 300): ");
            int numCookies = sc.nextInt();
            while (numCookies < 12 || numCookies > 300) {
                System.out.println("ERROR: INVALID NUMBER OF COOKIES.TRY AGAIN.");
                System.out.print("How many cookies are in a batch # " + (i + 1) + "? (min: 12 - max: 300): ");
                numCookies = sc.nextInt();
            }

            // Create a Cookie object for this batch and store it
            Cookie batch = new Cookie(numCookies);
            batches.add(batch);

            // Add to totals
            totalCookies += batch.getNumberOfCookies();
            totalSugar += batch.getCupsOfSugar();
            totalButter += batch.getCupsOfButter();
            totalFlour += batch.getCupsOfFlour();
            totalChocoChips += batch.getCupsOfChocolateChips();
        }

        // Display the report for each batch
        System.out.println("\n\t---Chocolate Chip Batches---");
        for (int i = 0; i < batches.size(); i++) {
            System.out.printf("--Batch #%d--\n", i + 1);
            System.out.println("-----------------------------------------------------------");
            System.out.print(batches.get(i).toString());
            System.out.println("-----------------------------------------------------------\n");
        }

        // Display the summary 
        System.out.printf("Batches of Cookies:\t\t\t\t\t%d\n", numberOfBatches);
        System.out.printf("Total Cookies:\t\t\t\t\t\t\t%d\n", totalCookies);
        System.out.printf("Total cups of Sugar:\t\t\t\t\t%.2f\n", totalSugar);
        System.out.printf("Total Cups of Butter:\t\t\t\t%.2f\n", totalButter);
        System.out.printf("Total Cups of Flour:\t\t\t\t\t%.2f\n", totalFlour);
        System.out.printf("Total Cups of Chocolate Chips:\t%.2f\n", totalChocoChips);    
        }
}
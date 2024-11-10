package chapter5_loop;

public class multiplication {
    public static void main(String[] args) {
            // Display the table heading
            System.out.println("           Multiplication Table");

            // Display the number title
            System.out.print("    ");
            for (int j = 1; j <= 12; j++)
                System.out.print("   " + j);

            System.out.println("\n-----------------------------------------");

            // Print table body
            for (int i = 1; i <= 12; i++) {
                System.out.print(i + " | ");
                for (int j = 1; j <= 12; j++) {
                    // Display the product and align properly
                    System.out.printf("%4d", i * j);
                }
                System.out.println();
            }
        }
    }



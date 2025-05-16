import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manage {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<product> a = new ArrayList<product>();

        while (true) {
            System.out.println("\nWelcome, user!");
            System.out.println("Enter your choice: 1. Add  2. Display All  3. Remove");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Enter product details:");
                System.out.print("ID: ");
                int id = sc.nextInt();
                sc.nextLine(); // clear buffer
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();

                a.add(new product(id, name, price));
                System.out.println("Product added successfully!");

            } else if (choice == 2) {
                System.out.println("All products:");
                for (product p : a) {
                    System.out.println(p.display());
                }

            } else if (choice == 3) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                for (int i = 0; i < a.size(); i++) {
                    if (a.get(i).id == id) {
                        a.remove(i);
                        System.out.println("Product removed successfully!");
                        break; 
                    }
                }
            }
        }
    }
}

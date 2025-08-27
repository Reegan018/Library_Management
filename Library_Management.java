import java.util.*;

public class Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> books = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Add Book  2. Remove Book  3. Show Books  4. Exit");
            int choice = sc.nextInt(); 
	    sc.nextLine();
            switch (choice) {
                case 1: 
			System.out.print("Enter book name: ");
                        books.add(sc.nextLine()); 
			break;
                case 2: 
			System.out.print("Enter book name to remove: ");
                        books.remove(sc.nextLine()); 
			break;
                case 3: 
			System.out.println("Books: " + books); 
			break;
                case 4: 
			return;
            }
        }
    }
}

import java.util.HashMap;
import java.util.Scanner;

public class PasswordManager {
    private static HashMap<String, String> passwords = new HashMap<String, String>();
    private static HashMap<String, String> notes = new HashMap<String, String>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Password");
            System.out.println("2. Add Note");
            System.out.println("3. View Passwords");
            System.out.println("4. View Notes");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addPassword(scanner);
                    break;
                case 2:
                    addNote(scanner);
                    break;
                case 3:
                    viewPasswords();
                    break;
                case 4:
                    viewNotes();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private static void addPassword(Scanner scanner) {
        System.out.print("Enter website or service name: ");
        String website = scanner.next();

        System.out.print("Enter password: ");
        String password = scanner.next();

        passwords.put(website, password);
        System.out.println("Password added successfully.");
    }

    private static void addNote(Scanner scanner) {
        System.out.print("Enter note title: ");
        String title = scanner.next();

        System.out.print("Enter note content: ");
        String content = scanner.next();

        notes.put(title, content);
        System.out.println("Note added successfully.");
    }

    private static void viewPasswords() {
        for (String website : passwords.keySet()) {
            String password = passwords.get(website);
            System.out.println("Website: " + website + ", Password: " + password);
        }
    }

    private static void viewNotes() {
        for (String title : notes.keySet()) {
            String content = notes.get(title);
            System.out.println("Title: " + title + ", Content: " + content);
        }
    }
}


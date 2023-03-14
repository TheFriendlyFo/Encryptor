import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println();
            System.out.println("enter message to encrypt: ");
            System.out.print("> ");
            String message = scanner.nextLine();
            System.out.println("enter number of rows: ");
            System.out.print("> ");
            int rows = scanner.nextInt();
            System.out.println("enter number of columns: ");
            System.out.print("> ");
            int cols = scanner.nextInt();
            scanner.nextLine();

            System.out.println();
            System.out.println("Encrypted message:");
            System.out.println(Encryptor.encrypt(message, rows, cols));
            System.out.println("Decrypted message:");
            System.out.println(Encryptor.decrypt(message, rows, cols));
        }
    }
}

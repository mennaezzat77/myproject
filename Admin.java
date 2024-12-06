import java.util.Scanner;
public class Admin {
    private int adminID;
    private  String password = "yg7136";
    private String email;
    private String name;

    //constructor//
    public Admin(int adminID, String email, String name) {
        this.adminID = adminID;
        this.email = email;
        this.name = name;
    }

    public void check() {
        Scanner scanner = new Scanner(System.in);
        boolean cond;

        // Start the do-while loop
        do {
            System.out.print("Enter password: ");
            String enteredPassword = scanner.nextLine();  // Read user input for the password

            // Check if the entered password matches the stored one
            if (password.equals(enteredPassword)) {
                System.out.println("Correct password");
                cond = true;  // exit
            } else {
                System.out.println("Incorrect password. Try again.");
                cond = false;  // keep looping
            }
        } while (!cond);
    }

}

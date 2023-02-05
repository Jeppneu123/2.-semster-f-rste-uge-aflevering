import java.util.Scanner;

public class Password {

    public static void main(String[] args) {

        String password;
        String username;

        Scanner yourPassword = new Scanner(System.in);
        Scanner yourUsername = new Scanner(System.in);
        System.out.println("Please enter your username & password");

        username = yourUsername.nextLine();
        password = yourPassword.nextLine();

        if (username.length() > 10){
            System.out.println("Too long");
        } else if (password.contains("#")){
            System.out.println("Invalid");
        } else {
            System.out.println("Accepted");
        }
    }
}

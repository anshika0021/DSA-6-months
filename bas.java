import java.util.Scanner;
import java.util.*;
class Connector extends Exception {
    public Connector(String message) {
        super(message);
    }
}

class Character extends Exception {
    public Character(String message) {
        super(message);
    }
}

public class bas {

    public static void validatePassword(String password) throws Connector, Character {
        if (password.length() < 5) {
            throw new Connector("5 digit se jada hona chaiye");
        }

        boolean hasDigit = false;
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                hasDigit = true;
                break;
            }
        }

        if (!hasDigit) {
            throw new Character("1 digit ho");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = scanner.nextLine();

        try {
            validate(password);
            System.out.println("Account create");
        } 
        catch (Connector s) {
            System.out.println(s.getMessage());
        } 
        catch(Character s)
        {out.print(s.getMessage());
        }

    }
}

package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        User user = new User("mail@ukr.net", "1234567890", "1234567890");
        UserService userService = new UserService();
        userService.registerUser(user);
    }
}

import entities.User;

import java.time.LocalDate;

public class Hibernate {
    public static void main(String[] args) {
        User user = new User("John", "Doe", "jonhDoe", LocalDate.now());
    }
}

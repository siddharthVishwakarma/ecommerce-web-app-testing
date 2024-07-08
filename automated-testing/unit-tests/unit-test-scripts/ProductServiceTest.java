import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {

    @Test
    public void testUserLogin() {
        UserService userService = new UserService();
        User user = new User("testuser", "password");
        assertTrue(userService.login(user));
    }

    @Test
    public void testUserRegistration() {
        UserService userService = new UserService();
        User user = new User("newuser", "password");
        assertTrue(userService.register(user));
    }
}

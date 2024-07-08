import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserIntegrationTest {

    @Test
    public void testUserOrderFlow() {
        UserService userService = new UserService();
        OrderService orderService = new OrderService();
        User user = userService.login(new User("testuser", "password"));
        
        Product product = new Product("Test Product");
        orderService.addToCart(user, product);
        
        Order order = orderService.checkout(user);
        assertNotNull(order);
        assertEquals(order.getUser(), user);
    }
}

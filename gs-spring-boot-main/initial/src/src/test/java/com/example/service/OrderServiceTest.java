import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OrderServiceTest {

    private OrderService orderService;

    @BeforeEach 
    void setUp() {
        orderservice = new OrderService();
    }

    @Test 
    void testCalculateTotal_NormalInput() {
        double[] prices = {17.49, 11.99, 6.49};
        assertEquals(35.97, orderService.calculateTotal(prices), 0.01);
    }

    @Test 
    void testCalculateTotal_NullInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            orderService.calculateTotal(null);
        });
        assertEquals("Order cannot be empty", exception.getMessage());
    }

    @Test 
    void testCalculateTotal_EdgeCase() {
        double[] prices = {-5.99, 10.99};
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            orderService.calculateTotal(prices);
        });
        assertEquals("Invalid Item Price", exception.getMessage());
    }
    
}

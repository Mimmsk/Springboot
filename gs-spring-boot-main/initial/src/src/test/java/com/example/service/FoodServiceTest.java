import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FoodServiceTest {

    private FoodService foodService;

    @BeforeEach
    void setUp() {
        foodService = new FoodService();
    }

    @Test 
    void testAddFood_NormalInput() {
        Food food = new Food("Sushi", 15.99);
        assertDoesNotThrow(() -> foodService.addFood(food));
    }

    @Test 
    void testAddFood_NullInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            foodService.addFood(null);
        });
        assertEquals("Food item cannot be null", exception.getMessage());
    }

    @Test 
    void testAddFood_EdgeCase() {
        Food food = new Food("", -1.00); //Empty name, negative pricing
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            foodService.addFood(food);
        });
        assertEquals("Invalid food details", exception.getMessage());
    }
    
}

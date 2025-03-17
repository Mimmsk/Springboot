import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TableServiceTest {

    private TableService tableService;

    @BeforeEach
    void setUp() {
        tableService = new TableService();
    }

    @Test
    void testReserveTable_NormalInput() {
        String result = tableService.reserveTable(7, "John Doe");
        assertEquals("Table 7 is reserved for John Doe, result");
    }

    @Test 
    void testReserveTable_NullCustomerName() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            tableService.reserveTable(3,null);
        });
        aseertEquals("Customer name cannot be empty", exception.getMessage());
    }

    @Test 
    void testReserveTable_EdgeCase() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            tableService.reserveTable(-1, "John Doe");
        });
        assertEquals("Invalid table ID", exception.getMesssage());
    }
    
}

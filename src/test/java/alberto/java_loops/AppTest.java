package alberto.java_loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    public void testGenerateTable(){
        MultiplicationTable mt = new MultiplicationTable();

        String[] expectedOutput = {
            "5 x 1 = 5", "5 x 2 = 10", "5 x 3 = 15", "5 x 4 = 20",
            "5 x 5 = 25", "5 x 6 = 30", "5 x 7 = 35",
            "5 x 8 = 40", "5 x 9 = 45", "5 x 10 = 50"
        };
        assertArrayEquals(expectedOutput, mt.generateTable(5));
    }

    @Test
    public void testGenerateTableNegative(){
        MultiplicationTable mt = new MultiplicationTable();
            try {
                mt.generateTable(-2);
            } catch (IllegalArgumentException e){
                assertEquals("El valor de n no puede ser negativo", e.getMessage());
            }
    }
}

package org.factoriaf5.java_loops;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JavaLoopsTest {
    
    private JavaLoops javaLoops;

    @BeforeEach
    public void init() {
        this.javaLoops = new JavaLoops();
    }


    @Test
    public void testTablaDeMultiplicar() {
        
        int num1 = 4;

        // When - Cuando
        String result = javaLoops.tablaDeMultiplicar(num1);

        // Then - Entonces
        assertEquals("4 x 1 = 4\n4 x 2 = 8\n4 x 3 = 12\n4 x 4 = 16\n4 x 5 = 20\n4 x 6 = 24\n4 x 7 = 28\n4 x 8 = 32\n4 x 9 = 36\n4 x 10 = 40", result);
        
    }
}

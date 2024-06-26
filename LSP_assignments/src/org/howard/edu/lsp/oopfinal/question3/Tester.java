package org.howard.edu.lsp.oopfinal.question3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Tester {

    @Test
    public void testCreateCircle() {
        Shape circle = ShapeFactory.createShape("Circle");
        assertNotNull(circle);
        assertTrue(circle instanceof Circle);
    }

    @Test
    public void testCreateRectangle() {
        Shape rectangle = ShapeFactory.createShape("Rectangle");
        assertNotNull(rectangle);
        assertTrue(rectangle instanceof Rectangle);
    }

    @Test
    public void testCreateInvalidShape() {
        assertThrows(IllegalArgumentException.class, () -> {
            ShapeFactory.createShape("Invalid");
        });
    }
}

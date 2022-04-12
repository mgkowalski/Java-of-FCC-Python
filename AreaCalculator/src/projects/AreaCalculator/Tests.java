package projects.AreaCalculator;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Tests {
    @Test
    public void RectangleArea(){
        Rectangle test = new Rectangle(5, 5);
        assertEquals(25d, test.getArea());
        }

    @Test
    public void RectangleString(){
        Rectangle test = new Rectangle(5, 5);
        assertEquals("Rectangle(width=5, height=5)", test.toString());
    }

    @Test
    public void SetGetHeight() {
        Rectangle test = new Rectangle(5, 5);
        test.setHeight(2);
        assertEquals(2, test.getHeight());
    }

    @Test
    public void SetGetWidth() {
        Rectangle test = new Rectangle(5, 5);
        test.setWidth(3);
        assertEquals(3, test.getWidth());
    }

    @Test
    public void RectanglePicture() {
        Rectangle test = new Rectangle(2, 2);
        assertEquals("**\n**\n", test.getPicture());
    }



    }

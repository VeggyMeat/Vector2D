import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Vector2DTest {
    @Test
    public void testConstructor() {
        Vector2D v = new Vector2D(3, 4);
        assertEquals(3, v.getX(), 0.01);
        assertEquals(4, v.getY(), 0.01);
        v = new Vector2D();
        assertEquals(0, v.getX(), 0.01);
        assertEquals(0, v.getY(), 0.01);
    }

    @Test
    public void testMagnitude() {
        Vector2D v = new Vector2D(3, 4);
        assertEquals(5, v.magnitude(), 0.01);
    }

    @Test
    public void testNormalize() {
        Vector2D v = new Vector2D(3, 4);
        Vector2D normalized = v.normalize();
        assertEquals(0.6, normalized.getX(), 0.01);
        assertEquals(0.8, normalized.getY(), 0.01);
    }

    @Test
    public void testAdd() {
        Vector2D v1 = new Vector2D(3, 4);
        Vector2D v2 = new Vector2D(5, 6);
        Vector2D sum = Vector2D.add(v1, v2);
        assertEquals(8, sum.getX(), 0.01);
        assertEquals(10, sum.getY(), 0.01);
    }

    @Test
    public void testSub() {
        Vector2D v1 = new Vector2D(3, 4);
        Vector2D v2 = new Vector2D(5, 6);
        Vector2D diff = Vector2D.sub(v1, v2);
        assertEquals(-2, diff.getX(), 0.01);
        assertEquals(-2, diff.getY(), 0.01);
    }

    @Test
    public void testDot() {
        Vector2D v1 = new Vector2D(3, 4);
        Vector2D v2 = new Vector2D(5, 6);
        assertEquals(39, Vector2D.dot(v1, v2), 0.01);
    }

    @Test
    public void testGets() {
        Vector2D v = new Vector2D(3, 4);
        assertEquals(3, v.getX(), 0.01);
        assertEquals(4, v.getY(), 0.01);
    }

    @Test
    public void testSets() {
        Vector2D v = new Vector2D(3, 4);
        v.setX(5f);
        v.setY(6f);
        assertEquals(5, v.getX(), 0.01);
        assertEquals(6, v.getY(), 0.01);
    }
}
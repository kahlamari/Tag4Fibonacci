import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    @Test
    public void fibonacciTest_whenN0_then0() {
        // GIVEN
        int a = 0;

        // WHEN
        int actual = Fibonacci.fibonacci(a);

        // THEN
        assertEquals(0,actual);
    }

    @Test
    public void fibonacciTest_whenN1_then1() {
        // GIVEN
        int a = 1;

        // WHEN
        int actual = Fibonacci.fibonacci(a);

        // THEN
        assertEquals(1,actual);
    }

    @Test
    public void fibonacciTest_whenN2_then1() {
        // GIVEN
        int a = 2;

        // WHEN
        int actual = Fibonacci.fibonacci(a);

        // THEN
        assertEquals(1,actual);
    }

    @Test
    public void fibonacciTest_whenN3_then2() {
        // GIVEN
        int a = 3;

        // WHEN
        int actual = Fibonacci.fibonacci(a);

        // THEN
        assertEquals(2,actual);
    }

    @Test
    public void fibonacciTest_whenN4_then3() {
        // GIVEN
        int a = 4;

        // WHEN
        int actual = Fibonacci.fibonacci(a);

        // THEN
        assertEquals(3,actual);
    }
    @Test
    public void fibonacciTest_whenN5_then5() {
        // GIVEN
        int a = 5;

        // WHEN
        int actual = Fibonacci.fibonacci(a);

        // THEN
        assertEquals(5,actual);
    }
}
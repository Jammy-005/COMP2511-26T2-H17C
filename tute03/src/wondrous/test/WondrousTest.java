package wondrous.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import wondrous.Wondrous;

public class WondrousTest {
    // @Test
    // public void testBasic() {
    //     Wondrous w = new Wondrous();
    //     List<Integer> expected = new ArrayList<Integer>(Arrays.asList(3, 10, 5, 16, 8, 4, 2, 1));

    //     assertEquals(expected, w.wondrous(3));
    // }

    //If the starting term is 1, then an empty list is returned.
    // @Test
    // public void testOne() {
    //     Wondrous w = new Wondrous();
    //     List<Integer> expected = new ArrayList<Integer>();
    //     assertEquals(expected, w.wondrous(1));
    // }

    public static void main(String[] args) {
        Wondrous w = new Wondrous();

        List<Integer> expected1 = new ArrayList<Integer>(Arrays.asList(3, 10, 5, 16, 8, 4, 2, 1));
        assertEquals(expected1, w.wondrous(3));

        List<Integer> expected2 = new ArrayList<Integer>();
        assertEquals(expected2, w.wondrous(1));
    }
}

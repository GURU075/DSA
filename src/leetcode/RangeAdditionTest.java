//package leetcode;
//
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//
//public class RangeAdditionTest {
//
//    private final RangeAddition solution = new RangeAddition();
//
//    @Test
//    public void testExampleCase() {
//        int length = 5;
//        int[][] updates = {
//                { 1, 3, 2 },
//                { 2, 4, 3 }
//        };
//        int[] expected = { 0, 2, 5, 5, 3 };
//        assertArrayEquals(expected, solution.getModifiedArray(length, updates), "Example case should match");
//    }
//
//    @Test
//    public void testNoUpdates() {
//        int length = 4;
//        int[][] updates = {};
//        int[] expected = { 0, 0, 0, 0 };
//        assertArrayEquals(expected, solution.getModifiedArray(length, updates), "No updates should result in zeros");
//    }
//
//    @Test
//    public void testFullRangeUpdate() {
//        int length = 3;
//        int[][] updates = {
//                { 0, 2, 5 }
//        };
//        int[] expected = { 5, 5, 5};
//        assertArrayEquals(expected, solution.getModifiedArray(length, updates),
//                "Full range update should affect all elements");
//    }
//
//    @Test
//    public void testOverlappingUpdates() {
//        int length = 6;
//        int[][] updates = {
//                { 1, 4, -2 },
//                { 0, 3, 5 }
//        };
//        // Expect: [5, 3, 3, 3, -2, 0]
//        int[] expected = { 5, 3, 3, 3, -2, 0 };
//        assertArrayEquals(expected, solution.getModifiedArray(length, updates),
//                "Overlapping updates should sum correctly");
//    }
//
//    @Test
//    public void testBoundaryConditions() {
//        int length = 5;
//        // Update first element only
//        int[][] updatesStart = { { 0, 0, 10 } };
//        int[] expectedStart = { 10, 0, 0, 0, 0 };
//        assertArrayEquals(expectedStart, solution.getModifiedArray(length, updatesStart));
//
//        // Update last element only
//        int[][] updatesEnd = { { 4, 4, 10 } };
//        int[] expectedEnd = { 0, 0, 0, 0, 10 };
//        assertArrayEquals(expectedEnd, solution.getModifiedArray(length, updatesEnd));
//    }
//}

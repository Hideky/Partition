import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.*;
import org.junit.Test;
import java.lang.IllegalArgumentException;
import java.lang.NullPointerException;

public class ToolsTest {
	@Test
	public void evaluatesPartitionWhenSizeEqualZero() {
		// Test result when size argument are equal to 0
        try {
        	ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
            List<List<Integer>> result = Tools.partition(list, 0);
            fail();
        } catch (Exception e) {
            assertEquals(IllegalArgumentException.class.getName(), e.getClass().getName());
        }
    }

	@Test
	public void evaluatesPartitionWhenListAreNull() {
		// Test result when list argument are null
        try {
        	ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
            List<List<Integer>> result = Tools.partition(null, 2);
            fail();
        } catch (Exception e) {
            assertEquals(NullPointerException.class.getName(), e.getClass().getName());
        }
    }

	@Test
	public void evaluatesPartitionWhenEqualPartition() {
		// Test result when list and size argument create equal partition
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		ArrayList<List<Integer>> excepted = new ArrayList<List<Integer>>();
		excepted.add(Arrays.asList(1,2,3));
		excepted.add(Arrays.asList(4,5,6));
		List<List<Integer>> result = Tools.partition(list, 3);

		assertEquals(excepted, result);
    }

	@Test
	public void evaluatesPartitionWhenUnequalPartition() {
		// Test result when list and size argument create unequal partition
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		ArrayList<List<Integer>> excepted = new ArrayList<List<Integer>>();
		excepted.add(Arrays.asList(1,2,3,4));
		excepted.add(Arrays.asList(5,6));
		List<List<Integer>> result = Tools.partition(list, 4);

		assertEquals(excepted, result);
    }

	@Test
	public void evaluatesPartitionWhenSizeGreaterThanListSize() {
		// Test result when list and size greater than list size 
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		ArrayList<ArrayList<Integer>> excepted = new ArrayList<ArrayList<Integer>>(Arrays.asList(list));
		List<List<Integer>> result = Tools.partition(list, 8);

		assertEquals(excepted, result);
    }

}
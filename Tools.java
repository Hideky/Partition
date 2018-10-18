import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.IllegalArgumentException;

class Tools {
	public static <T> List<List<T>> partition(List<T> list, final int size) {
	/**
		Partition.
		Allows partitioning a list based on a defined partition size
		@param list List to partition
		@param size Size of a partition
	**/
		if (size <= 0)
			throw new IllegalArgumentException("Size need to be > 0");

		List<List<T>> partitionList = new ArrayList<List<T>>();
		final int S = list.size();
		for (int i = 0; i < S; i += size) {
			partitionList.add(new ArrayList<T>(
				list.subList(i, Math.min(S, i + size)))
			);
		}
		return partitionList;
	}
}
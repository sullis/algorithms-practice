package alogirthms.sort;

public class SelectionSort<T extends Comparable<T>> implements ArraySorter<T> {

	@Override
	public String getAlgorithm() {
		return "SelectionSort O(N^2) (N^2/2 Compares + N Exchanges)";
	}

	@Override
	public void sort(T[] array) {
		int length = array.length;
		for (int index = 0; index < length; index++) {
			int minIndex = index;
			for (int index2 = index+1; index2 < length; index2++) {
				if (less(array[index2], array[minIndex])) {
					minIndex = index2;
				}
			}
			exchange(array, index, minIndex);
		}
	}


}

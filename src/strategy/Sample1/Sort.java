package strategy.Sample1;

import java.util.Arrays;
public class Sort {
	public static <T> T[] sort(T[] arr, MyComparator<T> comp) {
		int k = 0;
		T t = null;
		for (int i = 0; i < arr.length - 1; i++) {
			k = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (comp.compare(arr[k], arr[j]) > 0) {
					k = j;
				}
			}
			if (k != i) {
				t = arr[i];
				arr[i] = arr[k];
				arr[k] = t;
			}
		}
		return arr;
	}

	public static <T> void print(T[] arr) {
		System.out.println(Arrays.toString(arr));
	}
}

package helpers;

public class Helpers {
	public static boolean containsDuplicates(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (i != j && numbers[i] == numbers[j])
					return true;
			}
		}
		return false;
	}

	public static boolean binarySearch(int x, int[] sortedNumbers) {
		int end = sortedNumbers.length - 1;
		int start = 0;
		while (start <= end) {
			int mid = (end - start) / 2 + start;
			if (sortedNumbers[mid] == x)
				return true;
			else if (sortedNumbers[mid] > x)
				end = mid - 1;
			else
				start = mid + 1;
		}
		return false;
	}
}

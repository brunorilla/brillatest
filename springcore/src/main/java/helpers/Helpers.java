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
	/*
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
	*/
	public static int[] bubbleSort(int[] numbers) {
		int stepsCounter = 0;
		for (int i = 1; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length - i; j++) {
				stepsCounter++;
				if (numbers[j] > numbers[j + 1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;

				}
			}

		}
		System.out.println("Steps: " + stepsCounter);
		return numbers;
	}

	public static int[] bubbleSortImproved(int[] numbers) {
		int stepsCounter = 0;
		int i = 0;
		boolean swapOcurred = true;
		while (swapOcurred) {
			swapOcurred = false;
			i++;
			for (int j = 0; j < numbers.length - i; j++) {
				stepsCounter++;
				if (numbers[j] > numbers[j + 1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
					swapOcurred = true;

				}
			}
		}
		System.out.println("Steps: " + stepsCounter);
		return numbers;
	}

	public static boolean binarySearch(int x, int[] sortedNumbers) {
		return binarySearch(x, sortedNumbers, 0, sortedNumbers.length);
	}
	
	public static boolean binarySearch(int x, int[] sortedNumbers, int start, int end) {
		if (start <= end) {
			int mid = (end - start) / 2 + start;
			if (sortedNumbers[mid] == x)
				return true;
			if (sortedNumbers[mid] > x)
				return binarySearch(x, sortedNumbers, start, mid - 1);
			return binarySearch(x, sortedNumbers, mid + 1, end);
		}
		return false;
	}
	
	public static void swap(int[] numbers, int j, int k) {
        int temp = numbers[j];
        numbers[j] = numbers[k];
        numbers[k] = temp;
    }

}

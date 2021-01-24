package findDuplicates;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[4];
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 1;
		
		System.out.println(Helpers.containsDuplicates(numbers));
		
	}

}

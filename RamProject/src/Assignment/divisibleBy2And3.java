package Assignment;

public class divisibleBy2And3 {

	public static void main(String[] args) {

		//int nums[] = new int[5];
		
		int nums[] = {2,3,18,18,6};

		int sum = 0;

		int count = 0;

		int n = 5;

		for (int i = 0; i < n; i++) {

			if (nums[i] % 3 == 0 && nums[i] % 2 == 0) {

				sum += nums[i];
				count++;
			}
		}
		System.out.println(sum);
		System.out.println(count);
	}
}

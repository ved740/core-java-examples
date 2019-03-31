import java.util.Arrays;
import java.util.Collections;

public class ArraysUtil {
	
	static void processNums(int...numbers) {
//		print all numbers
		for(int num: numbers) {
			System.out.println("Num : " + num);
		}
//		max number
		int max = 0;
		for(int num: numbers) {
			max = num > max ? num : max; 
		}
		System.out.printf("Max number : %s", max);
//		sort in descending
		Integer[] arr = new Integer[numbers.length];
		for(int i=0; i<numbers.length; i++) {
			arr[i] = numbers[i];
		}
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println("Descending sorted : " + Arrays.toString(arr));
//		find average
		int sum = 0;
		for(int num: numbers) {
			sum += num;
		}
		System.out.println("Average : " + sum/numbers.length);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraysUtil.processNums(12, 23, 78, 9, 65, 34);
	}

}

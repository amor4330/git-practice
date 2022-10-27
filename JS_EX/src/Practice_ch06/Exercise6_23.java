package Practice_ch06;

public class Exercise6_23 {

	public static int max(int[] arr) {
		
		if(arr == null || arr.length == 0) return -999999;
		int max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			max = max > arr[i] ? max : arr[i];
		}
		
		return max;
	}
}

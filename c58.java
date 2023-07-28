import java.util.*;

class c58{
	public static void main(String[] args) {
		Integer arr[] = new Integer[]{1, 2, 3, 4};
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		List<Integer> li = Arrays.asList(arr);
		System.out.println(li);

		System.out.println(Collections.max(li));
		System.out.println(Collections.min(li));

	}
}
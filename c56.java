import java.util.*;

class c56{
	public static void main(String[] args) {
		Integer arr[] = new Integer[]{1, 2, 3, 4};
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		List<Integer> li = Arrays.asList(arr);
		System.out.println(li);

		Integer arr1[] = li.toArray(new Integer[li.size()]);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr1[i]);
		}
	}
}
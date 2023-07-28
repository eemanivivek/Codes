import java.util.*;
class c35 {
  int binarySearch(int arr[], int x, int low, int high) {
    Arrays.sort(arr);
    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (arr[mid] == x)
        return mid;

      if (arr[mid] < x)
        low = mid + 1;

      else
        high = mid - 1;
    }

    return -1;
  }

  public static void main(String args[]) {
    c35 ob = new c35();
    Scanner sc= new Scanner(System.in);
    int s = sc.nextInt();
    int arr[]=new int[s];
    for(int i=0;i<s;i++){
      arr[i]=sc.nextInt();
    }
    int n = arr.length;
    int x = sc.nextInt();
    int res = ob.binarySearch(arr, x, 0, n - 1);
    if (res == -1)
      System.out.println("Not found");
    else
      System.out.println("Element found at index " + res);
  }
}
package vzdornov.algo;

public class MergeSort implements ISort {

  @Override
  public void sort(int[] arr) {
    mergeSort(arr);
  }

  public static void mergeSort(int[] arr) {
    if (arr.length <= 1) {
      return;
    }
    int mid = arr.length / 2;
    int[] left = new int[mid];
    int[] right = new int[arr.length - mid];
    for (int i = 0; i < mid; i++) {
      left[i] = arr[i];
    }
    for (int i = mid; i < arr.length; i++) {
      right[i - mid] = arr[i];
    }
    mergeSort(left);
    mergeSort(right);
    merge(arr, left, right);
  }

  public static void merge(int[] arr, int[] left, int[] right) {
    int j = 0;
    int k = 0;
    for (int i = 0; i < arr.length; i++) {
      if (j == left.length) {
        arr[i] = right[k++];
      } else if (k == right.length) {
        arr[i] = left[j++];
      } else if (left[j] < right[k]) {
        arr[i] = left[j++];
      } else {
        arr[i] = right[k++];
      }
    }
  }

}

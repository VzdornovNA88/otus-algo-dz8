package vzdornov.algo;

public class Quicksort implements ISort  {

  @Override
  public void sort(int[] arr) {
    quickSort(arr);
  }

  public static void quickSort(int[] arr) {
    quickSort(arr, 0, arr.length - 1);
  }

  public static void quickSort(int[] arr, int start, int end) {
    if (start < end) {
      int pivotIndex = partition(arr, start, end);
      quickSort(arr, start, pivotIndex - 1);
      quickSort(arr, pivotIndex + 1, end);
    }
  }

  public static int partition(int[] arr, int start, int end) {
    int pivotIndex = pickPivotIndex(start, end);
    int pivot = arr[pivotIndex];
    swap(arr, pivotIndex, end);
    int index = start;
    for (int i = start; i < end; i++) {
      if (arr[i] < pivot) {
        swap(arr, i, index);
        index++;
      }
    }
    swap(arr, index, end);
    return index;
  }

  public static int pickPivotIndex(int start, int end) {
    return (int) (start + (end - start + 1) * Math.random());
  }

  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

}

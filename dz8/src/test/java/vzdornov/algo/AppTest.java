package vzdornov.algo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class AppTest 
{

  ISort[] sorts = { new Quicksort(),new MergeSort() };

  @Test
  void testSort() {

    final int[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
    String arrayExpected = "[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]";
    for(int i= 0; i < sorts.length; i++) {
      sorts[i].sort(data);
      assertEquals(arrayExpected, Arrays.toString(data));
    }
  }
}

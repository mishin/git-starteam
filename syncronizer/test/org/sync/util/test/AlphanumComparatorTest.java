
package org.sync.util.test;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;
import org.sync.util.AlphanumComparator;
import static org.junit.Assert.*;

/**
 *
 * @author steve
 */
public class AlphanumComparatorTest {
  
  public AlphanumComparatorTest() {
  }

  @Test
  public void testCompare() {
    ArrayList<String> list = new ArrayList<String>();
    list.add("Package 1.2.30.0");
    list.add("Package 2.0.1.0");
    list.add("Package 1.1.31.0");
    list.add("Package 1.2.31.0");
    list.add("Package 1.3.29.0");
    list.add("Package 1.3.3.0");

    Object unsorted[] = list.toArray();
    Arrays.sort(unsorted, new AlphanumComparator());

    assertArrayEquals(new String[]
      {
        "Package 1.1.31.0", "Package 1.2.30.0", "Package 1.2.31.0",
        "Package 1.3.3.0" , "Package 1.3.29.0", "Package 2.0.1.0"
      }, unsorted);
  }
}

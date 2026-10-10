/*
 * MIT License
 *
 * Copyright (c) 2017-2022 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


/*
 * Tests for 30 Seconds of Java code library
 *
 */
class QuickSortSnippetTest {
  /**
   * Tests for {@link QuickSortSnippet#quickSort(int[], int, int)}.
   */
  @Test
  void testQuickSort() {
    var arr1 = new int[] {7, 13, 3, 1, 8, 5};
    QuickSortSnippet.quickSort(arr1, 0, arr1.length - 1);
    assertEquals(6, arr1.length);
    assertEquals(1, arr1[0]);
    assertEquals(3, arr1[1]);
    assertEquals(5, arr1[2]);
    assertEquals(7, arr1[3]);
    assertEquals(8, arr1[4]);
    assertEquals(13, arr1[5]);

    var arr2 = new int[] {10, 8, 6, 4, 2};
    QuickSortSnippet.quickSort(arr2, 0, arr2.length - 1);
    assertEquals(5, arr2.length);
    assertEquals(2, arr2[0]);
    assertEquals(4, arr2[1]);
    assertEquals(6, arr2[2]);
    assertEquals(8, arr2[3]);
    assertEquals(10, arr2[4]);
  }
}
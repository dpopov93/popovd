package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**.
 * Class for test array
 * @author dpopov93 (mailto:d.popov93@mail.ru)
 * @since 18.06.2017
 * @version 1.0
 */
public class BubbleSortTest {
    /**
	* Test bubble sort array with ten elements.
	*/
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
		BubbleSort bs = new BubbleSort();
		int[] array = {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
		int[] result = bs.sort(array);
		int[] expected = {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
		assertThat(result, is(expected));
    }
}
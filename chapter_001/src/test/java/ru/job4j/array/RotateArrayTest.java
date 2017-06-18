package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**.
 * Class for test rotate array
 * @author dpopov93 (mailto:d.popov93@mail.ru)
 * @since 18.06.2017
 * @version 1.0
 */
public class RotateArrayTest {
    /**.
	* Test rotate array with two rows and two cols
	*/
    @Test
    public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
		RotateArray ra = new RotateArray();
		int[][] array = {{1, 2}, {3, 4}};
		int[][] result = ra.rotate(array);
		int[][] expected = {{3, 1}, {4, 2}};
		assertThat(result, is(expected));
    }

	/**.
	* Test rotate array with three rows and three cols
	*/
	@Test
    public void whenRotateThreeRowThreeColArrayThenRotatedArray() {
        RotateArray ra = new RotateArray();
		int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] result = ra.rotate(array);
		int[][] expected = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
		assertThat(result, is(expected));
    }
}
package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**.
 * Class for test array duplicate remove test
 * @author dpopov93 (mailto:d.popov93@mail.ru)
 * @since 20.06.2017
 * @version 1.0
 */
public class ArrayDuplicateTest {
    /**.
	* Test removing duplicates of array
	*/
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate ad = new ArrayDuplicate();
		String[] array = {"Привет", "Мир", "Привет", "Супер", "Мир"};
		String[] result = ad.remove(array);
		String[] expected = {"Привет", "Мир", "Супер"};
		assertThat(result, is(expected));
    }
}
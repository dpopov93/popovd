package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**.
 * Class for test array
 * @author dpopov93 (mailto:d.popov93@mail.ru)
 * @since 10.05.2017
 * @version 1.0
 */
public class TurnTest {
    /**
	* Test turn array with even elements.
	*/
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
		Turn turn = new Turn();
		int[] array = {2, 6, 1, 4};
		int[] result = turn.back(array);
		int[] expected = {4, 1, 6, 2};
		assertThat(result, is(expected));
    }

    /**
	* Test turn array with odd elements.
	*/
    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
		int[] array = {1, 2, 3, 4, 5};
		int[] result = turn.back(array);
		int[] expected = {5, 4, 3, 2, 1};
		assertThat(result, is(expected));
    }
}
package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test max.
 *
 * @author Denis Popov (mailto:d.popov93@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class MaxTest {
	/**
	* Test max method.
	*/
    @Test
    public void whenFirstMoreThanSecond() {
        Max max = new Max();
		int result = max.max(10, 5);
        int expected = 10;
        assertThat(result, is(expected));
    }
}
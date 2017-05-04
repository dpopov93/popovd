package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Denis Popov (mailto:d.popov93@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class PointTest {
	/**
	* Test point element of function.
	*/
    @Test
    public void whenElementOfFunction() {
        Point point = new Point(10, 5);
        boolean result = point.is(10, 3);
        boolean expected = false;
        assertThat(result, is(expected));
    }
}
package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Denis Popov (mailto:d.popov93@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class TriangleTest {
	/**
	* Test triangle area calculation.
	*/
    @Test
    public void whenElementOfFunction() {
		Triangle triangle = new Triangle(new Point(1, 1), new Point(-2, 4), new Point(-2, -2));
		double result = triangle.area();
		double expected = 8.99;
		assertThat(result, closeTo(expected, 0.01));
    }
}
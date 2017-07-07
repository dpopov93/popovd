package ru.job4j.controlone;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**.
 * Test.
 *
 * @author Denis Popov (mailto:d.popov93@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class StringCheckTest {
	/**.
	* Test for checking String contain substring.
	*/
    @Test
    public void whenSubstringInOriginalString() {
        StringCheck strChk = new StringCheck();
        boolean result = strChk.contains("Привет", "иве");
        boolean expected = true;
        assertThat(result, is(expected));
    }
}
package ru.job4j.professions;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

/**
 * Test.
 *
 * @author Denis Popov (mailto:d.popov93@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class TeacherTest {
  /**
   * Test when Teacher asking pupil then pupil reply "Answer"
   */
  @Test
  public void whenTeacherAskPupilThenAnswer() {
    Teacher teacher = new Teacher("Malcolm");
    Pupil pupil = new Pupil("Tracey");
    String result = teacher.ask(pupil, "Some question");
    String expected = "Answer";
    Assert.assertThat(result, is(expected));
  }
}
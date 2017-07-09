package ru.job4j.professions;

/**
 * Class of teacher
 * @author dpopov93 (mailto:d.popov93@mail.ru)
 * @since 09.07.2017
 * @version 1.0
 */
public class Teacher extends Profession {
  /**
   * Set name for teacher
   * @param name Name of new teacher
   */
  public Teacher(String name) {
    super(name);
  }

  /**
   * Ask question to a Pupil
   * @param pupil selected interlocutor
   * @param question string with question for interlocutor
   * @return interlocutor's reply
   */
  public String ask(Pupil pupil, String question) {
    return pupil.reply(question);
  }

  /**
   * Teach some pupil
   * @param pupil selected pupil
   */
  public void teach(Pupil pupil) {
    pupil.learn(this);
  }
}

package ru.job4j.professions;

/**
 * Class of doctor
 * @author dpopov93 (mailto:d.popov93@mail.ru)
 * @since 09.07.2017
 * @version 1.0
 */
public class Doctor extends Profession {
  /**
   * Constructor of Doctor class
   * @param name Set new doctor name
   */
  public Doctor(String name) {
    super(name);
  }

  /**
   * Heal selected people
   * @param people Select people
   * @return Return status of curing operation
   */
  public boolean cure(People people) {
    return people.applyingCure();
  }

  /**
   * Ask some question to a people
   * @param people Selected people
   * @param question Some question
   * @return Return Answer
   */
  public String ask(People people, String question) {
    return people.reply(question);
  }

  /**
   * Get reply from interlocutor
   * @param question text of interlocutor's question
   * @return Return Answer
   */
  public String reply(String question) {
    return question + "? Answer!";
  }
}

package ru.job4j.professions;

/**
 * Class of People
 * @author dpopov93 (mailto:d.popov93@mail.ru)
 * @since 09.07.2017
 * @version 1.0
 */
public class People {
  /**
   * Level of people health 0-100
   */
  private int healthLevel;

  /**
   * Number of negative effect 0-127
   */
  private byte negativeEffects;

  /**
   * Health status Normal - True; Bad - False
   */
  private boolean healthStatus;

  /**
   * Ask question to a doctor
   * @param doctor Selected doctor
   * @param question Some question
   * @return Return answer
   */
  public String ask(Doctor doctor, String question) {
    return doctor.reply(question);
  }

  /**
   * Reply to doctor on some question
   * @param question Some question from doctor
   * @return Return answer
   */
  public String reply(String question) {
    return question + "? Answer";
  }

  /**
   * Get heal from doctor
   * @return return status curing operation
   */
  public boolean applyingCure() {
    return true;
  }
}

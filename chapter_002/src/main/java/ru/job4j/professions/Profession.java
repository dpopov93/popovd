package ru.job4j.professions;

/**
 * Class of professions
 * @author dpopov93 (mailto:d.popov93@mail.ru)
 * @since 09.07.2017
 * @version 1.0
 */
public class Profession {
  /**
   * Name of specialist
   */
  private String name;

  /**
   * Contain rating of specialist from 0-5
   */
  private double rating;

  /**
   * Real age of specialist
   */
  private int age;

  /**
   * Current speciality of specialist
   */
  private String speciality;

  /**
   * When does not have diploma, then "Empty",
   * else number with direction of speciality
   */
  private String diploma;

  /**
   * Current status of busyment specialist in boolean
   */
  private boolean busy;

  /**
   * Class constructor
   * @param name set name for new specialist
   */
  public Profession(String name) {
    this.name = name;
  }

  /**
   * Get name of specialist
   * @return Return name of specialist
   */
  public String getName() {
    return this.name;
  }

  /**
   * Ask question to a people
   * @param people selected interlocutor
   * @param question string with question for interlocutor
   * @return interlocutor's reply
   */
  public String ask(Profession people, String question) {
    return people.reply(question);
  }

  /**
   * Get answer from interlocutor
   * @param question text of interlocutor's question
   * @return answer of question
   */
  public String reply(String question) {
    return "Answer";
  }
}

package ru.job4j.professions;

/**
 * Class of Pupil
 * @author dpopov93 (mailto:d.popov93@mail.ru)
 * @since 09.07.2017
 * @version 1.0
 */
public class Pupil {
  /**
   * Current class level
   */
  private int level;

  /**
   * Current skill level
   */
  private String skill;

  /**
   * Favorite subject
   */
  private String favoriteSubject;

  /**
   * Current rating of pupil
   */
  private double rating;

  /**
   * Name of pupil
   */
  private String name;

  /**
   * Constructor of Pupil Class
   * @param name Name of pupil
   */
  public Pupil(String name) {
    this.name = name;
  }

  /**
   * Ask some question to selected teacher
   * @param teacher Select teacher
   * @param question Asked question
   * @return Return reply of teacher
   */
  public String ask(Teacher teacher, String question) {
    return teacher.reply(question);
  }

  /**
   * Reply to teacher
   * @param question Asked by teacher question
   * @return Return Answer
   */
  public String reply(String question) {
    return "Answer";
  }

  /**
   * Learn some skill
   * @param teacher Selected teacher
   */
  public void learn(Teacher teacher) {
    ask(teacher, "Some question");
  }
}

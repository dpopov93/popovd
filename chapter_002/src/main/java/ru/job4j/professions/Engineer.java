package ru.job4j.professions;

/**
 * Class of engineer
 * @author dpopov93 (mailto:d.popov93@mail.ru)
 * @since 09.07.2017
 * @version 1.0
 */
public class Engineer extends Profession {
  /**
   * Constructor for Engineer class
   * @param name Name of new engineer
   */
  public Engineer(String name) {
    super(name);
  }

  /**
   * Develop new device code
   * @param device Name of device
   * @param code Code for install
   */
  public void develop(Device device, String[] code) {
    device.setCode(code);
  }

  /**
   * Check of stability tested device
   * @param device Device name
   * @return Return status of device
   */
  public boolean check(Device device) {
    return device.response();
  }
}

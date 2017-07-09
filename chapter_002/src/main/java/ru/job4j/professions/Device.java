package ru.job4j.professions;

/**
 * Class of Device
 * @author dpopov93 (mailto:d.popov93@mail.ru)
 * @since 09.07.2017
 * @version 1.0
 */
public class Device {
  /**
   * Code of device
   */
  private String[] code;

  /**
   * Current mode status, Normal - True; Debug - False
   */
  private boolean status;

  /**
   * Name of device
   */
  private String name;

  /**
   * Constructor Device class
   * @param name Name of device
   */
  public Device(String name) {
    this.name = name;
  }

  /**
   * Responce on check function
   * @return Return current status
   */
  public boolean response() {
    return true;
  }

  /**
   * Get code of device
   * @return Return code of device
   */
  public String[] getCode() {
    return this.code;
  }

  /**
   * Installing code
   * @param code Code for install
   * @return Return true when successful installation
   */
  public boolean setCode(String[] code) {
    this.code = code;
    return true;
  }
}

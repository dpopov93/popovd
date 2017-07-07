package ru.job4j.controlone;

/**.
 * Class for string'n'string check
 * @author dpopov93 (mailto:d.popov93@mail.ru)
 * @since 07.07.2017
 * @version 1.0
 */
public class StringCheck {
  /**.
   * Функция проверяет, что слово String находиться в другом слове String
   * @param origin исходная строка
   * @param sub искомое слово
   * @return возвращает логическое выражение
   */
  public boolean contains(String origin, String sub) {
    char[] originChar = origin.toCharArray();
    char[] subChar = sub.toCharArray();
    boolean result = false;

    for (int i = 0; i < originChar.length; i++) {
	  if (originChar.length - i >= subChar.length) {
		if (originChar[i] == subChar[0]) {
          int j;
          for (j = 0; j < subChar.length; j++) {
            if (originChar[i + j] != subChar[j]) {
              break;
            }
          }
          if (j == subChar.length) {
            result = true;
        	break;
          }
        }
      }
    }

    return result;
  }
}
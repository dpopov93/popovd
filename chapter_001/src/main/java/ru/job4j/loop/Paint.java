package ru.job4j.loop;

/**.
 * Class for paint pyramid
 * @author dpopov93 (mailto:d.popov93@mail.ru)
 * @since 10.05.2017
 * @version 1.0
 */
 public class Paint {
	/**.
	 * Функция строит пирамиду в псевдографике
	 * @param h высота пирамиды
	 * @return строку с пирамидой в псевдографике
	 */
	public String piramid(int h) {
		StringBuilder result = new StringBuilder();

		for (int i = 1; i <= h; i++) {
			for (int j = 0; j <= (h * 2) - 2; j++) {
				if (j <= h - i - 1 || j >= h + i - 1)  {
					result.append(" ");
				} else {
					result.append("^");
				}
			}

			if (i != h) {
				result.append(System.getProperty("line.separator"));
			}
		}

		return result.toString();
	}
 }
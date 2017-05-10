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
			for (int j = (h - 1) - i; j >= 0; j--) { // Вставляем пустые пробелы в начале
				result.append(" ");
			}

			for (int j = 0; j <= i * 2 - 2; j++) { // Вставляем символы пирамиды
				result.append("^");
			}

			for (int j = (h - 1) - i; j >= 0; j--) { // Вставляем пустые пробелы в конце
				result.append(" ");
			}

			result.append(System.getProperty("line.separator"));
		}

		return result.toString().substring(0, result.toString().length() - System.getProperty("line.separator").length());
	}
 }
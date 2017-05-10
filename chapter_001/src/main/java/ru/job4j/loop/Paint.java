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
	 * @param h это высота пирамиды
	 * @return строку с пирамидой в псевдографике
	 */
	public String piramid(int h) {
		StringBuilder result = new StringBuilder();

		for (int i = 1; i <= h; i++) {
			String tmp = "";
			for (int j = (h - 1) - i; j >= 0; j--) { // Вставляем пустые пробелы в начале
				tmp += " ";
			}

			for (int j = 0; j <= i * 2 - 2; j++) { // Вставляем символы пирамиды
				tmp += "^";
			}

			for (int j = (h - 1) - i; j >= 0; j--) { // Вставляем пустые пробелы в конце
				tmp += " ";
			}

			tmp += System.getProperty("line.separator");
			result.append(tmp);
		}

		return result.toString().substring(0, result.toString().length() - 1);
	}
 }
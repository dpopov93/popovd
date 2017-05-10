package ru.job4j.loop;

/**.
 * Class for board
 * @author dpopov93 (mailto:d.popov93@mail.ru)
 * @since 10.05.2017
 * @version 1.0
 */
 public class Board {
	/**.
	 * Функция строит шахматную доску в псевдографике
	 * @param width ширина доски
	 * @param height высота доски
	 * @return факториал числа
	 */
	public String paint(int width, int height) {
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < height; i++) {
			String tmp = "";

			for (int j = 0; j < width; j++) {
				if ((j % 2 == 1 && i % 2 == 1) || (j % 2 == 0 && i % 2 == 0)) {
					tmp += "X";
				} else {
					tmp += "  ";
				}
			}

			tmp += System.getProperty("line.separator");
			result.append(tmp);
		}

		return result.toString();
	}
 }
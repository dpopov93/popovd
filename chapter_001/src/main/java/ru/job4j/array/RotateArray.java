package ru.job4j.array;

/**.
 * Class for sort array by bubble method
 * @author dpopov93 (mailto:d.popov93@mail.ru)
 * @since 18.06.2017
 * @version 1.0
 */
 public class RotateArray {
	/**.
	 * Функция поворачивает по часовой стрелке двумерный массив
	 * @param array исходный массив
	 * @return возвращает повернутый массив
	 */
	public static int[][] rotate(int[][] array) {
		int[][] result = new int[array.length][array.length];

		for (int i = 0; i < array.length; ++i) {
			for (int j = 0; j < array.length; ++j) {
				result[i][j] = array[array.length - j - 1][i];
			}
		}

		return result;
	}
 }
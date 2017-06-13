package ru.job4j.array;

/**.
 * Class for turn array
 * @author dpopov93 (mailto:d.popov93@mail.ru)
 * @since 10.05.2017
 * @version 1.0
 */
 public class Turn {
	/**.
	 * Функция переворачивает исходный массив
	 * @param array исходный массив
	 * @return возвращает инвертированный массив
	 */
	public int[] back(int[] array) {
		int buffer = 0;

		for (int i = array.length; i > array.length / 2; i--) {
			buffer = array[array.length - i];
			array[array.length - i] = array[i - 1];
			array[i - 1] = buffer;
		}

		return array;
	}
 }
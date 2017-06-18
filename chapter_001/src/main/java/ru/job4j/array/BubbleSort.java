package ru.job4j.array;

/**.
 * Class for sort array by bubble method
 * @author dpopov93 (mailto:d.popov93@mail.ru)
 * @since 18.06.2017
 * @version 1.0
 */
 public class BubbleSort {
	/**.
	 * Функция сортирует массив пузырьком
	 * @param array исходный массив
	 * @return возвращает отсортированный массив
	 */
	public int[] sort(int[] array) {
		int buffer = 0;

		for (int j = 0; j < array.length - 1; j++) {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					buffer = array[i];
					array[i] = array[i + 1];
					array[i + 1] = buffer;
				}
			}
		}

		return array;
	}
 }
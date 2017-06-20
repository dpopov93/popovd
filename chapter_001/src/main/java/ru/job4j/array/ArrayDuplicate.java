package ru.job4j.array;

import java.util.Arrays;

/**.
 * Class for delete duplicates from array
 * @author dpopov93 (mailto:d.popov93@mail.ru)
 * @since 20.06.2017
 * @version 1.0
 */
 public class ArrayDuplicate {
	/**.
	 * Функция убирает дубликаты слов в массиве
	 * @param array исходный массив строк
	 * @return возвращает массив без дубликатов строк
	 */
	public String[] remove(String[] array) {
		int matches = 0;
		String buf;
		for (int i = 0; i < array.length - 1 - matches; i++) {
			for (int j = i + 1; j < array.length - 1 - matches; j++) {
				if (j != i && array[j] == array[i]) {
					for (int k = j; k < array.length - 1 - matches; k++) {
						buf = array[k];
						array[k] = array[k + 1];
						array[k + 1] = buf;
					}

					matches++;
				}
			}
		}

		return Arrays.copyOf(array, array.length - 1 - matches);
	}
 }
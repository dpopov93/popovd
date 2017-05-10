package ru.job4j.loop;

/**.
 * Class for counter
 * @author dpopov93 (mailto:d.popov93@mail.ru)
 * @since 10.05.2017
 * @version 1.0
 */
 public class Counter {
	/**.
	 * Функция вычисляет сумму четных чисел в указанном диапазоне
	 * @param start начало диапазона
	 * @param finish конец диапазона
	 * @return возвращает сумму чисел
	 */
	public int add(int start, int finish) {
		int result = 0;

		while (start <= finish) {
			if (start % 2 == 0) {
				result += start;
			}
			start++;
		}

		return result;
	}
 }
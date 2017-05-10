package ru.job4j.loop;

/**.
 * Class for factorial
 * @author dpopov93 (mailto:d.popov93@mail.ru)
 * @since 10.05.2017
 * @version 1.0
 */
 public class Factorial {
	/**.
	 * Функция вычисляет факториал из числа n
	 * @param n число
	 * @return факториал числа
	 */
	public int calc(int n) {
		int result = (n != 0) ? n : 1;

		for (int i = 1; i < n; i++) {
			result *= i;
		}

		return result;
	}
 }
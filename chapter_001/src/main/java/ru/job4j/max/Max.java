package ru.job4j.max;

/**.
 * Class for calculating max
 * @author dpopov93 (mailto:d.popov93@mail.ru)
 * @since 4.05.2017
 * @version 1.0
 */
public class Max {
	/**.
	 * Функция вычисления максимума из аргументов
	 * @param first первое число
	 * @param second второе число
	 * @return возвращает максимальное значение
	 */
	public int max(int first, int second) {
		return (first > second) ? first : second;
	}

	/**.
	 * Функция вычисления максимума из аргументов
	 * @param first первое число
	 * @param second второе число
	 * @param third третье число
	 * @return возвращает максимальное значение
	 */
	public int max(int first, int second, int third) {
		return max(max(first, second), third);
	}
}
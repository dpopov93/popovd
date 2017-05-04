package ru.job4j.condition;

/**.
 * Class for point and calculate point element of some function.
 * @author dpopov93 (mailto:d.popov93@mail.ru)
 * @since 04.05.2017
 * @version 1.0
 */
 public class Point {
	/**.
	 * Поле для хранения значения абсциссы
	 */
	private int x;

	/**.
	 * Поле для хранения значения ординаты
	 */
	private int y;

	/**.
	 * Конструктор класса, инициализирующий значения координат точки
	 * @param x устанавливает значение абсциссы
	 * @param y устанавливает значение ординаты
	 */
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**.
	 * Функция возвращает значение абсциссы
	 * @return возвращает значение x
	 */
	public int getX() {
		return this.x;
	}

	/**.
	 * Функция возвращает значение ординаты
	 * @return возвращает значение y
	 */
	public int getY() {
		return this.y;
	}

	/**.
	 * Функция определяет находится ли точка на фукнции y(x) = a * x + b.
	 * @param a устанавливает значение а
	 * @param b устанавливает значение b
	 * @return возвращает логический ответ
	 */
	public boolean is(int a, int b) {
		return (this.y == (a * this.x + b)) ? true : false;
	}
 }
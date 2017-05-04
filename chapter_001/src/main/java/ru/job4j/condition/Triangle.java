package ru.job4j.condition;

/**.
 * Class for triangle and calculate area of it.
 * @author dpopov93 (mailto:d.popov93@mail.ru)
 * @since 04.05.2017
 * @version 1.0
 */
 public class Triangle {
	/**.
	 * Поле для хранения значения точки a
	 */
	private Point a;

	/**.
	 * Поле для хранения значения точки b
	 */
	private Point b;

	/**.
	 * Поле для хранения значения точки c
	 */
	private Point c;

	/**.
	 * Конструктор класса, инициализирующий значения точек треугольника
	 * @param a устанавливает значение точки a
	 * @param b устанавливает значение точки b
	 * @param c устанавливает значение точки c
	 */
	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	/**.
	 * Функция вычисляет значение площади треугольника
	 * @return возвращает значение площади треугольника
	 */
	public double area() {
		// TODO Можно сделать проверку на существование прямоугольника
		double sideA = calcPointDistance(this.a, this.b);
		double sideB = calcPointDistance(this.b, this.c);
		double sideC = calcPointDistance(this.c, this.a);

		// Находим полупериметр
		double p = (sideA + sideB + sideC) / 2D;

		return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
	}

	/**.
	 * Функция производит вычисления по формуле нахождения расстояния между точками в пространстве
	 * @param point1 первая точка
	 * @param point2 вторая точка
	 * @return возвращает значение расстояния
	 */
	public double calcPointDistance(Point point1, Point point2) {
		return Math.sqrt(Math.pow((double) (point1.getX() - point2.getX()), 2) + Math.pow((double) (point1.getY() - point2.getY()), 2));
	}
 }
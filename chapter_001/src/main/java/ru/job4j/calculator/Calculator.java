package ru.job4j.calculator;

/**.
 * Class for calculating program
 * @author dpopov93 (mailto:d.popov93@mail.ru)
 * @since 28.04.2017
 * @version 1.0
 */
 public class Calculator {
	/**.
	 * Поле для хранения результата
	 */
	private double result;

	/**.
	 * Функция сложения аргументов
	 * @param first первое число
	 * @param second второе число
	 */
    public void add(double first, double second) {
        this.result = first + second;
    }

	/**.
	 * Функция вычитания аргументов
	 * @param first первое число
	 * @param second второе число
	 */
	public void substruct(double first, double second) {
        this.result = first - second;
    }

	/**.
	 * Функция деления аргументов
	 * @param first первое число
	 * @param second второе число
	 */
	public void div(double first, double second) {
        this.result = first / second;
    }

	/**.
	 * Функция умножения аргументов
	 * @param first первое число
	 * @param second второе число
	 */
	public void multiple(double first, double second) {
        this.result = first * second;
    }

    /**.
	 * Функция вывода результата
	 * @return возвращает значение поля result
	 */
    public double getResult() {
        return this.result;
    }
 }
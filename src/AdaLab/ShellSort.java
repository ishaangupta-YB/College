package AdaLab;

import java.util.Arrays;
import java.util.Scanner;

public class ShellSort {
	public static void main(String[] args) {
		Car c1 = new Car("Red");
		Car c2 = new Car("Green");
		Car c3 = new Car("Blue");
		System.out.println("Number of cars created: " + Car.getNumberOfCars());
	}

	static {
		System.out.println("Tester class loaded");
	}
}

class Car {
	private static String color;
	private static int numberOfCars = 0;

	static {
		System.out.println("Car class loaded");
	}

	public Car(String c) {
		color = c;
		numberOfCars++;
	}

	public static String getColor() {
		return color;
	}

	public static int getNumberOfCars() {
		return numberOfCars;
	}
}
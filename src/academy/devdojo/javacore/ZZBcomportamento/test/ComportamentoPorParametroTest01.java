package academy.devdojo.javacore.ZZBcomportamento.test;

import academy.devdojo.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));

    public static void main(String[] args) {
        System.out.println(filterCarByColor(cars, "red"));
        System.out.println(filterCarByYear(cars, 2000));
    }

    private static List<Car> filterCarByColor(List<Car> cars, String color) {
        List<Car> filterColor = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                filterColor.add(car);
            }
        }
        return filterColor;
    }
    private static List<Car> filterCarByYear(List<Car> cars, int year) {
        List<Car> carByYear = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                carByYear.add(car);
            }
        }
        return carByYear;
    }
}

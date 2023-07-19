package academy.devdojo.javacore.ZZBcomportamento.test;

import academy.devdojo.javacore.ZZBcomportamento.dominio.Car;
import academy.devdojo.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));

    public static void main(String[] args) {
        List<Car> greenCars = filter(cars, car -> car.getColor().equals("green"));
        List<Car> redCars = filter(cars, car -> car.getColor().equals("red"));
        List<Car> filterByYear = filter(cars, car -> car.getYear() < 2011);
        System.out.println(greenCars);
        System.out.println(redCars);
        System.out.println(filterByYear);
    }
    private static List<Car> filter(List<Car> cars, Predicate<Car> carPredicate) {
        List<Car> filterColor = new ArrayList<>();
        for (Car car : cars) {
           if (carPredicate.test(car)) {
               filterColor.add(car);
           }
        }
        return filterColor;
    }
}

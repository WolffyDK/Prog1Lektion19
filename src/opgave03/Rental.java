package opgave03;

import java.util.ArrayList;

public class Rental {
    private int number;
    private int days;
    private String date;
    private ArrayList<Car> cars = new ArrayList<>();

    public Rental(int number, int days, String date) {
        this.number = number;
        this.days = days;
        this.date = date;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void addCar(Car car) {
        if (!cars.contains(car)) {
            cars.add(car);
        }
    }

    public void removeCar(Car car) {
        if (!cars.contains(car)) {
            cars.remove(car);
        }
    }

    public double getPrice() {
        double total = 0;
        for (Car car : cars) {
            total += car.getDayPrice() * days;
        }
        return total;
    }
}

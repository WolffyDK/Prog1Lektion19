package opgave03;

public class App {
    public static void main(String[] args) {
        Car car1 = new Car("AB321", 230, 2001);
        Car car2 = new Car("CB221", 200, 2013);
        Car car3 = new Car("GH321", 500, 2025);
        Car car4 = new Car("DS321", 1000, 2025);
        Car car5 = new Car("EW321", 800, 2020);

        Rental rental1 = new Rental(1, 5, "2025-11-03");

        Rental rental2 = new Rental(3, 10, "2025-11-01");

        rental1.addCar(car1);

        rental2.addCar(car2);
        rental2.addCar(car3);
        rental2.addCar(car5);

        System.out.println("Rental 1 koster: " + rental1.getPrice());
        System.out.println("Rental 2 koster: " + rental2.getPrice());


    }
}

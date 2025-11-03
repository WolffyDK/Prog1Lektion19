package opgave03;

public class Car {
    private String license;
    private double pricePerDay;
    private int purchaceYear;

    public Car(String license, double pricePerDay, int purchaceYear) {
        this.license = license;
        this.pricePerDay = pricePerDay;
        this.purchaceYear = purchaceYear;
    }

    public void setDayPrice(double price) {
        this.pricePerDay = price;
    }

    public double getDayPrice() {
        return pricePerDay;
    }

    public String getLicense() {
        return license;
    }

    public int getPurchaceYear() {
        return purchaceYear;
    }
}

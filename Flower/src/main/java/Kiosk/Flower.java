package Kiosk;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Леся on 27.10.2016.
 */
public class Flower extends Booket {
    private String name;
    private String color;
    private double lenght;
    private Date date;
    private double price;

    public Flower() {
    }

    public Flower(String name, String color, double lenght, Date date, double price) {
        this.name = name;
        this.color = color;
        this.lenght = lenght;
        this.date = Calendar.getInstance().getTime();
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", lenght=" + lenght +
                ", date=" + date +
                ", price=" + price +
                '}';
    }
}

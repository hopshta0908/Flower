package Kiosk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Created by Леся on 27.10.2016.
 */
public class Booket {

    private List<Flower>flowerList;
    private double price;

    public Booket() {
    }

    public Booket(List<Flower> flowerList, double price) {

        this.flowerList = flowerList;
        this.price = price;
    }



    public List<Flower> getFlowerList() {
        return flowerList;
    }

    public void setFlowerList(List<Flower> flowerList) {
        this.flowerList = flowerList;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Booket{" +

                ", flowerList=" + flowerList +
                ", price=" + price +
                '}';
    }
}

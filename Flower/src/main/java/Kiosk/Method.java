package Kiosk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Леся on 27.10.2016.
 */
public class Method {
    private List<Flower> flowerList = new ArrayList<>();
    private List<Booket> booketList = new ArrayList<>();


    public void newFlower() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("введіть кількість квітів: ");
        String s = reader.readLine();
        int number = Integer.parseInt(s);
        String names[] = {"Gladiolus", "Rose", "Romaska", "Tulip", "Phialka"};
        String color[] = {"white", "red"};
        double lenght[] = {40, 20, 30, 15};
        Date date = Calendar.getInstance().getTime();
        double price[] = {100, 40, 50, 70, 23};
        Random random = new Random();
        for (int i = 1; i <= number; i++) {
            flowerList.add(new Flower(names[random.nextInt(names.length)], color[random.nextInt(color.length)], lenght[random.nextInt(lenght.length)]
                    , date, price[random.nextInt(price.length)]));
        }

    }

    public void allFlowers() {
        booketList.forEach(System.out::println);
    }

    public void booketPrice(){
        double p=0;
        for (Flower flower : flowerList){
            p+=flower.getPrice();
        }
        booketList.add(new Booket(flowerList,p));

    }
    public void allBooket() {
        booketList.forEach(System.out::println);
    }
    public  void longest(){
        for (Flower flower:flowerList){
            if (flower.getName().equals("Romaska")&&flower.getLenght()==40){
                System.out.println(flower);
            }
        }
    }



   // public void allColor() {
   //     booketList.forEach(System.out::println);
   // }
   // public  void color(){
   //     for (Flower flower:flowerList){
   //         if (flower.getColor().equals("white")){
    //            System.out.println(flower);
    //        }
    //    }
   // }
}

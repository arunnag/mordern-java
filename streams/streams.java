/* Online Java Compiler and Editor */
import java.util.*;
import java.util.stream.Collectors;

class Apple {
    String color;
    int weight;

    Apple(String c, int w) {
        this.color = c;
        this.weight = w;
    }

    public String getColor() {
        return this.color;
    }

    public int getWeight() {
        return this.weight;
    }
    //@Override
    public String toString() {
        return this.color + " Apple, weight = " + Integer.toString(this.weight);
    }
}

public class HelloWorld{

     public static void main(String []args){

         List<Apple> allApples = new ArrayList<Apple>();

         allApples.add(new Apple("Green", 100));
         allApples.add(new Apple("Green", 120));
         allApples.add(new Apple("Green", 140));
         allApples.add(new Apple("Green", 160));

         allApples.add(new Apple("Red", 110));
         allApples.add(new Apple("Red", 130));
         allApples.add(new Apple("Red", 150));
         allApples.add(new Apple("Red", 170));

         //List<Apple> redApples = allApples.stream().filter((Apple a) -> a.getColor().equals("Red")).collect(Collectors.toList());

         List<Apple> redApples = allApples.parallelStream().filter((Apple a) -> a.getColor().equals("Red")).collect(Collectors.toList());

         for (Apple a : redApples) {
             System.out.println(a);
         }
     }
}

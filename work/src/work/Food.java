//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package work;

import java.util.Objects;

public class Food {
    private String name;
    private double price;
    private int count;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Food(String name, double price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
        System.out.println("有参被执行。。。");
    }

    public Food() {
        System.out.println("无参被执行。。。");
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Food food = (Food)o;
            return Double.compare(food.price, this.price) == 0 && this.count == food.count && this.name.equals(food.name);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.name, this.price, this.count});
    }
}

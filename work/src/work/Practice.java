//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package work;

public class Practice {
    public Practice() {
    }

    public static void main(String[] args) {
        Class<Food> foodClass = Food.class;
        Class<? extends Class> classes = foodClass.getClass();
        Food food = new Food();
        Class<? extends Food> foodclass1 = food.getClass();
        Class var5 = null;

        try {
            var5 = Class.forName("work.Food");
        } catch (Exception var7) {
            var7.printStackTrace();
        }

        System.out.println();
    }
}

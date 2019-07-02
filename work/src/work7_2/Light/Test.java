package work7_2.Light;

public class Test {
    public static void main(String[] args) {
        Light light = new Light();
         new Thread(new Red(light)).start();
         new Thread(new yellow(light)).start();
         new Thread(new green(light)).start();
    }
}

package work7_2.Light;

public class green implements Runnable {
    private final Light light;

    public green(Light light) {
        this.light = light;
    }

    @Override
    public void run() {
        while (true) {
            light.green();
        }
    }
}

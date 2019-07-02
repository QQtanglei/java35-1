package work7_2.Light;

public class yellow implements Runnable {
    private final Light light;

    public yellow(Light light) {
        this.light = light;
    }

    @Override
    public void run() {
        while(true){
            light.yellow();
            light.yellow2();
        }
    }
}

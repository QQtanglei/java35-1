package work7_2.Light;

public class Red implements Runnable{
    private final Light light;

    public Red(Light light) {
        this.light = light;
    }
    @Override
    public void run() {
        while(true){
            light.red();
        }
    }
}

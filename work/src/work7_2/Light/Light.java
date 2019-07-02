package work7_2.Light;

public class Light {
    private int stack=1;//1：红灯；2：黄灯；3：绿灯 4：黄灯


    public synchronized void red(){
        while(stack!=1){
            waiter();
        }
        for (int i = 10; i >0 ; i--) {
            System.out.println("红灯:"+i);
            sleeper();
        }
        stack=2;
        notifyAll();
    }

    public synchronized void yellow(){
        while(stack!=2){
            waiter();
        }
        yellowLight(3, "黄灯:");
        stack=3;
        notifyAll();
    }

    public synchronized void green(){
        while(stack!=3){
            waiter();
        }
        for (int i = 10; i >0 ; i--) {
            System.out.println("绿灯:"+i);
            sleeper();
        }
        stack=4;
        notifyAll();
    }

    public synchronized void yellow2(){
        while(stack!=4){
            waiter();
        }
        yellowLight(3, "黄灯:");
        stack=1;
        notifyAll();
    }

    private void waiter() {
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void sleeper() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void yellowLight(int inter, String s) {
        for (int i = inter; i > 0; i--) {
            System.out.println(s + i);
            sleeper();
        }
    }
}

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package Work7_1;

public class TestRunnable implements Runnable {
    public TestRunnable() {
    }

    public void run() {
        Thread t = Thread.currentThread();
        String name = t.getName();
        int priority = t.getPriority();

        try {
            Thread.sleep(2000L);
            System.out.println("执行。。。");
        } catch (InterruptedException var5) {
            var5.printStackTrace();
        }

        for(int i = 0; i < 6; ++i) {
            System.out.println(name + ":Priority=" + priority + ",i=" + i);
        }

    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new TestRunnable(), "一");
        Thread t2 = new Thread(new TestRunnable(), "二");
        t1.start();
        t2.start();
    }
}

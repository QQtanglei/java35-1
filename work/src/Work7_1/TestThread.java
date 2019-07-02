//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package Work7_1;

public class TestThread extends Thread {
    public TestThread() {
    }

    public void run() {
        Thread t = new TestThread();
        Thread thread = Thread.currentThread();
        String name = thread.getName();
        int priority = thread.getPriority();

        for(int i = 0; i < 5; ++i) {
            if (Thread.currentThread().getName().equals("二")) {
                try {
                    sleep(2000L);
                } catch (InterruptedException var7) {
                    var7.printStackTrace();
                }
            }

            System.out.println(name + ":" + i + "," + priority);
        }

    }

    public static void main(String[] args) {
        TestThread t1 = new TestThread();
        TestThread t2 = new TestThread();
        TestThread t3 = new TestThread();
        TestThread t4 = new TestThread();
        t1.setName("一");
        t2.setName("二");
        t3.setName("三");
        t4.setName("四");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

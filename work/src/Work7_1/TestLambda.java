//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package Work7_1;

public class TestLambda {
    public TestLambda() {
    }

    public static void main(String[] args) {
        Test1();
        Test2();
    }

    private static void Test2() {
        Thread t1 = new Thread(() -> {
            Thread t2 = Thread.currentThread();
            String name = t2.getName();

            for(int i = 0; i < 6; ++i) {
                System.out.println(name + ":" + i);
            }

        });
        t1.setName("一");
        t1.start();
    }

    private static void Test1() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                Thread t1 = Thread.currentThread();
                String name = t1.getName();

                for(int i = 0; i < 6; ++i) {
                    System.out.println(name + ":" + i);
                }

            }
        });
        t.setName("二");
        t.start();
    }
}

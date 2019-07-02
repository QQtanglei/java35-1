package work7_2.duoxiancheng;

public class Shared  {
    //共享资源
    private static Shared shared;
    private  static final int MAX=10;

    public Shared(Shared shared) {
        Shared.shared = shared;
    }
}

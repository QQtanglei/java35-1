//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package zuoye;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class work2 {
    private static final File file = new File("D:\\Student.dat");

    public work2() {
    }

    public static void main(String[] args) {
        writer();
        reader();
    }

    private static void writer() {
        List<Object> list = new ArrayList();
        list.add(new Student("张三", 18, '男'));
        list.add(new Student("李四", 19, '男'));
        list.add(new Student("王五", 22, '男'));
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException var5) {
                var5.printStackTrace();
            }
        }

        try {
            OutputStream o = new FileOutputStream(file);
            ObjectOutputStream out = new ObjectOutputStream(o);
            out.writeObject(list);
        } catch (FileNotFoundException var3) {
            var3.printStackTrace();
        } catch (IOException var4) {
            var4.printStackTrace();
        }

    }

    private static void reader() {
        try {
            InputStream in = new FileInputStream(file);
            ObjectInputStream inter = new ObjectInputStream(in);
            Object obj = inter.readObject();
            List<Student> list = (List)obj;
            Stream var10000 = list.stream();
            PrintStream var10001 = System.out;
            var10000.forEach(var10001::println);
        } catch (FileNotFoundException var4) {
            var4.printStackTrace();
        } catch (IOException var5) {
            var5.printStackTrace();
        } catch (ClassNotFoundException var6) {
            var6.printStackTrace();
        }

    }
}

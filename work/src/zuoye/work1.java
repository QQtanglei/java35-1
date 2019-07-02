//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package zuoye;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class work1 {
    private static final File file = new File("D:\\log.date");
    private static BufferedWriter bufferedWriter = null;
    private static BufferedReader bufferedReader = null;

    public work1() {
    }

    private static void writer(String log) {
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException var13) {
                var13.printStackTrace();
            }
        }

        try {
            Writer writer = new FileWriter(file);
            bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(log);
            bufferedWriter.newLine();
        } catch (Exception var11) {
            var11.printStackTrace();
        } finally {
            try {
                bufferedWriter.flush();
                bufferedWriter.close();
            } catch (IOException var10) {
                var10.printStackTrace();
            }

        }

    }

    private static void log(String name, long runTime, long conut) {
        List list = new ArrayList();
        Method method = new Method(name, runTime, conut);
        list.add(method);
    }
}

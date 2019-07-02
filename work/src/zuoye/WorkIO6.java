//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package zuoye;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class WorkIO6 {
    private static final File file = new File("D:\\log.txt");

    public WorkIO6() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BufferedWriter buffer = null;
        System.out.println("请开始输入...");

        while(true) {
            String writ = input.next();
            if (writ.equals("exit")) {
                return;
            }

            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException var14) {
                    var14.printStackTrace();
                }
            }

            try {
                Writer writer = new FileWriter(file, true);
                buffer = new BufferedWriter(writer);
                buffer.write(writ);
                buffer.newLine();
            } catch (IOException var15) {
                var15.printStackTrace();
            } finally {
                try {
                    buffer.flush();
                    buffer.close();
                } catch (IOException var13) {
                    var13.printStackTrace();
                }

            }
        }
    }
}

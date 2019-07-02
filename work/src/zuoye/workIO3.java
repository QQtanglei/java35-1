//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package zuoye;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class workIO3 {
    public workIO3() {
    }

    public static void main(String[] args) {
        copy("E:\\test.txt", "E:\\test1.txt");
    }

    private static void copy(String origin, String dest) {
        File file = new File(origin);
        File file1 = new File(dest);
        BufferedReader buffer = null;
        BufferedWriter buffer1 = null;
        if (file.exists()) {
            if (file.isFile()) {
                if (!file1.exists()) {
                    try {
                        file1.createNewFile();
                    } catch (IOException var22) {
                        var22.printStackTrace();
                    }
                }

                try {
                    Writer writer = new FileWriter(dest);
                    buffer1 = new BufferedWriter(writer);
                    Reader reader = new FileReader(origin);
                    buffer = new BufferedReader(reader);
                    String line = null;

                    while((line = buffer.readLine()) != null) {
                        buffer1.write(line);
                        buffer1.newLine();
                    }
                } catch (FileNotFoundException var23) {
                    var23.printStackTrace();
                } catch (IOException var24) {
                    var24.printStackTrace();
                } catch (Exception var25) {
                    var25.printStackTrace();
                } finally {
                    try {
                        buffer.close();
                        buffer1.flush();
                        buffer1.close();
                    } catch (IOException var21) {
                        var21.printStackTrace();
                    }

                }
            }

        }
    }
}

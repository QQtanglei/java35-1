//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package zuoye;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class workIO2 {
    public workIO2() {
    }

    public static void main(String[] args) {
        reader();
    }

    private static void reader() {
        File file = new File("E:\\test.txt");
        if (file.exists()) {
            if (file.isFile()) {
                BufferedReader buffer = null;

                try {
                    Reader reader = new FileReader(file);
                    buffer = new BufferedReader(reader);
                    String line = null;

                    while((line = buffer.readLine()) != null) {
                        System.out.println(line);
                    }
                } catch (FileNotFoundException var14) {
                    var14.printStackTrace();
                } catch (Exception var15) {
                    var15.printStackTrace();
                } finally {
                    try {
                        buffer.close();
                    } catch (IOException var13) {
                        var13.printStackTrace();
                    }

                }
            }

        }
    }
}

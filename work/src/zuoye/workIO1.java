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

public class workIO1 {
    public workIO1() {
    }

    public static void main(String[] args) {
        writer();
    }

    private static void writer() {
        File file = new File("E:\\test.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException var14) {
                var14.printStackTrace();
            }
        }

        BufferedWriter buffer = null;

        try {
            Writer writer = new FileWriter(file);
            buffer = new BufferedWriter(writer);
            buffer.write("\"Java是一种可以撰写跨平台应用软件的面向对象的程序设计语言，是由Sun Microsystems公司于");
            buffer.newLine();
            buffer.write("1995年5月推出的Java程序设计语言和Java平台（即JavaSE, JavaEE, JavaME）的总称。Java 技术具有");
            buffer.newLine();
            buffer.write("卓越的通用性、高效性、平台移植性和安全性，广泛应用于个人PC、数据中心、游戏控制台、科学超级");
            buffer.newLine();
            buffer.write("计算机、移动电话和互联网，同时拥有全球最大的开发者专业社群。在全球云计算和移动互联网的产业");
            buffer.newLine();
            buffer.write("环境下，Java更具备了显著优势和广阔前景。\"");
        } catch (IOException var12) {
            var12.printStackTrace();
        } finally {
            try {
                buffer.flush();
                buffer.close();
            } catch (IOException var11) {
                var11.printStackTrace();
            }

        }

    }
}

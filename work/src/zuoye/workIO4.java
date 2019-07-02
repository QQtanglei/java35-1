//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package zuoye;

import java.io.File;
import java.util.Scanner;

public class workIO4 {
    public workIO4() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个路径");
        String path = input.next();
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("不存在该路径!");
        } else {
            out(file);
        }
    }

    private static void out(File file) {
        if (file.isDirectory()) {
            File[] f = file.listFiles();
            File[] var2 = f;
            int var3 = f.length;

            for(int var4 = 0; var4 < var3; ++var4) {
                File m = var2[var4];
                out(m);
            }
        }

        listFile(file);
    }

    private static void listFile(File file) {
        StringBuilder builder = new StringBuilder();
        builder.append(file.isDirectory() ? file.getName() + "<DIR>" : file.getName());
        System.out.println(builder.toString());
    }
}

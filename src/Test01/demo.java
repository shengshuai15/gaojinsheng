package Test01;

import java.io.File;

public class demo {
    public static void main(String[] args) {
        String dir = "C:\\Users\\gjins\\Desktop\\";
        String b = "文本文档.txt";
        File a = new File(dir,b);
        System.out.println(a.getPath());
    }
}

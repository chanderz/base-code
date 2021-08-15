package day15.File;

import java.io.File;
import java.io.IOException;

/**
 * *
 * * @Description：文件的创建与删除功能
 * - `public boolean createNewFile()` ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
 * - `public boolean delete()` ：删除由此File表示的文件或目录。
 * - `public boolean mkdir()` ：创建由此File表示的目录。
 * - `public boolean mkdirs()` ：创建由此File表示的目录，包括任何必需但不存在的父目录。
 * *
 * * @Author：Zhaozheng
 * *
 * * @CreateTime：2021年08月15日 14:01
 * *
 */
public class Demo02FileCreateAndDelete {
    public static void main(String[] args) throws IOException {
        File f1 = new File("test.txt");
        File f = new File(".");
        File f4 = new File("..");
        File f2 = new File("C:\\Users\\86159\\IdeaProjects\\base-code\\Month05-code\\src\\day15\\File\\test1.txt");
        File f3 = new File(".\\IdeaProjects\\base-code\\Month05-code\\src\\day15\\File\\test2.txt");
        System.out.println(f.getAbsoluteFile());
        System.out.println(f4.getAbsoluteFile());
        /*System.out.println("f1文件是否存在:"+f1.exists());
        System.out.println("f2文件是否存在:"+f2.exists());
        System.out.printf("创建新文件：", f1.createNewFile());
        System.out.printf("创建新文件：", f2.createNewFile());
        System.out.printf("创建新文件：", f3.createNewFile());*/

    }
}

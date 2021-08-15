package day15.File;

import java.io.File;

/**
 * *
 * * @Description：java.io.File 类是文件和目录路径名的抽象表示，主要用于文件和目录的创建、查找和删除等操作
 * * 构造方法：
 * * public File(String pathname)  ：通过将给定的**路径名字符串**转换为抽象路径名来创建新的 File实例
 * * public File(String parent, String child)  ：从**父路径名字符串和子路径名字符串**创建新的 File实例
 * * public File(File parent, String child) ：从**父抽象路径名和子路径名字符串**创建新的 File实例
 *
 * * 常用方法（获取功能）：
 * * public String getAbsolutePath()  ：返回此File的绝对路径名字符串。
 * * public String getPath()  ：将此File转换为路径名字符串。
 * * public String getName()  ：返回由此File表示的文件或目录的名称。
 * * public long length()  ：返回由此File表示的文件的长度。
 * *
 * * 绝对路径**：从盘符开始的路径，这是一个完整的路径。
 * * 相对路径**：相对于项目目录的路径，这是一个便捷的路径，开发中经常使用。
 *
 * * 判断功能：
 * - `public boolean exists()` ：此File表示的文件或目录是否实际存在。
 * - `public boolean isDirectory()` ：此File表示的是否为目录。
 * - `public boolean isFile()` ：此File表示的是否为文件。
 *
 * * 创建删除功能：
 * - `public boolean createNewFile()` ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
 * - `public boolean delete()` ：删除由此File表示的文件或目录。
 * - `public boolean mkdir()` ：创建由此File表示的目录。
 * - `public boolean mkdirs()` ：创建由此File表示的目录，包括任何必需但不存在的父目录。
 *
 * * @Author：Zhaozheng
 * *
 * * @CreateTime：2021年08月15日 11:01
 * *
 */
public class Demo01FileStudy {
    public static void main(String[] args) {
        String pathname = "C:\\Users\\86159\\IdeaProjects\\base-code\\Month05-code\\src\\day15\\File\\Demo01FileStudy.java";
        File f = new File(pathname);
        File f1 = new File("Demo01FileStudy.java");
        System.out.println("绝对路径是"+f.getAbsolutePath());
        System.out.println("路径是"+f1.getAbsolutePath());
        System.out.println("路径名字符串"+f.getPath());
        System.out.println("文件或目录名是"+f.getName());
        System.out.println("文件长度"+f.length());

        System.out.println("-------------------------------");
        System.out.println("文件是否存在："+f.exists());
        File f3 = new File("D:\\hahah.txt");
        File f4 = new File("C:");
        System.out.println("文件是否存在："+f3.exists());
        System.out.println("f3是否为目录："+f3.isDirectory());
        System.out.println("f1是否为目录："+f1.isDirectory());
        System.out.println("f4是否为目录："+f4.isDirectory());
        System.out.println("f是否为文件："+f.isFile());
        System.out.println("f4是否为文件："+f4.isFile());
    }
}

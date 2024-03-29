package cn.itcast.day08.demo01;

import java.io.File;

/*
    java.io.File类
    文件和目录路径名的抽象表现形式。
    Java把电脑中的文件和文件夹（目录）封装为了一个File，我们可以使用File类对文件和文件夹进行操作
    我们可以使用File类的方法
        创建一个文件/文件夹
        删除文件/文件夹
        获取文件/文件夹
        判断文件/文件夹
        对文件进行遍历
        获取文件的大小
    File类是一个与系统无关的类，任何的操作系统都可以使用这个类中的方法

    重点：记住这三个单词
        file： 文件
        directory：文件夹/目录
        path：路径

    有关的静态方法：
            static String	pathSeparator：与系统有关的路径分隔符，为了方便，它被表示为一个字符串。
            static char	pathSeparatorChar：与系统有关的路径分隔符。

            static String	separator：与系统有关的默认名称分隔符，为了方便，它被表示为一个字符串。
            static char	separatorChar：与系统有关的默认名称分隔符。

            注意：
                操作路径不能写死了
                C:\develop\a\a.txt windows
                C:/develop/a/a.txt linux
                可以这么写：
                    "C:" + File.separator + "develop" + File.separator + "a" + File.separator + "a.txt"
*/
public class Demo01File {

    public static void main(String[] args) {
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator); // :  路径分隔符 windows: ;（分号） linux: :（冒号）
        System.out.println(File.separator); // /

    }

}

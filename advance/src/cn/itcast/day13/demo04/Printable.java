package cn.itcast.day13.demo04;

/*
     定义一个打印的函数式接口
*/
@FunctionalInterface
public interface Printable {

    // 定义字符串的抽象方法
    public abstract void print(String s);

}

package cn.itcast.day10.demo01;

public class Demo04Interface {
    public static void main(String[] args) {
        MyInterfacePrivateB.methodStatic1();
        MyInterfacePrivateB.methodStatic2();
//        MyInterfacePrivateB.methodStaticCommon(); // 错误写法！不能外部调用接口私有方法
    }
}

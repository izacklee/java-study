package cn.itcast.day12.demo01;

/*
    函数式接口：有且只有一个抽象方法的接口，称之为函数式接口
    当然接口中可以包含其他方法（默认方法，静态方法，私有方法）

    @FunctionalInterface：检测是否为函数式接口的注释
        是：编译成功
        否：编译失败（接口中没有抽象方法，或抽象方法超过1个）
*/
@FunctionalInterface
public interface MyFunctionalInterface {

    // 定义一个抽象方法
    public abstract void method();

//    void method2();
}

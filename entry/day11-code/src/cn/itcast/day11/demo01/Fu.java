package cn.itcast.day11.demo01;

/*
当final关键字用来修饰一个方法的时候，这个方法就是最终的方法，不能被覆盖重写。
格式：
修饰符 final 返回值类型 方法名称(参数列表) {
    // 方法体
}

注意事项：
对于类、方法来说，abstract和final关键字不能同时用，因为矛盾。
*/
public abstract class Fu {

    public final void method() {
        System.out.println("父类方法执行了");
    }

    public abstract /*final*/ void methodAbs();
}

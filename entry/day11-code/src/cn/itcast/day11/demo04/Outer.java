package cn.itcast.day11.demo04;

/*
如果一个类是定义在方法的内部的，那么这就是一个局部内部类。
“局部”：只有当前所属方法才能用它，出了这个方法外面就不能用了。

定义格式：
修饰符 class 外部类名称 {
    修饰符 返回值类型 方法名称(参数列表) {
        class 局部内部类名称 {
            // ...
        }
    }
}

小结一下类的权限修饰符：
public > protected > (default) > private
定义一个类的时候，权限修饰符规则：
外部类：public / (default)
成员内部类：public / protected / (default) / private
局部内部类：什么都不能写
*/
public class Outer { // 外部类

    public void methodOuter() {
        class Inner {  // 局部内部类
            int num = 10;
            public void methodInner() {
                System.out.println(num); // 10
            }
        }
        Inner inner = new Inner();
        inner.methodInner();
    }
}

package Myreflection4;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class reflection {
    /**
     * get表示获取
     *  Declared表示私有
     *  最后的s表示所有，复数形式
     *  如果当前获取到的是私有的，必须要临时修改访问权限，否则无法使用
     */
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        //获取对象的第一种方式
        Class Class1 = Class.forName("Myreflection4.Student");
        System.out.println(Class1);

        //获取所有公有方法
        //Method[] methods = Class1.getMethods();
        //for (Method method : methods) {
        //    System.out.println(method);
        //}
        //获取所有的成员方法
        //Method[] declaredMethods = Class1.getDeclaredMethods();
        //for (Method declaredField : declaredMethods) {
        //    System.out.println(declaredField);
        //}

        //获取指定的成员方法（公有）
        Method student = Class1.getMethod("getName");
        System.out.println(student);


        //获取指定的成员方法（所有）
        Method student1 = Class1.getDeclaredMethod("getName");
        System.out.println(student1);

    }
}

package Myreflection4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class reflection2 {
    /**
     * Object invoke(Object obj, Object... args) ：运行方法
     * 参数一：用obj对象调用该方法
     * 参数二：调用方法的传递的参数（如果没有就不写）
     * 返回值：方法的返回值（如果没有就不写）
     */
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //获取对象的第一种方式
        Class Class1 = Class.forName("Myreflection4.Student");
        //System.out.println(Class1);

        Student s = new Student();


        Method setAge = Class1.getDeclaredMethod("setAge", Integer.class);
        Student invoke = (Student)setAge.invoke(s, 18);
        System.out.println(s);
    }
}

package MyReflection3;

import java.lang.reflect.Field;

public class reflection2 {
    /**
     * get表示获取
     *  Declared表示私有
     *  最后的s表示所有，复数形式
     *  如果当前获取到的是私有的，必须要临时修改访问权限，否则无法使用
     * @param args
     */
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException {
        //获取对象的第一种方式
        Class Class1 = Class.forName("MyReflection3.Student");

        //用变量名获取变量（所有的修饰符）
        Field field = Class1.getDeclaredField("name");
        field.setAccessible(true);
        Student s = (Student)Class1.newInstance();
        field.set(s,"李四");
        //表示我要获取这个对象的name的值
        String result = (String)field.get(s);

        //4.打印结果
        System.out.println(result);

    }
}

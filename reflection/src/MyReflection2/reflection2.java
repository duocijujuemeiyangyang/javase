package MyReflection2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class reflection2 {
    /**
     * get表示获取构造方法并创建变量
     *
     * @param args
     */
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取对象的第一种方式
        Class Class1 = Class.forName("MyReflection2.Student");
        //System.out.println(Class1);

        //获取空参构造方法并创建对象
        Constructor declaredConstructor = Class1.getDeclaredConstructor();
        Student student = (Student) declaredConstructor.newInstance();
        System.out.println(student);

        //需求2：
        //获取带参构造，并创建对象
        //2.获取有参构造方法
        Constructor con = Class1.getDeclaredConstructor(String.class, Integer.class);
        //3.临时修改构造方法的访问权限（暴力反射）
        con.setAccessible(true);

        Student 张三 = (Student)con.newInstance("张三", 12);
        System.out.println(张三);


    }
}

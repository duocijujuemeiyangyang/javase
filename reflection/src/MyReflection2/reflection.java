package MyReflection2;

import MyReflection.Student;

import java.lang.reflect.Constructor;

public class reflection {
    /**
     *  get表示获取
     *  Declared表示私有
     *  最后的s表示所有，复数形式
     *  如果当前获取到的是私有的，必须要临时修改访问权限，否则无法使用
     * @param args
     */
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        //获取对象的第一种方式
        Class Class1 = Class.forName("MyReflection2.Student");
        //System.out.println(Class1);

        //获取所有构造方法(包括private)
        //Constructor[] declaredConstructors = Class1.getDeclaredConstructors();
        //for (Constructor declaredConstructor : declaredConstructors) {
        //    System.out.println(declaredConstructor);
        //}

        //获取指定public修饰的构造方法
        //Constructor[] constructors = Class1.getConstructors();
        //for (Constructor constructor : constructors) {
        //    System.out.println(constructor);
        //}

        //获取指定的构造方法，需要在参数里面指定构造方法参数的类型（只限公有）
        //Constructor constructor = Class1.getConstructor();
        //System.out.println(constructor);
        //获取所有构造方法
        Constructor declaredConstructor = Class1.getDeclaredConstructor(String.class, int.class);
        System.out.println(declaredConstructor);

    }
}

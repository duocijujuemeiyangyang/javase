package MyReflection3;

import java.lang.reflect.Field;
import java.util.zip.CheckedOutputStream;

public class reflection {
    /**
     * get表示获取
     *  Declared表示私有
     *  最后的s表示所有，复数形式
     *  如果当前获取到的是私有的，必须要临时修改访问权限，否则无法使用
     * @param args
     */
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        //获取对象的第一种方式
        Class Class1 = Class.forName("MyReflection3.Student");

        //获取public修饰的成员变量
        Field[] fields = Class1.getFields();

        for (Field field : fields) {
            System.out.println(field);
        }

        //获取所有的成员变量
        //Field[] fields1 = Class1.getDeclaredFields();
        //for (Field field : fields1) {
        //    System.out.println(field);
        //}


        //用变量名获取变量（public修饰的）
        //Field field = Class1.getField("name");
        //System.out.println(field);


        //用变量名获取变量（所有的修饰符）
        Field name = Class1.getDeclaredField("name");
        System.out.println(name);

    }
}

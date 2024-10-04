package MyReflection;

public class reflection {
    /**
     * 获取字节码对象的三种方式
     * Class这个类里面的静态方法forName（“全类名”）（最常用）
     * 通过class属性获取
     * 通过对象获取字节码文件对象
     * @param args
     */
    public static void main(String[] args) throws ClassNotFoundException {
        //获取对象的第一种方式
        Class Class1 = Class.forName("MyReflection.Student");
        System.out.println(Class1);

        //获取对象的第二种方式
        Class class2 = Student.class;
        System.out.println(class2);

        //获取对象的第三种方式
        Student student = new Student();
        Class class3 = student.getClass();
        System.out.println(class3);
    }
}

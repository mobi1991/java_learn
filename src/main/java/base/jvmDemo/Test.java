package base.jvmDemo;

import base.domain.Student;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args) {
      /*  Student st = new Student();
        Class sc = st.getClass();
        System.out.println(sc.getName());
        Method m[] = sc.getDeclaredMethods();
        for(Method method:m){
            System.out.println(method.getName());
        }
        Field f[] = sc.getDeclaredFields();
        for(Field field:f){
            System.out.println(field.getName());
        }*/
        System.out.println(String.class.getClassLoader());
        System.out.println(Test.class.getClassLoader());
    }
}

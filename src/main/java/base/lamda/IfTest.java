package base.lamda;

import base.domain.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Future;


public class IfTest {
    public static void main(String[] args) {

    }

    public static void testFilter(){
        List<Student> studentList = new ArrayList<>();
        Student sA = new Student();
        sA.setName("张三");
        sA.setRoll_no("12");
        Student sB = new Student();
        sB.setName("lily");
        sB.setRoll_no("10");
        studentList.add(sA);
        studentList.add(sB);

    }

}


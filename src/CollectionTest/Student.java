package CollectionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Student {
    private int age;
    //private String sex;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        Student s = new Student(12, "fefe");
        Student s2 = new Student(122, "lulu");
        al.add(s);
        al.add(new Student(21, "fang"));
        al.add(new Student(21, "fang2"));
        al.add(s2);

        //for(int i = 0; i<al.size(); i++){

        //}
        Iterator it = al.iterator();
        while(it.hasNext()){
            Student o = (Student)(it.next());
            //System.out.println(o.getName()+o.getAge());
            System.out.println(((Student)(it.next())).getName()+"====="+((Student)(it.next())).getAge());
        }
    }
}

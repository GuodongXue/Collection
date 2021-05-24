package CollectionTest;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {
    public static void main(String[] args) {
        //arraylist底层是一个object的数组
        //Object[] elementData;
        ArrayList al = new ArrayList();
        al.add("abc");
        al.add("ggg");
        //调用空构造器和第一次add做了什么
        //
        al.remove("abc");
    }
}

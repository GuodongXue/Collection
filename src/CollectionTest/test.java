package CollectionTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class test {
    public static void main(String[] args) {
        //Collection
        Collection col = new ArrayList();
        /*
        常用的方法
        增加 add addAll
        删除 clear remove
        查看 iterator size
        修改
        判断 contains equals isEmpty
         */
        col.add(11);
        col.add(22); //实际自动装箱， 放入的是integer
        //Integer i =12; col.add(i);
        col.add(33);
        System.out.println(col.toString());
        System.out.println(col.size());
        Collection col2 = new ArrayList();
        col2.add(11);
        col2.add(22);
        col2.add(33);
        //col.addAll(col2);
        System.out.println(col);
        System.out.println(col.size());

        //col.clear();
        //System.out.println(col);
        //System.out.println(col.size());
        //System.out.println(col.isEmpty());
        col.remove("Abc");
        System.out.println(col);
        System.out.println(col.size());
        System.out.println(col.contains("Abc"));
        System.out.println(col.equals(col2));

        //iterator
        System.out.println("集合的遍历");
         /*
         for(int i = 0; i < col.size(); i++){

             System.out.println(col[i]);
         }
         //不行， 没有提供更具索引提供元素的方法
          */
        //增强for循环
        for (Object i :col) {
            System.out.println(i+"\t");
        }
        Iterator it = col.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}

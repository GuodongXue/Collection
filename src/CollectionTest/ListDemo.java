package CollectionTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        /*
        常用的方法
        增加 add add(int index, E element)
        删除 remove(int index)
        查看 get(int index)
        修改 set(int index)
        判断
         */
        list.add(12);
        list.add(82);
        list.add(20);
        list.add(1);
        list.add(38);
        System.out.println(list);
        System.out.println(list.size());
        list.add(1, 666);
        System.out.println(list);
        System.out.println(list.size());
        list.remove(1);
        list.remove(1);
        list.set(2, 999);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(3));

        //对list的遍历
        //for循环
        System.out.print("[");
        for(int i = 0; i< list.size(); i++){
            if(i!=list.size()-1){
                System.out.print(list.get(i)+",");
            }else{
                System.out.print(list.get(i)+"]");
            }
        }
        //增强for循环
        for (Object o : list){
            System.out.println(o);
        }
        //迭代器
        Iterator i = list.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}

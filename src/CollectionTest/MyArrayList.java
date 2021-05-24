package CollectionTest;

import java.util.Arrays;

public class MyArrayList {
    Object[] elementData;
    //数组中被使用的数量；
    int count;

    public MyArrayList(){
        //elementData = new Object[10];
        this(10);
    }
    public MyArrayList(int length){
        elementData = new Object[length];
    }
    public void add(Object obj){
        elementData[count++] = obj;
        //count++;
        //如果数组长度不够， 进行扩容

        if( count >= elementData.length){
            //方式1
            //Object[] newObj  = Arrays.copyOf(elementData, 20);
            //elementData = newObj;
            //方式2
            Object[] newObj = new Object[elementData.length * 2 +1];
            for(int i = 0; i<elementData.length; i++)
                newObj[i] = elementData[i];

            elementData = newObj;
        }
    }
    public boolean isEmpty(){
        return count==0;
    }

    public void remove(int index){
        if(elementData[index] != null){
            for(int i = index + 1; i< elementData.length; i++){
                if(i < elementData.length-1){
                    elementData[i-1] = elementData[i];
                }else{
                    elementData[i] =null;
                }
            }
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i<count; i++){
            sb.append(elementData[i]+",");
        }
        sb.setCharAt(sb.length()-1, ']');
        return sb.toString();
    }
    public int length(){
        return count;
    }

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add("abc");
        list.add("abc");
        list.add("abc");
        list.add("aax");
        list.add("abc");
        list.add("abc");
        list.add("abc");
        list.add("abc");
        list.add("abc");
        list.add("abc");
        list.add("abc");
        System.out.println(list.toString());
        System.out.println(list.length());
        System.out.println(list.isEmpty());
        list.remove(3);
        list.remove(4);
        System.out.println(list);
    }
}

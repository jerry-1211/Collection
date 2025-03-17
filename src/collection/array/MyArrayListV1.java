package collection.array;

import java.util.Arrays;

public class MyArrayListV1 {
    private static final int DEFAULT_CAPACIRY = 5;

    private Object[] elementData;
    private int size = 0 ;

    public MyArrayListV1(){
        elementData = new Object[DEFAULT_CAPACIRY];
    }

    public MyArrayListV1(int initialCapacity){
        elementData = new Object[initialCapacity];
    }

    public int size(){
        return size;
    }

    public void add(Object e){
        elementData[size] = e;
        size++ ;
    }

    public Object get(int index){
        return elementData[index];
    }

    // 인덱스에 있는 항목 변경
    public Object set(int index, Object element){
        Object oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    public int indexOf(Object o){
        for(int i = 0; i<size; i++){
            if(o.equals(elementData[i])){
                return i;
            }
        }
        return -1;
    }

    public String toString(){
        return Arrays.toString(Arrays.copyOf(elementData,size)) +
                " size= " + size + ", capacity = " + elementData.length ;
    }
}

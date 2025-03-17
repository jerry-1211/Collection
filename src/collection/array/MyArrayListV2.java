package collection.array;

import javax.swing.*;
import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class MyArrayListV2 {
    private static final int DEFAULT_CAPACIRY = 5;

    private Object[] elementData;
    private int size = 0 ;

    public MyArrayListV2(){
        elementData = new Object[DEFAULT_CAPACIRY];
    }

    public MyArrayListV2(int initialCapacity){
        elementData = new Object[initialCapacity];
    }

    public int size(){
        return size;
    }

    public void add(Object e){
        if(size == elementData.length){
            grow();
        }
        elementData[size] = e;
        size++ ;
    }

    private void grow(){
        int oldCapacity = elementData.length;
        int newCapaciry = oldCapacity * 2;

        // 방법 1
        // Object[] newArr = new Object[newCapaciry];
        // for (int i = 0; i < elementData.length; i++) {
        //    newArr[i] = elementData[i];
        // }

        // 방법 2
        // 배열의 확장성 문제를 해결
        elementData = Arrays.copyOf(elementData, newCapaciry);
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

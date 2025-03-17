
package collection.list;

import java.util.Arrays;

public class MyArrayList<E> implements MyList<E> {
    private static final int DEFAULT_CAPACIRY = 5;

    private Object[] elementData;
    private int size = 0 ;


    // 제네릭은 new(생성자)에 사용 수 없음
    public MyArrayList(){
        elementData = new Object[DEFAULT_CAPACIRY];
    }

    public MyArrayList(int initialCapacity){
        elementData = new Object[initialCapacity];
    }

    @Override
    public int size(){
        return size;
    }

    @Override
    public void add(E e){
        if(size == elementData.length){
            grow();
        }
        elementData[size] = e;
        size++ ;
    }

    @Override
    public void add(int index, E e){
        if(size == elementData.length){
            grow();
        }
        shiftRightFrom(index);
        elementData[index] = e;
        size++;
    }

    public void shiftRightFrom(int index){
        for (int i = size; i > index; i--){
             elementData[i] = elementData[i-1] ;
        }
    }

    private void grow(){
        int oldCapacity = elementData.length;
        int newCapaciry = oldCapacity * 2;
        elementData = Arrays.copyOf(elementData, newCapaciry);
    }

    @Override
    public E get(int index){
        return (E)elementData[index];
    }

    @Override
    public E set(int index, E element){
        E oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    @Override
    public E remove(int index){
        E oldValue = get(index);
        shiftLeftFrom(index);

        size --;
        elementData[size] = null;
        return oldValue;
    }

    // 코드 추가, 요소의 index부터 마지막까지 왼쪽으로 밀기
    public void shiftLeftFrom(int index){
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i+1];
        }
    }

    @Override
    public int indexOf(E o){
        for(int i = 0; i<size; i++){
            if(o.equals(elementData[i])){
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString(){
        return Arrays.toString(Arrays.copyOf(elementData,size)) +
                " size= " + size + ", capacity = " + elementData.length ;
    }
}

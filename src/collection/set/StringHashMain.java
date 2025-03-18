package collection.set;

public class StringHashMain {
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        char charA = 'A';
        System.out.println((int)charA);

        System.out.println("hashCode ('ABC') = " + hashCode("AB"));
        System.out.println("hashIndex('AB') = " + hashIndex(hashCode("AB")));
    }

    static int hashCode(String str){
        char[] charArray = str.toCharArray();
        int sum = 0;
        for(char c : charArray){
            sum += (int) c;
        }
        return  sum;
    }

    static int hashIndex(int value){
        return value % CAPACITY;
    }
}


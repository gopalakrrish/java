import java.util.Arrays;

public class Array {
    int count = 0;
    int[] array;
    public Array(int length) {
        array = new int[length];
    }
    
    public void insert(int item) {
        if (count == array.length){
            int[] new_array = new int[array.length * 2];
            for(int i=0;i<count;i++)
                new_array[i] = array[i];
            array = new_array;
        }
        array[count] = item;
        count++;
    }

    public void removeAt(int index) {
        if(index < 0 || index >= count)
            throw new IllegalArgumentException();
        for(int i=index;i<count-1;i++)
            array[i] = array[i+1];
        count--;
    }

    public int indexOf(int item) {
        for(int i=0;i<count;i++){
            if(array[i] == item)
                return i;
        }
        return -1;
    }

    public void print() {
        for(int i=0;i<count;i++)
            System.out.println(array[i]);
        System.out.println(Arrays.toString(array));
    }

}

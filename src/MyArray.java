
public class MyArray {
    int count;
    private int[] arr;

    MyArray(int length) {
        arr = new int[length];
    }

    public void insert(int item) {
        if (arr.length == count) {
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newItems[i] = arr[i];
            }
            arr = newItems;
        }
        arr[count++] = item;

    }

    public void removeAt(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();
        for (int i = index; i < count; i++)
            arr[i] = arr[i + 1];
        count--;
    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++) {
            if (arr[i] == item) {
                return i;
            }
        }
        return -1;
    }

    public int max() {
        int maxelement = arr[0];
        for (int i = 1; i < count; i++) {
            if (arr[i] > maxelement) {
                maxelement = arr[i];
            }
        }
        return maxelement;
    }

    public void reverse() {
        int[] newarray = new int[count];
        for (int i = 0; i < count; i++) {
            newarray[count - 1 - i] = arr[i];
        }
        arr = newarray;
    }

    public void insertAt(int index, int item) {
        count++;
        if (index <= arr.length) {

            int[] newarray = new int[(count) * 2];
            for (int i = 0; i < index; i++) {
                newarray[i] = arr[i];
            }
            newarray[index] = item;
            for (int i = index; i < count; i++) {
                newarray[++index] = arr[i];
            }
            arr = newarray;

        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i]);
        }
    }

    public void intersect(MyArray arr2) {
        for (int i = 0; i < this.count; i++) {
            for (int j = 0; j < arr2.count; j++) {
                if (this.arr[i] == arr2.arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}

public class ArrayImplementation {
    public static void main(String[] args) {
        MyArray numbers1 = new MyArray(3);

        numbers1.insert(10);
        numbers1.insert(20);
        numbers1.insert(30);
        numbers1.insert(40);

        MyArray numbers2 = new MyArray(3);
        numbers2.insert(10);
        numbers2.insert(2);
        numbers2.insert(30);
        numbers2.insert(4);
        numbers1.intersect(numbers2);

    }

}

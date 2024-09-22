public class CustomArray {
    private int[] arr;
    private int size;

    public CustomArray(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    public void add(int value) {
        if (size < arr.length) {
            arr[size] = value;
            size++;
        } else {
            System.out.println("The array is full, no more elements can be added.");
        }
    }

    public int get(int index) {
        if (index >= 0 && index < size) {
            return arr[index];
        } else {
            System.out.println("Index Not Correct");
            return -1;
        }
    }

    public void set(int index, int value) {
        if (index >= 0 && index < size) {
            arr[index] = value;
        } else {
            System.out.println("Index Not Correct");
        }
    }

    public void delete(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[size - 1] = 0;
            size--;
        } else {
            System.out.println("Index Not Correct");
        }
    }

    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int search(int value) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public void append(int value) {
        if (size < arr.length) {
            add(value);
        } else {
            enlarge(arr.length * 2);
            add(value);
        }
    }

    public void enlarge(int newSize) {
        if (newSize > arr.length) {
            int[] newArr = new int[newSize];
            for (int i = 0; i < size; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        } else {
            System.out.println("New Size should be Greather Than size ");
        }
    }

    public void merge(CustomArray anotherArray) {
        for (int i = 0; i < anotherArray.getSize(); i++) {
            append(anotherArray.get(i));
        }
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

}

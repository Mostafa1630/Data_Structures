public class LinkedList {
    private Node head;
    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void append(int value) {
        add(value);
    }

    public int get(int index) {
        if (index >= 0 && index < size) {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.data;
        } else {
            System.out.println("Index Not Correct");
            return -1;
        }
    }


    public void addAfterValue(int targetValue, int newValue) {
        Node current = head;
        while (current != null) {
            if (current.data == targetValue) {
                Node newNode = new Node(newValue);
                newNode.next = current.next;
                current.next = newNode;
                size++; // Increase the size of the linked list
                return; // Exit after adding the new node
            }
            current = current.next;
        }
        System.out.println("Value " + targetValue + " not found in the list.");
    }


    public void set(int index, int value) {
        if (index >= 0 && index < size) {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.data = value;
        } else {
            System.out.println("Index Not Correct");
        }
    }

    public void delete(int index) {
        if (index >= 0 && index < size) {
            if (index == 0) {
                head = head.next;
            } else {
                Node current = head;
                for (int i = 0; i < index - 1; i++) {
                    current = current.next;
                }
                current.next = current.next.next;
            }
            size--;
        } else {
            System.out.println("Index Not Correct");
        }
    }

    public int search(int value) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.data == value) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void merge(LinkedList anotherList) {
        if (head == null) {
            head = anotherList.head;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = anotherList.head;
        }
        size += anotherList.size;
    }

    public void enlarge(int newSize) {
        if (newSize > size) {
            for (int i = size; i < newSize; i++) {
                add(0);
            }
        } else {
            System.out.println("New Size should be Greather Than size ");
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}

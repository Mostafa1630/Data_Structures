package BinarySearch;

public class BinarySearch {
    Node root = null;

    boolean isEmpty(){
        return root==null;
    }


    Node find ( int searckey) {
        Node current =  root;
        if(searckey == current.data){
            return current;
        }
        while ( current.data != searckey   ) {
            if ( searckey < current.data )
                current = current.left;
            else
                current = current.right;
            if ( current == null )
                return null;
        }
        return current;
    }

    public boolean search(int value) {
        return searchRec(root, value);
    }

    private boolean searchRec(Node current,int value){
        if(current==null){
            return false;
        }
        if(value==current.data){
            return true;
        }

        if(value<current.data) {
            return searchRec(current.left,value);
        }else {
            return searchRec(current.right,value);
        }
    }

    void insert(int value){
        Node newNode = new Node(value);
        newNode.data = value;
        if(isEmpty()){
            root = newNode;
        }else{
            Node current = root;
            Node parent = current;
            while(true){
                parent = current;
                if(value<current.data){
                    current = current.left;
                    if(current==null){
                        parent.left = newNode;
                        return;
                    }
                }else{
                    current = current.right;
                    if(current==null){
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    int FindMin(){
        Node current = root;
        if(isEmpty()){
            return 0;
        }
        if(current.left != null){
            current = current.left;

        }
        return current.data;
    }

    int FindMax(){
        Node current = root;
        if(isEmpty()){
            return 0;
        }
        if(current.right != null){
            current = current.right;

        }
        return current.data;
    }
}

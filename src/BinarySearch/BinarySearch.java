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
        while(current.left != null){
            current = current.left;

        }
        return current.data;
    }

    int FindMax(){
        Node current = root;
        if(isEmpty()){
            return 0;
        }
        while(current.right != null){
            current = current.right;

        }
        return current.data;
    }

//    to display array {inOrder , preOrder , PostOrder}
    // inOrder ==> parent in medium
    // preOrder ==> parent in frist
    // postOrder ==> parent in last

    void InOrder(Node localRoot){
     if(localRoot != null){
         InOrder(localRoot.left);
         System.out.print(localRoot.data + " ");
         InOrder(localRoot.right);
     }
    }

    void PreOrder(Node localRoot){
        if(localRoot != null){
            System.out.print(localRoot.data + " ");
            PreOrder(localRoot.left);
            PreOrder(localRoot.right);
        }
    }

    void PostOrder(Node localRoot){
        if(localRoot != null){
            PostOrder(localRoot.right);
            PostOrder(localRoot.left);
            System.out.print(localRoot.data + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("mostafa");
        BinarySearch bs = new BinarySearch();
        bs.insert(10);
        bs.insert(5);
        bs.insert(20);
        bs.insert(30);
        System.out.println( bs.search(30));
        System.out.println( bs.FindMax());
        System.out.println( bs.FindMin());
        bs.InOrder(bs.root);
        System.out.println( " ");
        bs.PreOrder(bs.root);
        System.out.println( " ");
        bs.PostOrder(bs.root);
    }
}

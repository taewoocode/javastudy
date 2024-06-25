package collection.link;

public class MyLinkdeListV1 {

    private Node first;
    private int size;

    //기능추가
    public void add(Object e) {
        Node newNode = new Node( e );
        if (first == null) {
            first = newNode;
        } else {
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node getLastNode() {
        Node x = first;
        while (x.next != null) { //null이 아닐 때 까지 계속 순회함
            x = x.next;
        }
        return x;
    }

    public Object set(int index, Object element) {
        Node x = getNode( index );
        Object oldValue = x.item; //엣날 값 넣어주고
        x.item = element; // 새 값 넣어주고
        return oldValue; // 옛날 값 반환
    }

    Object get(int index) {
        Node node = getNode( index );
        return node.item;
    }

    private Node getNode(int index) {
        Node x= first;
        for(int i = 0; i < index; i++){
            x = x.next; //3이면 3번 이동해서 3의 인덱스를 찾는다.
        }
        return x;
    }

    public int indexOf(Object o) {
        int index = 0;
        for (Node x = first; x != null; x = x.next) {
            if (o.equals( x.item )) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkdeListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }


}

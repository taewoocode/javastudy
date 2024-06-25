package collection.link;

public class MyLinkdeListV3<E> {

    private Node<E> first;
    private int size;

    //기능추가
    public void add(E e) {
        Node<E> newNode = new Node( e );
        if (first == null) {
            first = newNode;
        } else {
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node<E> getLastNode() {
        Node<E> x = first;
        while (x.next != null) { //null이 아닐 때 까지 계속 순회함
            x = x.next;
        }
        return x;
    }

    //추가코드
    public void add(int index, E e) {
        Node<E> newNode = new Node<>(e);
        if (index == 0) {
            newNode.next = first; //기존에 first에다가 next를 넣어준다음
            first = newNode; //새로운 노드를 first에 넣어준다.
        } else {
            Node<E> prev = getNode( index - 1 );
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    public Object set(int index, E element) {
        Node<E> x = getNode( index );
        E oldValue = x.item; //엣날 값 넣어주고
        x.item = element; // 새 값 넣어주고
        return oldValue; // 옛날 값 반환
    }

    //추가코드
    public E remove(int index) {
        Node<E> removeNode = getNode( index );
        E removeItem = removeNode.item;
        if (index == 0) {
            first = removeNode.next;
        } else {
            Node prev = getNode( index - 1 );
            prev.next = removeNode.next;
        }
        removeNode.item = null;
        removeNode.next = null;
        size--;
        return removeItem;
    }

    E get(int index) {
        Node<E> node = getNode( index );
        return node.item;
    }

    private Node<E> getNode(int index) {
        Node<E> x= first;
        for(int i = 0; i < index; i++){
            x = x.next; //3이면 3번 이동해서 3의 인덱스를 찾는다.
        }
        return x;
    }

    public int indexOf(E o) {
        int index = 0;
        for (Node<E> x = first; x != null; x = x.next) {
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

    //중첩 클래스 만들기
    private static class Node<E> {

        E item;
        Node next;

        public Node(E item) {
            this.item = item;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder(); //loop에서 문자를 떠할 땐 stringBuilder가 좋다.
            Node<E> x = this;
            sb.append( "[" );
            while (x != null) {
                sb.append( x.item );
                if (x.next != null) {
                    sb.append( "->" );
                }
                x = x.next;
            }
            sb.append( "]" );
            return sb.toString(); //command optN
        }
    }
}

package collection.list;

public interface MyList<E> {

    //list가 제공하는 기능

    int size();

    void add(E e);

    void add(int index, E e);

    E get(int index);

    E set(int index, E element);

    E remove(int index);

    int indexOf(E o);
}

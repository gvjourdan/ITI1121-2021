// lots of missing methods and missing implementations

public interface List<E> {

    void add( int index, E elem );
    void add( E elem );

    E remove( int index );
    boolean remove( E o );

    E get( int index );
 //   E set( int index, E element );

 //   int indexOf( E o );
 //   int lastIndexOf( E o );

 //   boolean contains( E o );

    int size();
    boolean isEmpty();
}


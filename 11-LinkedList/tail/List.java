// lots of missing methods and missing implementations

public interface List<E> {

    public abstract void add( int index, E elem );
    public abstract void add( E elem );

    public abstract E remove( int index );
    public abstract boolean remove( E o );

    public abstract E get( int index );
 //   public abstract E set( int index, E element );

 //   public abstract int indexOf( E o );
 //   public abstract int lastIndexOf( E o );

 //   public abstract boolean contains( E o );

    public abstract int size();
    public abstract boolean isEmpty();
}


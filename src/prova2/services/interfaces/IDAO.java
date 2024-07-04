package prova2.services.interfaces;

public interface IDAO<T> {
    boolean add(T object);

    boolean remove(Long id);

    T findById(Long id);
}

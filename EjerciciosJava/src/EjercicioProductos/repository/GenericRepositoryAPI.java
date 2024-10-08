package EjercicioProductos.repository;

import java.util.List;

public interface GenericRepositoryAPI<K,T>{
    T insert(T x);
    T get(K key);
    List <T> getAll();

    //TODO update
    void delete(K key);
}

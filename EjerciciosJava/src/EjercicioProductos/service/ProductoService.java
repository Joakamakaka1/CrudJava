package EjercicioProductos.service;

import EjercicioProductos.model.Producto;
import EjercicioProductos.repository.GenericRepositoryAPI;

import java.util.List;

public class ProductoService {

    private GenericRepositoryAPI<String, Producto> repository;

    public ProductoService(GenericRepositoryAPI<String, Producto> repository) {
        this.repository = repository;
    }

    public Producto insert(Producto newProduct) {
        if (newProduct == null || newProduct.getId().isEmpty()) {
            return null;
        }
        return repository.insert(newProduct);
    }

    public Producto get(String key) {
        if (key == null || key.trim().isEmpty()) {
            return null;
        }
        return repository.get(key);
    }

    public List<Producto> getAll() {
        if (repository == null) {
            return null;
        }
        return repository.getAll();
    }

    public void delete(String key) {
        if (key == null || key.trim().isEmpty()) {
            return;
        }
        repository.delete(key);
    }
}

package EjercicioProductos.controller;

import EjercicioProductos.model.Producto;
import EjercicioProductos.repository.GenericRepositoryAPI;
import EjercicioProductos.repository.ProductoRepository;

import java.lang.reflect.ReflectPermission;
import java.util.List;

public class ProductoController {

    private GenericRepositoryAPI<String, Producto> repository;

    public ProductoController() {
        this.repository = new ProductoRepository();
    }

    public Producto insert(Producto newProducto){
        return repository.insert(newProducto);
    }
}

package EjercicioProductos.controller;

import EjercicioProductos.model.Empleado;
import EjercicioProductos.model.Producto;
import EjercicioProductos.repository.EmpleadoRepository;
import EjercicioProductos.repository.GenericRepositoryAPI;
import EjercicioProductos.repository.ProductoRepository;
import EjercicioProductos.service.ProductoService;

import java.util.List;

public class ProductoController {

    private final ProductoService service;

    public ProductoController() {
        GenericRepositoryAPI<String, Producto> repository = new ProductoRepository();
        this.service = new ProductoService(repository);
    }

    public Producto insert(Producto newProducto) {
        try {
            Producto p = service.get(newProducto.getNombre());
            return p != null ? service.insert(newProducto) : null;
        } catch (Exception e) {
            return null;
        }
    }

    public List<Producto> getAll() {
        try {
            if(service.getAll() == null) {
                return null;
            }
            return service.getAll();
        } catch (Exception e) {
            return null;
        }
    }

    public Producto get(String key) {
        try {
            Producto p = service.get(key);
            return p != null ? service.get(key) : null;
        } catch (Exception e) {
            return null;
        }
    }

    public void delete(String key) {
        try {
            if (service.get(key) == null) {
                return;
            }
            service.delete(key);
        } catch (Exception e) {
            return;
        }
    }
}


package EjercicioProductos.repository;

import EjercicioProductos.model.Producto;

import java.util.*;

public class ProductoRepository implements GenericRepositoryAPI<String, Producto> {

    private Set<Producto> productos;

    public ProductoRepository() {
        this.productos = new HashSet<>();
        productos.add(new Producto(1, "Laptop", "1000€", 10));
        productos.add(new Producto(2, "Laptop", "1000€", 10));
        productos.add(new Producto(3, "Laptop", "1000€", 10));
        productos.add(new Producto(4, "Laptop", "1000€", 10));
        productos.add(new Producto(5, "Laptop", "1000€", 10));
    }

    public Producto insert(Producto producto) {
        this.productos.add(producto);
        return get(producto.getNombre());
    }

    public Producto get(String key) {
        return productos.stream().filter(producto -> producto.getNombre().equals(key)).findFirst().orElse(null);
    }

    public List<Producto> getAll() {
        ArrayList<Producto> list = new ArrayList<>();
        productos.stream().toList().forEach(producto -> list.add(producto));
        return list;
    }

    /* TODO update
    public Producto update(){
        return null;
    }
    */

    public void delete(String dni) {
        Producto prodToDelete = productos.stream().filter(producto -> producto.getNombre().equals(dni)).findFirst().orElse(null);
        this.productos.remove(prodToDelete);
    }
}

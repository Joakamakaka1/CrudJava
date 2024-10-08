package EjercicioProductos.repository;

import EjercicioProductos.model.Empleado;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmpleadoRepository implements GenericRepositoryAPI<String, Empleado> {

    private Set<Empleado> empleados;

    public EmpleadoRepository() {
        this.empleados = new HashSet<>();
        empleados.add(new Empleado("11111111A", "Javier", "RRHH", "javier@javier"));
        empleados.add(new Empleado("22222222B", "Pedro", "RRHH", "pedro@pedro"));
        empleados.add(new Empleado("33333333C", "Miguel", "RRHH", "miguel@miguel"));
    }

    public Empleado insert(Empleado empleado) {
        this.empleados.add(empleado);
        return get(empleado.getDni());
    }

    public Empleado get(String key) {
        return empleados.stream().filter(empleados -> empleados.getDni().equals(key)).findFirst().orElse(null);
    }

    public List<Empleado> getAll() {
        ArrayList<Empleado> list = new ArrayList<>();
        empleados.stream().toList().forEach(empleados -> list.add(empleados));
        return list;
    }

    /* TODO update
    public Empleado update() {
        return null;
    }
    */

    public void delete(String dni) {
        Empleado empToDelete = empleados.stream().filter(empleados -> empleados.getDni().equals(dni)).findFirst().orElse(null);
        this.empleados.remove(empToDelete);
    }
}


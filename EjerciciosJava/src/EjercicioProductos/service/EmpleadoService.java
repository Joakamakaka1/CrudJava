package EjercicioProductos.service;

import EjercicioProductos.model.Empleado;
import EjercicioProductos.repository.GenericRepositoryAPI;

import java.util.List;

public class EmpleadoService {

    private GenericRepositoryAPI<String, Empleado> repository;

    public EmpleadoService(GenericRepositoryAPI<String, Empleado> repository) {
        this.repository = repository;
    }

    public Empleado insert(Empleado newEmploye) {
        if (newEmploye == null || newEmploye.getDni().isEmpty()) {
            return null;
        }
        return repository.insert(newEmploye);
    }

    public Empleado get(String key) {
        if (key == null || key.isEmpty()) {
            return null;
        }
        return repository.get(key);
    }

    public List<Empleado> getAll() {
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

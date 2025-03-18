package com.crud.Service;

import com.crud.Entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {
    List<Producto> listarTodos();
    Optional<Producto> obtenerPorId(Long id);
    Producto guardar(Producto producto);
    void eliminar(Long id);
    Producto actualizar(Long id, Producto productoActualizado);
}
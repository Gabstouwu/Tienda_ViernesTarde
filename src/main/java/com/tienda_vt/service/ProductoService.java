package com.tienda_vt.service;

import com.tienda_vt.domain.Producto;
import java.util.List;

public interface ProductoService {

    //Se define la firma del metodo que recupera la lista de objetos tipo Producto de la tabla producto
    public List<Producto> getProductos(boolean activos);

    //se define la firma del metodo para recuperar un registros de la tabla producto
    public Producto getProducto(Producto producto);

    /// se define la tabla para  crear o actualizar el registro de producto
    public void save(Producto producto);

    /// se define la tabla para  eliminar el registro de producto
    public void delete(Producto producto);
}

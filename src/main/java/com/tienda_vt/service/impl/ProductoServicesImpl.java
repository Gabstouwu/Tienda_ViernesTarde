package com.tienda_vt.service.impl;

import com.tienda_vt.dao.ProductoDao;
import com.tienda_vt.domain.Producto;
import com.tienda_vt.service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductoServicesImpl implements ProductoService {
    
    @Autowired
    private ProductoDao productoDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Producto> getProductos(boolean activos) {
        var lista = productoDao.findAll();
        if (activos) {
            lista.removeIf(c -> !c.isActivo());
        }
        return lista;
    }
    
    @Override
    @Transactional(readOnly = true)
    public Producto getProducto(Producto producto) {
        return productoDao.findById(producto.getIdProducto()).orElse(null);
    }
    
    @Override
    @Transactional
    public void save(Producto producto) {
        productoDao.save(producto);
    }
    
    @Override
    @Transactional
    public void delete(Producto producto) {
        productoDao.delete(producto);
    }
}

package edu.umss.dip.ssiservice.model;

import edu.umss.dip.ssiservice.dto.SeccionDto;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Seccion extends ModelBase<SeccionDto> {
    @ManyToOne(optional = false)
    private Empresa empresa;
    private String nombre;
    private String ubicacion;

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}

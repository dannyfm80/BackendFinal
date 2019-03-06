package edu.umss.dip.ssiservice.model;


import edu.umss.dip.ssiservice.dto.ObraDto;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Obra extends ModelBase<ObraDto> {

    @ManyToOne(optional = false)
    private Seccion seccion;
    private String nombre;
    private String telefono;
    private String direccion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }
}

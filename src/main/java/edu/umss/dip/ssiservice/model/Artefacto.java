package edu.umss.dip.ssiservice.model;

import edu.umss.dip.ssiservice.dto.ArtefactoDto;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Artefacto extends ModelBase<ArtefactoDto> {
    @ManyToOne(optional = false)
    private TipoArtefacto tipoArtefacto;
    private String nombre;
    private String modelo;
    private Date Ingreso;
    private String estado;
    private int cantidad;

    public TipoArtefacto getTipoArtefacto() {
        return tipoArtefacto;
    }

    public void setTipoArtefacto(TipoArtefacto tipoArtefacto) {
        this.tipoArtefacto = tipoArtefacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getIngreso() {
        return Ingreso;
    }

    public void setIngreso(Date ingreso) {
        Ingreso = ingreso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}

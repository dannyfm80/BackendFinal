package edu.umss.dip.ssiservice.model;

import edu.umss.dip.ssiservice.dto.MantenimientoDto;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Mantenimiento extends ModelBase<MantenimientoDto> {
    @ManyToOne(optional = false)
    private DetalleArtefacto detalleArtefacto;
    private Date fechaInicio;
    private Date fechaFin;
    private String Detalle;

    public DetalleArtefacto getDetalleArtefacto() {
        return detalleArtefacto;
    }

    public void setDetalleArtefacto(DetalleArtefacto detalleArtefacto) {
        this.detalleArtefacto = detalleArtefacto;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getDetalle() {
        return Detalle;
    }

    public void setDetalle(String detalle) {
        Detalle = detalle;
    }
}

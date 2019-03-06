package edu.umss.dip.ssiservice.dto;

import edu.umss.dip.ssiservice.model.Mantenimiento;
import org.modelmapper.ModelMapper;

import java.util.Date;

public class MantenimientoDto extends DtoBase<Mantenimiento> {
    private Date fechaInicio;
    private Date fechaFin;
    private String Detalle;
    private Long detalleArtefactoId;
    private String serialArtefacto;

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

    public Long getDetalleArtefactoId() {
        return detalleArtefactoId;
    }

    public void setDetalleArtefactoId(Long detalleArtefactoId) {
        this.detalleArtefactoId = detalleArtefactoId;
    }

    public String getSerialArtefacto() {
        return serialArtefacto;
    }

    public void setSerialArtefacto(String serialArtefacto) {
        this.serialArtefacto = serialArtefacto;
    }

    @Override
    public DtoBase toDto(Mantenimiento element, ModelMapper mapper) {
        super.toDto(element, mapper);
        setSerialArtefacto(element.getDetalleArtefacto().getSerial());
        setDetalleArtefactoId(element.getDetalleArtefacto().getId());
        return this;
    }
}

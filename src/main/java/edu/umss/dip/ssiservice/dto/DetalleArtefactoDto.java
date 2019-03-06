package edu.umss.dip.ssiservice.dto;

import edu.umss.dip.ssiservice.model.Artefacto;
import edu.umss.dip.ssiservice.model.DetalleArtefacto;
import org.modelmapper.ModelMapper;

import java.util.Date;

public class DetalleArtefactoDto extends DtoBase<DetalleArtefacto> {
    private String serial;
    private Date Ingreso;
    private String estado;
    private String nombreArtefacto;
    private Long artefactoId;

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
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

    public String getNombreArtefacto() {
        return nombreArtefacto;
    }

    public void setNombreArtefacto(String nombreArtefacto) {
        this.nombreArtefacto = nombreArtefacto;
    }

    public Long getArtefactoId() {
        return artefactoId;
    }

    public void setArtefactoId(Long artefactoId) {
        this.artefactoId = artefactoId;
    }

    @Override
    public DtoBase toDto(DetalleArtefacto element, ModelMapper mapper) {
        super.toDto(element, mapper);
        setNombreArtefacto(element.getArtefacto().getNombre());
        setArtefactoId(element.getArtefacto().getId());
        return this;
    }
}

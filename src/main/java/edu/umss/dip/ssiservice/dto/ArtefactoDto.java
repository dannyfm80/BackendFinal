package edu.umss.dip.ssiservice.dto;

import edu.umss.dip.ssiservice.model.Artefacto;
import org.modelmapper.ModelMapper;

import java.util.Date;

public class ArtefactoDto extends DtoBase<Artefacto> {
    private String nombre;
    private String modelo;
    private Date Ingreso;
    private String estado;
    private int cantidad;
    private String codigoArtefacto;
    private Long tipoArtefactoId;

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

    public String getCodigoArtefacto() {
        return codigoArtefacto;
    }

    public void setCodigoArtefacto(String codigoArtefacto) {
        this.codigoArtefacto = codigoArtefacto;
    }

    public Long getTipoArtefactoId() {
        return tipoArtefactoId;
    }

    public void setTipoArtefactoId(Long tipoArtefactoId) {
        this.tipoArtefactoId = tipoArtefactoId;
    }

    @Override
    public DtoBase toDto(Artefacto element, ModelMapper mapper) {
        super.toDto(element, mapper);
        setCodigoArtefacto(element.getTipoArtefacto().getCodigo());
        setTipoArtefactoId(element.getTipoArtefacto().getId());
        return this;
    }
}

package edu.umss.dip.ssiservice.model;

import edu.umss.dip.ssiservice.dto.TipoArtefactoDto;

import javax.persistence.Entity;

@Entity
public class TipoArtefacto extends ModelBase<TipoArtefactoDto> {
    private String codigo;
    private String descripcion;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

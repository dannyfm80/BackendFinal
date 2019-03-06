package edu.umss.dip.ssiservice.dto;

import edu.umss.dip.ssiservice.model.TipoArtefacto;

public class TipoArtefactoDto extends DtoBase<TipoArtefacto> {
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

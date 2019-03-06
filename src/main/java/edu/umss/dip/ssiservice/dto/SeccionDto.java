package edu.umss.dip.ssiservice.dto;

import edu.umss.dip.ssiservice.model.Seccion;
import org.modelmapper.ModelMapper;

public class SeccionDto extends DtoBase<Seccion> {
    private Long empresaId;
    private String nombre;
    private String ubicacion;
    private String telefonoEmpresa;

    public Long getEmpresaId() {
        return empresaId;
    }

    public void setEmpresaId(Long empresaId) {
        this.empresaId = empresaId;
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

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public DtoBase toDto(Seccion element, ModelMapper mapper){
        super.toDto(element, mapper);
        setTelefonoEmpresa(element.getEmpresa().getTelefono());
        setEmpresaId(element.getEmpresa().getId());
        return this;
    }
}

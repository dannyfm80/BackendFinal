package edu.umss.dip.ssiservice.dto;

import edu.umss.dip.ssiservice.model.Obra;
import org.modelmapper.ModelMapper;

public class ObraDto extends DtoBase<Obra> {
    private String nombre;
    private String telefono;
    private String direccion;
    private String nombreSeccion;
    private Long seccionId;

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

    public String getNombreSeccion() {
        return nombreSeccion;
    }

    public void setNombreSeccion(String nombreSeccion) {
        this.nombreSeccion = nombreSeccion;
    }

    public Long getSeccionId() {
        return seccionId;
    }

    public void setSeccionId(Long seccionId) {
        this.seccionId = seccionId;
    }

    @Override
    public DtoBase toDto(Obra element, ModelMapper mapper) {
        super.toDto(element, mapper);
        setNombreSeccion(element.getSeccion().getNombre());
        setSeccionId(element.getSeccion().getId());
        return this;
    }
}

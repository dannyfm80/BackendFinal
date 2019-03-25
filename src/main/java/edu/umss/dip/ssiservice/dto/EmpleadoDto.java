package edu.umss.dip.ssiservice.dto;

import edu.umss.dip.ssiservice.model.Empleado;
import org.modelmapper.ModelMapper;

import java.util.Date;

public class EmpleadoDto extends DtoBase<Empleado>{
    private String nombre;
    private String apellido;
    private String telefono;
    private int id_seccion;
    private String cargo;
    private String titulo;
    private Date fecha_contratacion;
    private String estado;
    private Long personaId;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getId_seccion() {
        return id_seccion;
    }

    public void setId_seccion(int id_seccion) {
        this.id_seccion = id_seccion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFecha_contratacion() {
        return fecha_contratacion;
    }

    public void setFecha_contratacion(Date fecha_contratacion) {
        this.fecha_contratacion = fecha_contratacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Long getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Long personaId) {
        this.personaId = personaId;
    }

    @Override
    public EmpleadoDto toDto(Empleado empl, ModelMapper mapper) {
        super.toDto(empl, mapper);
        setNombre(empl.getPersona().getNOMBRES());
        setApellido(empl.getPersona().getAPELLIDOS());
        setTelefono(empl.getPersona().getTELEFONO());
        setPersonaId(empl.getPersona().getId());
        return this;
    }

}

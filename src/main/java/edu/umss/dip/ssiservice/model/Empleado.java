package edu.umss.dip.ssiservice.model;

import edu.umss.dip.ssiservice.dto.EmpleadoDto;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Empleado extends ModelBase<EmpleadoDto> {
    @OneToOne(optional = false)
    private Persona persona;
    private int id_seccion;
    private String cargo;
    private String titulo;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_contratacion;
    @Column(columnDefinition = "char(1)")
    private String estado;

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
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
}

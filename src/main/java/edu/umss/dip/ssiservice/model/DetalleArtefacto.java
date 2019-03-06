package edu.umss.dip.ssiservice.model;

import edu.umss.dip.ssiservice.dto.DetalleArtefactoDto;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class DetalleArtefacto extends ModelBase<DetalleArtefactoDto>{
    @ManyToOne(optional = false)
    private Artefacto artefacto;
    private String serial;
    private Date Ingreso;
    private String estado;

    public Artefacto getArtefacto() {
        return artefacto;
    }

    public void setArtefacto(Artefacto artefacto) {
        this.artefacto = artefacto;
    }

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
}

package edu.umss.dip.ssiservice.model;

import edu.umss.dip.ssiservice.dto.PersonaDto;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Persona extends ModelBase<PersonaDto> {

    private  String NOMBRES;
    private  String APELLIDOS;
    @Column(length = 25)
    private  String TELEFONO;
    @Column(length = 200)
    private  String DIRECCION;
    private  String EMAIL;
    @Column(columnDefinition = "char(2)")
    private  String SEXO;
    @Temporal(TemporalType.TIMESTAMP)
    private  Date NACIMIENTO;
    private  String CI;
    private  String NACIONALIDAD;

    public String getNOMBRES() {
        return NOMBRES;
    }

    public void setNOMBRES(String NOMBRES) {
        this.NOMBRES = NOMBRES;
    }

    public String getAPELLIDOS() {
        return APELLIDOS;
    }

    public void setAPELLIDOS(String APELLIDOS) {
        this.APELLIDOS = APELLIDOS;
    }

    public String getTELEFONO() {
        return TELEFONO;
    }

    public void setTELEFONO(String TELEFONO) {
        this.TELEFONO = TELEFONO;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getSEXO() {
        return SEXO;
    }

    public void setSEXO(String SEXO) {
        this.SEXO = SEXO;
    }

    public Date getNACIMIENTO() {
        return NACIMIENTO;
    }

    public void setNACIMIENTO(Date NACIMIENTO) {
        this.NACIMIENTO = NACIMIENTO;
    }

    public String getCI() {
        return CI;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }

    public String getNACIONALIDAD() {
        return NACIONALIDAD;
    }

    public void setNACIONALIDAD(String NACIONALIDAD) {
        this.NACIONALIDAD = NACIONALIDAD;
    }

}

package edu.umss.dip.ssiservice.dto;

import edu.umss.dip.ssiservice.model.Persona;

import java.util.Date;

public class PersonaDto extends DtoBase<Persona>{
    private  String NOMBRES;
    private  String APELLIDOS;
    private  String TELEFONO;
    private  String DIRECCION;
    private  String EMAIL;
    private  String SEXO;
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

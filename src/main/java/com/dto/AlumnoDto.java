package com.dto;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class AlumnoDto {
    private Integer idAlu;
    private String apePat;
    private String apeMat;
    private String nombre;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fcNac;
    private String desEma;

    private Integer idGene;

    public Integer getIdAlu() {
        return idAlu;
    }

    public void setIdAlu(Integer idAlu) {
        this.idAlu = idAlu;
    }

    public String getApePat() {
        return apePat;
    }

    public void setApePat(String apePat) {
        this.apePat = apePat;
    }

    public String getApeMat() {
        return apeMat;
    }

    public void setApeMat(String apeMat) {
        this.apeMat = apeMat;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFcNac() {
        return fcNac;
    }

    public void setFcNac(Date fcNac) {
        this.fcNac = fcNac;
    }

    public String getDesEma() {
        return desEma;
    }

    public void setDesEma(String desEma) {
        this.desEma = desEma;
    }

    public Integer getIdGene() {
        return idGene;
    }

    public void setIdGene(Integer idGene) {
        this.idGene = idGene;
    }
}

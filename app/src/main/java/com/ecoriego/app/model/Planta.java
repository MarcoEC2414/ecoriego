package com.ecoriego.app.model;
public class Planta {
 private int id; private String nombre, especie, fechaSiembra, ubicacion, notas; private int frecuencia;
 public Planta(){} public Planta(int id,String nombre,String especie,String fechaSiembra,int frecuencia,String ubicacion,String notas){this.id=id;this.nombre=nombre;this.especie=especie;this.fechaSiembra=fechaSiembra;this.frecuencia=frecuencia;this.ubicacion=ubicacion;this.notas=notas;}
 public int getId(){return id;} public void setId(int v){id=v;} public String getNombre(){return nombre;} public void setNombre(String v){nombre=v;} public String getEspecie(){return especie;} public void setEspecie(String v){especie=v;} public String getFechaSiembra(){return fechaSiembra;} public void setFechaSiembra(String v){fechaSiembra=v;} public int getFrecuencia(){return frecuencia;} public void setFrecuencia(int v){frecuencia=v;} public String getUbicacion(){return ubicacion;} public void setUbicacion(String v){ubicacion=v;} public String getNotas(){return notas;} public void setNotas(String v){notas=v;}
}

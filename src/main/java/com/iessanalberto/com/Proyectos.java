package com.iessanalberto.com;

import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;

@XmlRootElement(name = "proyectos")
@XmlType(propOrder = {"participantes", "tags", "familias", "descripcion", "coordinador", "valoracion", "estado", "visibilidad"})

public class Proyectos {

    ArrayList<String> participantes;
    ArrayList<String> tags;
    ArrayList<String> familiaImplicadas;
    String titulo, descripcion, coordinador;
    com.iessanalberto.com.Valoracion valoracion;
    Boolean estado, visibilidad;

    public Proyectos() {

    }

    public Proyectos(ArrayList<String> participantes, ArrayList<String> tags, ArrayList<String> familiaImplicadas, String titulo, String descripcion, String coordinador, Valoracion valoracion, Boolean estado, Boolean visibilidad) {
        this.participantes = participantes;
        this.tags = tags;
        this.familiaImplicadas = familiaImplicadas;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.coordinador = coordinador;
        this.valoracion = valoracion;
        this.estado = estado;
        this.visibilidad = visibilidad;
    }

    @XmlElement(name = "participante")
    @XmlElementWrapper(name = "participantes")
    public ArrayList<String> getParticipantes() {
        return participantes;
    }

    @XmlElement(name = "tag")
    @XmlElementWrapper(name = "tags")
    public ArrayList<String> getTags() {
        return tags;
    }

    @XmlElement(name = "familia")
    @XmlElementWrapper(name = "familias")
    public ArrayList<String> getFamiliaImplicadas() {
        return familiaImplicadas;
    }

    @XmlAttribute(name = "titulo")
    public String getTitulo() {
        return titulo;
    }

    @XmlElement(name = "descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    @XmlElement(name = "coordinador")
    public String getCoordinador() {
        return coordinador;
    }

    @XmlElement(name = "valoracion")
    public Valoracion getValoracion() {
        return valoracion;
    }

    @XmlElement(name = "estado")
    public Boolean getEstado() {
        return estado;
    }

    @XmlElement(name = "visibilidad")
    public Boolean getVisibilidad() {
        return visibilidad;
    }


    public void setParticipantes(ArrayList<String> participantes) {
        this.participantes = participantes;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public void setFamiliaImplicadas(ArrayList<String> familiaImplicadas) {
        this.familiaImplicadas = familiaImplicadas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCoordinador(String coordinador) {
        this.coordinador = coordinador;
    }

    public void setValoracion(Valoracion valoracion) {
        this.valoracion = valoracion;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public void setVisibilidad(Boolean visibilidad) {
        this.visibilidad = visibilidad;
    }
}

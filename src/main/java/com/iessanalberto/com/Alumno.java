package com.iessanalberto.com;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;

@XmlRootElement(name="alumno")
@XmlType(propOrder={"centro", "rol", "nombre", "contrasenia", "puntuacion", "familiaProfesional", "contacto", "proyectos"})

public class Alumno {

	private Centros centro;
	private String rol, nombre, contrasenia, contacto, familiaProfesional;
	private Double puntuacion;
	private Proyecto proyectos;
	
	public Alumno() {}

	public Alumno(Centros centro, String rol, String nombre, String contrasenia, String familiaProfesional, String contacto, Double puntuacion, Proyecto proyectos) {
		this.centro = centro;
		this.rol = rol;
		this.nombre = nombre;
		this.contrasenia = contrasenia;
		this.familiaProfesional = familiaProfesional;
		this.contacto = contacto;
		this.puntuacion = puntuacion;
		this.proyectos = proyectos;
	}

	@XmlElement(name="centro")
	public Centros getCentro() {
		return centro;
	}
	public void setCentro(Centros centro) {
		this.centro = centro;
	}
	
	@XmlElement(name="rol")
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}

	@XmlElement(name="nombre")
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@XmlElement(name="contrasenia")
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	@XmlElement(name="familiaProfesional")
	public String getFamiliaProfesional() {
		return familiaProfesional;
	}
	public void setFamiliaProfesional(String familiaProfesional) {
		this.familiaProfesional = familiaProfesional;
	}

	@XmlElement(name="contacto")
	public String getContacto() {
		return contacto;
	}
	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	@XmlElement(name="puntuacion")
	public Double getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(Double puntuacion) {
		this.puntuacion = puntuacion;
	}

	@XmlElement(name="proyectos")
	public Proyecto getProyectos() {
		return proyectos;
	}
	public void setProyectos(Proyecto proyectos) {
		this.proyectos = proyectos;
	}
	
}

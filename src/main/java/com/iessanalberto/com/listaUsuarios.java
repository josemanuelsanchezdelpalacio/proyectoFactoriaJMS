package com.iessanalberto.com;
import jakarta.xml.bind.annotation.XmlRootElement;


import java.util.ArrayList;
@XmlRootElement(name = "usuarios")
public class listaUsuarios {
    ArrayList<Usuario> usuarios;

    public listaUsuarios() {
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
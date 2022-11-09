package com.iessanalberto.com;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> participantes = new ArrayList<>();
        ArrayList<String> tags = new ArrayList<>();
        ArrayList<String> familiaImplicadas = new ArrayList<>();
        Valoracion valoracion = new Valoracion();

        participantes.add("Jorge");
        tags.add("Informatica");
        familiaImplicadas.add("Informatica");

        Proyectos proyecto = new Proyectos(participantes, tags, familiaImplicadas, "Proyecto Movil", "Hola", "Sandra", valoracion, true, false);
        ArrayList<Proyectos> list = new ArrayList<>();
        list.add(proyecto);
        Proyectos proyectos = new Proyectos();
        proyectos.setTitulo("Proyecto Movil");


        Path path = Path.of("target/Proyecto.json");
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.setPrettyPrinting().create();
        String texto = gson.toJson(proyecto);

        try {
            Files.write(path, texto.getBytes());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
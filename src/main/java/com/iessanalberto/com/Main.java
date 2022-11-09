package com.iessanalberto.com;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws JAXBException {

        JAXBContext jaxbContext = JAXBContext.newInstance(listaProyectos.class);

        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        listaProyectos listaProyectos;
        listaProyectos = (com.iessanalberto.com.listaProyectos) unmarshaller.unmarshal(new File("src/main/resources/proyectos.xml"));

        Path path = Path.of("target/Proyecto.json");
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.setPrettyPrinting().create();
        String texto = gson.toJson(listaProyectos);

        try {
            Files.write(path, texto.getBytes());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
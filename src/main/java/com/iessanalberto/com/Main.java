package com.iessanalberto.com;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws JAXBException {

        JAXBContext jaxbContext = JAXBContext.newInstance(listaProyectos.class, Usuario.class, Centros.class);

        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        listaProyectos listaProyectos;
        Usuario listaUsuarios;
        Centros listaCentros;

        listaProyectos = (listaProyectos) unmarshaller.unmarshal(new File("src/main/resources/proyectos.xml"));
        listaUsuarios = (Usuario) unmarshaller.unmarshal(new File("src/main/resources/usuarios.xml"));
        listaCentros = (Centros) unmarshaller.unmarshal(new File("src/main/resources/centros.xml"));

        Path pathProyecto = Path.of("target/Proyecto.json");
        Path pathUsuario = Path.of("target/Usuario.json");
        Path pathCentro = Path.of("target/Centro.json");

        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.setPrettyPrinting().create();
        String textoProyecto = gson.toJson(listaProyectos);
        String textoUsuario = gson.toJson(listaUsuarios);
        String textoCentro = gson.toJson(listaCentros);

        try {
            Files.write(pathProyecto, textoProyecto.getBytes());
            Files.write(pathUsuario, textoUsuario.getBytes());
            Files.write(pathCentro, textoCentro.getBytes());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
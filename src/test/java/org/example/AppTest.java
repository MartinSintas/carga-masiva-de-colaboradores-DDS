package org.example;

import domain.Colaborador;
import domain.LectorArchivos;
import domain.Usuario;

import java.util.ArrayList;

public class AppTest {
    public static void main(String[] args) {
        String rutaArchivo = "C:\\Users\\Martín Sintas\\IdeaProjects\\carga-masiva-de-colaboradores\\src\\main\\java\\resource\\ejemplocsv";

        LectorArchivos lector = new LectorArchivos(rutaArchivo);
        lector.parsearArchivo();

        ArrayList<Colaborador> colaboradores = lector.listarColaboradores();
        ArrayList<Usuario> usuarios = lector.listarUsuarios();

        System.out.println("Colaboradores:");
        for (Colaborador colaborador : colaboradores) {
            System.out.println(colaborador.getTipoDoc() + " " + colaborador.getDocumento() + ": " + colaborador.getNombre());
        }

        System.out.println("\nUsuarios:");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario.getTipoDoc() + " " + usuario.getDocumento());
        }
    }
}

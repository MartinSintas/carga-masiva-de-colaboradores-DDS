package domain;

import  java.time.LocalDate;
import java.util.ArrayList;

public class Usuario {
    private Number documento;
    private String tipoDoc;

    private Colaborador colaborador;

    //me busca en la lista de usuarios (ver de donde sale) a los usuarios segun su dni
    public static Usuario buscarUsuario(ArrayList<Usuario> usuarios, Number documento) {
        for (Usuario usuario : usuarios) {
            if (usuario.getDocumento().equals(documento)) {
                return usuario; // Retorna el usuario si se encuentra
            }
        }
        return null; // Retorna null si no se encuentra el usuario
    }




    public Colaborador getColaborador(){
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador){
        this.colaborador = colaborador;
    }

    public Usuario(Number documento, String tipoDoc){
        this.tipoDoc = tipoDoc;
        this.documento = documento;
    }

    public Number getDocumento(){
        return documento;
    }

    //supongo que getIDUsuario va a ser el documento
    //public Number getIdUsuario(){
    //    return  documento;
    //}
    
    public String getTipoDoc(){
        return tipoDoc;
    }
}

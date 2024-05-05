package domain;

import  java.time.LocalDate;
public class Usuario {
    private Number documento;
    private String tipoDoc;

    private Colaborador colaborador;
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

    public String getTipoDoc(){
        return tipoDoc;
    }
}

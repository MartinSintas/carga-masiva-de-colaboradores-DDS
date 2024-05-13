package domain;

import java.time.LocalDate;

public class Colaborador {
    //public Enum tipoDoc; despues agregar enum
    public String tipoDoc;
    public Number documento;
    public String nombre;
    public String apellido;
    public String mail;
    public LocalDate fechaDeColaboracion;
    public String formaDeColaboracion;
    public Number cantidad;

    //public Colaborador colaborador;
    //agregar enum de tipo doc

    private Usuario usuario;



    public Usuario getUsuario() {
        String identificacion = tipoDoc + " " + documento;
        // Ver de donde se fija si existe el usuario o no
        // Si se encuentra el usuario, lo devuelves; si no, creas uno nuevo
        return usuario;
    }


public Colaborador(String tipoDoc, Number documento, String nombre, String apellido, String mail,
                   LocalDate fechaDeColaboracion, String formaDeColaboracion,Number cantidad ){
    this.tipoDoc = tipoDoc;
    this.documento = documento;
    this.nombre = nombre;
    this.apellido = apellido;
    this.mail= mail;
    this.fechaDeColaboracion = fechaDeColaboracion;
    this.formaDeColaboracion = formaDeColaboracion;
    this.cantidad = cantidad;
}


    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public Number getDocumento(){
        return documento;
    }

    public void setDocumento(Number documento){
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public LocalDate getFechaDeColaboracion() {
        return fechaDeColaboracion;
    }

    public void setFechaDeColaboracion(LocalDate fechaDeColaboracion) {
        this.fechaDeColaboracion = fechaDeColaboracion;
    }

    public String getFormaDeColaboracion() {
        return formaDeColaboracion;
    }

    public void setFormaDeColaboracion(String formaDeColaboracion) {
        this.formaDeColaboracion = formaDeColaboracion;
    }

    public Number getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}

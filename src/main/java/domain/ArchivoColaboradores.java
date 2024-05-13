package domain;

import java.time.LocalDate;

import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvDate;

public class ArchivoColaboradores {
 @CsvBindByPosition(position = 0)
    private String tipoDoc;
 @CsvBindByPosition(position = 1)
    private Integer documento;
 @CsvBindByPosition(position = 2)
    private String nombre;
 @CsvBindByPosition(position = 3)
    private String apellido;
 @CsvBindByPosition(position = 4)
    private String mail;
 @CsvBindByPosition(position = 5)
    @CsvDate(value = "dd-mm-yyyy")
    private LocalDate fechaDeColaboracion;
 @CsvBindByPosition(position = 6)
    private String formaDeColaboracion;
 @CsvBindByPosition(position = 7)
    private Integer cantidad;

    // Getters
    public String getTipoDoc() {
        return tipoDoc;
    }

    public Integer getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getMail() {
        return mail;
    }

    public LocalDate getFechaDeColaboracion() {
        return fechaDeColaboracion;
    }

    public String getFormaDeColaboracion() {
        return formaDeColaboracion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    //no son utilizados... los comento
    // Setters

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setFechaDeColaboracion(LocalDate fechaDeColaboracion) {
        this.fechaDeColaboracion = fechaDeColaboracion;
    }

    public void setFormaDeColaboracion(String formaDeColaboracion) {
        this.formaDeColaboracion = formaDeColaboracion;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }


}


package domain;

import java.time.LocalDate;

import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvDate;
import lombok.Getter;
import lombok.Setter;


//consigo los setters y getters
public class ArchivoColaboradores {
 @CsvBindByPosition(position = 0)
    private String tipoDoc;
 @CsvBindByPosition(position = 1)
    private Number documento;
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
    private Number cantidad;

    // Getters
    public String getTipoDoc() {
        return tipoDoc;
    }

    public Number getDocumento() {
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

    public Number getCantidad() {
        return cantidad;
    }

    // Setters
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public void setDocumento(Number documento) {
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

    public void setCantidad(Number cantidad) {
        this.cantidad = cantidad;
    }


}


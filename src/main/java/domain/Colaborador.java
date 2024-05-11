package domain;

import java.time.LocalDate;

public class Colaborador {
    public String nombre;
    public LocalDate fechaDeColaboracion;
    public Colaborador colaborador;


public Colaborador(String nombre, LocalDate fechaDeColaboracion, Colaborador colaborador){
    this.nombre = nombre;
    this.fechaDeColaboracion = fechaDeColaboracion;
    this.colaborador = colaborador;
}

public String getNombre(){
    return  nombre;
}


}

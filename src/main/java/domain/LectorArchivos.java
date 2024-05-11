package domain;

import com.opencsv.bean.CsvToBeanBuilder;

import java.util.ArrayList;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;


public class LectorArchivos {

    String rutaArchivo;
    List<ArchivoColaboradores> lineasArchivo;

    public LectorArchivos(String ruta){
        this.rutaArchivo = ruta;
        this.lineasArchivo = new ArrayList<>();
    }

    public void parsearArchivo(){
        List<ArchivoColaboradores> listaDeColaboradores = null;
        try {
            //acá defino el archivo que se va a leer/cargar
            listaDeColaboradores = new CsvToBeanBuilder(new FileReader(this.rutaArchivo))
                    //con esta implementación se puede skipear la 1era linea del archivo csv
                    .withSkipLines(1)
                    //con esta implementación podemos elegir el caracter que se use para delimitar
                    .withSeparator(';')
                    //super Importante definir el tipo de dato que va a generar el objeto que estamos queriendo parsear a partir del csv
                    .withType(ArchivoColaboradores.class)
                    .build()
                    .parse();
        } catch (IOException e){
            e.printStackTrace();
        }
            this.lineasArchivo = listaDeColaboradores;
    }
    public ArrayList<Usuario> listarUsuarios(){
        boolean usuarioYaCargado = false;
        ArrayList<Usuario> usuarios = new ArrayList<>();

            for (ArchivoColaboradores linearArchivoDeColaboradores : this.lineasArchivo){
                usuarioYaCargado = false;
                Usuario nuevoUsuario = new Usuario(linearArchivoDeColaboradores.getDocumento(),
                        linearArchivoDeColaboradores.getTipoDoc());

                for( Usuario usuarioGuardado : usuarios){
                    if (nuevoUsuario.getDocumento().equals(usuarioGuardado.getDocumento())){
                        usuarioYaCargado = true;
                        break;
                    }
                }
                if (!usuarioYaCargado){
                    usuarios.add(nuevoUsuario);
                }
            }
            return usuarios;
    }


    public ArrayList<Colaborador> listarColaboradores(ArrayList<Usuario> usuarios){
        ArrayList<Colaborador> colaboradores = new ArrayList<>();

        for (ArchivoColaboradores linearArchivoDeColaboradores: this.lineasArchivo){
            Usuario unUsuarioBuscado = Usuario.buscarUsuario(usuarios, linearArchivoDeColaboradores.getDocumento());
            //supongo que el usuario es por documento... el numero
            assert unUsuarioBuscado != null;
            Colaborador unColaborador = new Colaborador(
                    linearArchivoDeColaboradores.getNombre(),
                    linearArchivoDeColaboradores.getFechaDeColaboracion(),
                    unUsuarioBuscado.getColaborador()
                    //revisar esto 'ultimo
            );

            colaboradores.add(unColaborador);
        }
        return  colaboradores;
    }
}

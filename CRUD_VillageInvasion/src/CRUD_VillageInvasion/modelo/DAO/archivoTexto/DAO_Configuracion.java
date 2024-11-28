package CRUD_VillageInvasion.modelo.DAO.archivoTexto;

import java.io.IOException;

import CRUD_VillageInvasion.Principal;
import CRUD_VillageInvasion.modelo.DAO.IDAO_Configuracion;
import CRUD_VillageInvasion.modelo.dataset.Configuracion;

/**
 * Johan David Sánchez Rojas C17305
 * Joshua Chacón Alvarez C4E105
 * Andrew Mora Mejia C05158
 */
public class DAO_Configuracion implements IDAO_Configuracion{
	private Configuracion configuracion = Principal.configuracion;

	WriterManager writer = new WriterManager();
    ReaderManager reader = new ReaderManager();

    public static final String FILE_NAME = "configuracionFile.txt";
	   
    public void cargarDatos(){ // se agregar datos de prueba     
        try {
            reader.open(FILE_NAME);
            reader.readConfiguracion();
            reader.close(); //importante cerrar el archivo

            System.out.println("Lectura exitosa");
        } catch (IOException ex) {
            System.err.println("error de archivo");
            System.err.println("error se cargaron datos de prueba");

            cargarDatosPrueba(); ///SI HAY ERROR Y LA CARGA DEL ARCHIVO FALLA, TENER DATOS DE PRUEBA
            System.err.println(ex.getMessage());
        }
    }

    private void guardarLista(){ // se agregar datos de prueba            
        try {
            writer.open(FILE_NAME);  
            writer.writeAll();
            writer.close(); //importante cerrar el archivo 
            System.out.println("Escritura exitosa");
        } catch (IOException ex) {
            System.err.println("error de archivo");
            System.err.println(ex.getMessage());
        }
    }
	
	public boolean guardar(String tipoEnemigos, int nivel, int cantidadEnemigo1, int cantidadEnemigo2,
			int cantidadEnemigo3, int vidasExtra, double velocidadJuego, String arma, boolean aumentarDificultad) {
		configuracion.setTipoEnemigos(tipoEnemigos);
		configuracion.setNivel(nivel);
		configuracion.setCantidadEnemigo1(cantidadEnemigo1);
		configuracion.setCantidadEnemigo2(cantidadEnemigo2);
		configuracion.setCantidadEnemigo3(cantidadEnemigo3);
		configuracion.setVidasExtra(vidasExtra);
		configuracion.setVelocidadJuego(velocidadJuego);
		configuracion.setArma(arma);
		configuracion.setAumentarDificultad(aumentarDificultad);
		
		
		return true;
	}
	
	public String imprimir() {
		return configuracion.imprimir();
	}
	
	public void cargarDatosPrueba() { // se agregar datos de prueba
		guardar("AAAA", 0, 0, 0, 0, 0, 0, "Arco", false);
	}
}

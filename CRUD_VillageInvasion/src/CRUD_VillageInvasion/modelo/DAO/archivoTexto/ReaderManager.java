package CRUD_VillageInvasion.modelo.DAO.archivoTexto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import CRUD_VillageInvasion.Principal;
import CRUD_VillageInvasion.modelo.Usuario;
import CRUD_VillageInvasion.modelo.dataset.Configuracion;
import CRUD_VillageInvasion.modelo.dataset.ListaUsuarios;

/**
 * Johan David Sánchez Rojas C17305
 * Joshua Chacón Alvarez C4E105
 * Andrew Mora Mejia C05158
 */
public class ReaderManager { // OBJETO LECTOR

    private BufferedReader reader;
    ListaUsuarios listaUsuarios = Principal.lista; 
    Configuracion configuracion = Principal.configuracion;

    public void open(String fileName) throws FileNotFoundException {
        reader = new BufferedReader(new FileReader(fileName));
    }

    public Usuario readUsuario() throws IOException {
        Usuario u = null;
        String line = reader.readLine(); //retorna null cuando no hay más registros
        String datos[];
        if (line != null) {
            u = new Usuario();
            datos = line.split("-"); // separa el String en un array
            u.setNombre(datos[0]); // lee el enunciado
            u.setContraseña(datos[1]);
            u.setNivel(Integer.parseInt(datos[2]));
            u.setPuntaje(Integer.parseInt(datos[3]));
            u.setId(Integer.parseInt(datos[4]));
        }
        return u;
    }
    
    public Configuracion readConfiguracion() throws IOException {
    	Configuracion c = null;
    	String line = reader.readLine();
    	String datos[];
    	if (line != null) {
			c = new Configuracion();
			datos = line.split("-");
			c.setTipoEnemigos(datos[0]);
			c.setNivel(Integer.parseInt(datos[1]));
			c.setCantidadEnemigo1(Integer.parseInt(datos[2]));
			c.setCantidadEnemigo2(Integer.parseInt(datos[3]));
			c.setCantidadEnemigo3(Integer.parseInt(datos[4]));
			c.setNivel(Integer.parseInt(datos[5]));
			c.setVelocidadJuego(Double.parseDouble(datos[6]));
			c.setArma(datos[7]);
			c.setAumentarDificultad(Boolean.parseBoolean(datos[8]));
		}
    	
    	return c;
    }

    public void readAll() throws IOException {
    	Usuario u = readUsuario();
    	while (u != null) {
    		listaUsuarios.agregar(u);
    		u = readUsuario();
    	}
    	
    	Configuracion c = readConfiguracion();
    	while (c != null) {
			c = readConfiguracion();
		}
    }
    
    public void close() throws IOException {
        reader.close();
    }
    
    public String imprimir() {
    	return listaUsuarios.imprimir() + "\n" + configuracion.imprimir();
	}
}

package CRUD_VillageInvasion.modelo.DAO.archivoTexto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import CRUD_VillageInvasion.Principal;
import CRUD_VillageInvasion.modelo.Usuario;
import CRUD_VillageInvasion.modelo.dataset.Configuracion;
import CRUD_VillageInvasion.modelo.dataset.ListaUsuarios;

/**
 * Johan David Sánchez Rojas C17305
 * Joshua Chacón Alvarez C4E105
 * Andrew Mora Mejia C05158
 */
public class WriterManager {

    private BufferedWriter writer;
    ListaUsuarios listaUsuarios = Principal.lista;
    Configuracion configuracion = Principal.configuracion;   

    public void open(String fileName) throws IOException {
        writer = new BufferedWriter(new FileWriter(fileName));
    }

    public void writeUsuario(Usuario u) throws IOException {
        writer.write(u.toFileString() + "\n");
    }
    
    public void writeConfiguracion(Configuracion c) throws IOException {
        writer.write(c.toFileString() + "\n");
    }
    
    public void writeAll() throws IOException {
    	for (int i = 0; i < listaUsuarios.getListaUsuarios().length; i++) {
			Usuario u = listaUsuarios.getElemento(i);
			if (u != null) {
				writeUsuario(u);
			}
		}
    	
    	Configuracion c = configuracion;
    	if (c != null) {
			writeConfiguracion(c);
		}
    }

    public void close() throws IOException {
        writer.close();
    }
}
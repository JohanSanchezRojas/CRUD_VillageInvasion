package CRUD_VillageInvasion.modelo;

/**
 * Joshua Chacón Alvarez C4E105
 */

public class Usuario {
	private String nombre;
	private String contraseña;
	private int nivel;
	private int puntaje;
	private static int id = 0;

	public Usuario(String nombre, String contraseña) {
		this.nombre = nombre;
		this.contraseña = contraseña;
		this.nivel = 0;
		this.puntaje = 0;
		id++;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", contraseña=" + contraseña + ", puntaje=" + puntaje + ", nivel=" + nivel
				+ ", id=" + id + "]";
	}

	public String imprimir() {
		String hilera = "Nombre: " + nombre + ", Puntaje: " + puntaje + "\n";
		return hilera;
	}
}
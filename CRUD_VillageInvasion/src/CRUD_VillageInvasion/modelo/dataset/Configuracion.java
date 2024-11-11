package CRUD_VillageInvasion.modelo.dataset;

/**
 * Johan David Sánchez Rojas C17305
 * Joshua Chacón Alvarez C4E105
 * Andrew Mora Mejia C05158
 */
public class Configuracion {
	private String tipoEnemigos;
	private int nivel;
	private int cantidadEnemigo1;
	private int cantidadEnemigo2;
	private int cantidadEnemigo3;
	private int vidasExtra;
	private double velocidadJuego;
	private String arma;
	private boolean aumentarDificultad;

	public Configuracion(String tipoEnemigos, int nivel, int cantidadEnemigo1, int cantidadEnemigo2,
			int cantidadEnemigo3, int vidasExtra, double velocidadJuego, String arma, boolean aumentarDificultad) {
		this.tipoEnemigos = tipoEnemigos;
		this.nivel = nivel;
		this.cantidadEnemigo1 = cantidadEnemigo1;
		this.cantidadEnemigo2 = cantidadEnemigo2;
		this.cantidadEnemigo3 = cantidadEnemigo3;
		this.vidasExtra = vidasExtra;
		this.velocidadJuego = velocidadJuego;
		this.arma = arma;
		this.aumentarDificultad = aumentarDificultad;
	}

	public Configuracion() {
		this.tipoEnemigos = "";
		this.nivel = 0;
		this.cantidadEnemigo1 = 0;
		this.cantidadEnemigo2 = 0;
		this.cantidadEnemigo3 = 0;
		this.vidasExtra = 0;
		this.velocidadJuego = 0;
		this.arma = "";
		this.aumentarDificultad = false;
	}

	public String getTipoEnemigos() {
		return tipoEnemigos;
	}

	public void setTipoEnemigos(String tipoEnemigos) {
		this.tipoEnemigos = tipoEnemigos;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getCantidadEnemigo1() {
		return cantidadEnemigo1;
	}

	public void setCantidadEnemigo1(int cantidadEnemigo1) {
		this.cantidadEnemigo1 = cantidadEnemigo1;
	}

	public int getCantidadEnemigo2() {
		return cantidadEnemigo2;
	}

	public void setCantidadEnemigo2(int cantidadEnemigo2) {
		this.cantidadEnemigo2 = cantidadEnemigo2;
	}

	public int getCantidadEnemigo3() {
		return cantidadEnemigo3;
	}

	public void setCantidadEnemigo3(int cantidadEnemigo3) {
		this.cantidadEnemigo3 = cantidadEnemigo3;
	}

	public int getVidasExtra() {
		return vidasExtra;
	}

	public void setVidasExtra(int vidasExtra) {
		this.vidasExtra = vidasExtra;
	}

	public double getVelocidadJuego() {
		return velocidadJuego;
	}

	public void setVelocidadJuego(double velocidadJuego) {
		this.velocidadJuego = velocidadJuego;
	}

	public String getArma() {
		return arma;
	}

	public void setArma(String arma) {
		this.arma = arma;
	}

	public boolean isAumentarDificultad() {
		return aumentarDificultad;
	}

	public void setAumentarDificultad(boolean aumentarDificultad) {
		this.aumentarDificultad = aumentarDificultad;
	}

	public String imprimir() {
		return "Tipo de enemigos: " + tipoEnemigos + ", Nivel: " + nivel + ", Cantidad enemigos 1: " + cantidadEnemigo1
				+ ", Cantidad enemigos 2: " + cantidadEnemigo2 + ", Cantidad enemigos 3: " + cantidadEnemigo3
				+ ", Vidas extra: " + vidasExtra + ", Velocidad: " + velocidadJuego + ", Arma: " + arma
				+ ", Aumentar dificultad: " + aumentarDificultad;
	}

	@Override
	public String toString() {
		return "InfoConfiguracion [tipoEnemigos=" + tipoEnemigos + ", nivel=" + nivel + ", cantidadEnemigo1="
				+ cantidadEnemigo1 + ", cantidadEnemigo2=" + cantidadEnemigo2 + ", cantidadEnemigo3=" + cantidadEnemigo3
				+ ", vidasExtra=" + vidasExtra + ", velocidadJuego=" + velocidadJuego + ", arma=" + arma
				+ ", aumentarDificultad=" + aumentarDificultad + "]";
	}

	public String toFileString() {// IMPORTANTE: DEFINIMOS EL FORMATO DE CADA REGISTRO SEPARADO POR -
		return tipoEnemigos + "-" + nivel + "-" + cantidadEnemigo1 + "-" + cantidadEnemigo2 + "-" + cantidadEnemigo3
				+ "-" + vidasExtra + "-" + velocidadJuego + "-" + arma + "-" + aumentarDificultad;
	}
}
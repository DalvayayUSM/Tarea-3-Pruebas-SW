package proyectojUnit;

public class Ubicacion {
	private int piso;
    private int pasillo;
    private int estante;
    private int posX;
    private int posY;
    
	public Ubicacion(int piso, int pasillo, int estante, int posX, int posY) {
		super();
		this.piso = piso;
		this.pasillo = pasillo;
		this.estante = estante;
		this.posX = posX;
		this.posY = posY;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public int getPasillo() {
		return pasillo;
	}

	public void setPasillo(int pasillo) {
		this.pasillo = pasillo;
	}

	public int getEstante() {
		return estante;
	}

	public void setEstante(int estante) {
		this.estante = estante;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
}

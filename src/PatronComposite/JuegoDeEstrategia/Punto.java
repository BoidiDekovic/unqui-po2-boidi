package PatronComposite.JuegoDeEstrategia;

public class Punto {
	private Integer x;
	private Integer y;
	
	public Punto() {
		this.x = 0;
		this.y = 0;
	}

	public Integer getX() {
		return x;
	}


	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	public Punto(Integer x, Integer y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	
}

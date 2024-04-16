package ejemploArrayList.model;

public class Taxi {
	private String matricula;
	private Chofer chofer;
	
	public Taxi() {}

	public Taxi(String matricula, Chofer chofer) {
		this.matricula = matricula;
		this.chofer = chofer;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Chofer getChofer() {
		return chofer;
	}

	public void setChofer(Chofer chofer) {
		this.chofer = chofer;
	}

	@Override
	public String toString() {
		return "Taxi [matricula=" + matricula + ", chofer=" + chofer + "]";
	};
}

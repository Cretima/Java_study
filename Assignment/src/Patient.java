
public class Patient {
	
	private String name;
	private int height = 0;
	private int weight = 0;
	
	
	
	public Patient(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public String getName() {
		return name;	
	}
	
	public double getBMI() {
		return  weight / ((height * 0.01) * (height * 0.01));
	}
	
}

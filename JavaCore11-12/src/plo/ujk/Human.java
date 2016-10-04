package plo.ujk;

public class Human {
	
	private String name;
	private Transport transport;
	
	
	
	
	public Human(String name, Transport transport) {
		super();
		this.name = name;
		this.transport = transport;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Transport getTransport() {
		return transport;
	}
	public void setTransport(Transport transport) {
		this.transport = transport;
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", transport=" + transport + "]";
	}
	
	
}

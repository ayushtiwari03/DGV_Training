package first;

public class Address {
	
	private String city ;
	private String State ;
	private int pin ;
	
	
	public Address(String city, String state, int pin) {
		this.city = city;
		State = state;
		this.pin = pin;
	}
	
	
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", State=" + State + ", pin=" + pin + "]";
	}
	
	

}

public class Car extends Vehicle{
	
	private int numDoors;
	private int numPass;
	
	public Car(String aMake, String aModel, String aPlate, int doors, int pass){
		super(aMake, aModel, aPlate);
		this.numDoors = doors;
		this.numPass = pass;
	}
	
	public int getDoors(){
		return this.numDoors;
	}
	
	public int getPass(){
		return this.numPass;
	}
	
	public String toString(){
		String result = String.format("%d-door %s %s with liscences %s.", this.numDoors, this.numPass, super.getMake(), super.getModel(), super.getPlate()); 
		return result;
	}
	
	@Override
	public boolean equals(Object other){
		if(!(other instanceof Car))
			return false;
		
		Car otherCar = (Car) other;
		
		if(this.numDoors == otherCar.getDoors()){
			if(this.numPass == otherCar.getPass()){
				return super.equals(other);
			}
		}
		return false;
	}
	
	public Car copy(){
		int door = this.getDoors();
		int pass = this.getPass();
		
		Car theCopy = new Car(super.getMake(), super.getModel(), super.getPlate(), door, pass);
		return theCopy;
	}
}
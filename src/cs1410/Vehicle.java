package cs1410;

public class Vehicle {
	protected int tankSize;
	protected double shoppingprobability;
	protected double probabilityOfQ;
	protected double qSpace;
	
	public void Vehicle(){
	}
	
//Set methods------
	public void setProbability(double prob){
		this.shoppingprobability = prob;
	}
	
//Get methods------
	public double getLength(){
		return qSpace;
	}
	public int getTankSize(){
		return this.tankSize;
	}
	public double getProbability(){
		return shoppingprobability;
	}
}

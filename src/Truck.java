
public class Truck extends Car{
	private int weight;
	
	
//	public void setWeight(int weight) {
//		this.weight = weight;
//	}
//
//	public int getWeight() {
//		return weight;
//	}

	public Truck (int Speed,double regularPrice,String color,int weight){
		
		super(Speed,regularPrice,color);
	    this.weight = weight;
	    }
	 
	public double getSalePrice(){
		if(weight >2000){
			return getSalePrice()-(0.1*getSalePrice());
	}
	
	else {
		return getSalePrice()-(0.2*getSalePrice());
	 			}
		}
   }
	


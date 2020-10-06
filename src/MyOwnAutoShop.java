
public class MyOwnAutoShop {
		

	public static void main (String []args) {
		
		Sedan OwnSedan= new Sedan (180,75000.50,"White",10);
		Ford OwnFord1 = new Ford(180,90000,"Red",2020,20);
		Ford OwnFord2 = new Ford(180,80000,"Black",2019,20);
		Car  OwnCar   = new Car(180,60000.50,"White");
		
		System.out.println(OwnSedan.getSalePrice());
		System.out.println(OwnFord1.getSalePrice());
		System.out.println(OwnFord2.getSalePrice());
		System.out.println(OwnCar.getSalePrice());
	}
}

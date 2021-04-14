
public class Main {

public static void main(String[] args) {
		
		Motorcycle d = new Motorcycle();
		d.setBrand();
		d.setModel();
		d.setColor();
		d.setEngine();
		d.setPrice();
		d.setWeight();
		d.setroadtax();
		
		System.out.println("Brand: " + d.getBrand());
		System.out.println("Model: " + d.getModel());
		System.out.println("Color: " + d.getColor());
		System.out.println("Engine: " + d.getEngine()+ "L");
		System.out.println("Prize: RM " + d.getPrice());
		System.out.println("Weight: " + d.getWeight() + "Kg");
		System.out.println("Roadtax: RM " + d.getroadtax());
		System.out.println("Total price: RM " + d.getTotalPrice());
		d.getTotalPrice();
		d.Promotion();
		System.out.println();
		
		Motorcycle e = new Motorcycle();
		e.setBrand();
		e.setModel();
		e.setColor();
		e.setEngine();
		e.setPrice();
		e.setWeight();
		e.setroadtax();
		
		System.out.println("Brand: " + e.getBrand());
		System.out.println("Model: " + e.getModel());
		System.out.println("Color: " + e.getColor());
		System.out.println("Engine: " + e.getEngine());
		System.out.println("Prize: RM " + e.getPrice());
		System.out.println("Weight: " + e.getWeight() + "Kg");
		System.out.println("Roadtax: RM " + e.getroadtax());
		System.out.println("Total price: RM " + e.getTotalPrice());
		e.Promotion();
		System.out.println();
	}
}

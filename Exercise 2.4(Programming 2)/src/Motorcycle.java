import java.util.Scanner;
public class Motorcycle {
	
	Scanner sc=new Scanner(System.in);
	String brand;
	String model;
	String color;
	double weight,price,engine,roadtax,totalprice;
	
	 // Create Setter Method
	  public void setBrand() {
		  System.out.println("Please enter your motorcycle brand?");
		  this.brand = sc.next();
	  }
	  
	  public void setModel() {
		  System.out.println("Please enter your motorcycle model?");
		  this.model = sc.next();
	  }
	  
	  public void setColor() {
		  System.out.println("Please enter your motorcycle colour?");
		  this.color = sc.next();
	  }
	  
	  public void setEngine() {
		  System.out.println("Please enter your size engine of your motorcycle?");
		  this.engine = sc.nextDouble();
	  }
	  
	  public void setWeight() {
		  System.out.println("Please enter your weight of motorcycle?");
		  this.weight = sc.nextDouble();
	  }

	  public void setPrice() {
		  System.out.println("Please enter your prize of motorcycle?");
		  this.price = sc.nextDouble();
	  }
	  
	  public void setroadtax() {
		  System.out.println("Please enter your roadtax?");
		  this.roadtax = sc.nextDouble();
	  }
	  

	  // Create Getter Method
	  public String getBrand() {
		  return this.brand;
	  }
	  
	  public String getModel() {
		  return this.model;
	  }
	  
	  public String getColor() {
	 	  return this.color;
 	  }
	  
	  public double getEngine() {
		  return this.engine;
	  }

	  public double getWeight() {
		  return this.weight;
	  }

	  public double getPrice() {
		  return this.price;
	  }
	  
	  public double getroadtax() {
		  return this.roadtax;
	  }
	  
	  public double getTotalPrice() {
		  this.totalprice=this.roadtax+this.price;
		  return this.totalprice;
	  }
	  
	  public void Promotion() {
		System.out.println("If you buy this motor, you will get free helmet");
	}
}

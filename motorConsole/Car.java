package motorConsole;
//Car class Lab 12

public class Car{
   private String make;
   private String model;
   private int year;
   private double price;
   
   public Car(){
      make = "N/A";
      model = "N/A";
      year = 00;
      price  = 0.0;
   }//end blank constructor
   
   public Car(String make, String model, int year, double price){
      this.make = make;
      this.model = model;
      this.year = year;
      this.price = price;
   }//end constructor
   
   public String getMake(){
      return make;
   }//end getMake
   
   public void setMake(String make){
      this.make = make;
   }//end setMake
   
   public String getModel(){
      return model;
   }//end getModel
   
   public void setModel(String model){
      this.model = model;
   }//end setModel
   
   public int getYear(){
      return year;
   }//end getYear
   
   public void setYear(int year){
      this.year = year;
   }//end setYear
   
   public double getPrice(){
      return price;
   }//end getPrice
   
   public void setPrice(double price){
      this.price = price;
   }//end setPrice
   
   public String toString(){
      return String.format("%-10s %-10s %-7d $%,.2f", make, model, year, price);
   }//end toString
}//end Car
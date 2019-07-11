package motorConsole;

//Lab12 part2

public class UsedCar extends Car{
   private double milage;
   
   public UsedCar(String make, String model, int year, double price, double milage){
      super.setMake(make);
      super.setModel(model);
      super.setYear(year);
      super.setPrice(price);
      this.milage = milage;
   }//end constructor
   
   public double getMilage(){
      return milage;
   }//end getMilage
   
   public void setMilage(double milage){
      this.milage = milage;
   }//end setMilage
   
   @Override
   public String toString(){
      return super.toString() + String.format("(Used) %,.1f", milage) + " miles";
   }//end toString
}//end UsedCar
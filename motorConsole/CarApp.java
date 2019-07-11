package motorConsole;

//Lab12

import java.util.*;

public class CarApp{
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      int userCars;
      String carMake;
      String carModel;
      int carYear;
      double carPrice;
      List<Car> cars = new ArrayList<Car>();
      
      System.out.println("Welcome to the Gran Circus Motors admin console!");
      System.out.print("How many cars are you entering? (enter 0 to exit) "); 
      userCars = scan.nextInt();
      
      int counter = 1;
      while(counter<=userCars){
         System.out.print("Enter Car#" + counter + " Make: ");
         carMake = scan.next();
         scan.nextLine();
         System.out.print("Enter Car#" + counter + " Model: ");
         carModel = scan.nextLine();
         System.out.print("Enter Car#" + counter + " Year: ");
         carYear = scan.nextInt();
         System.out.print("Enter Car#" + counter + " Price: ");
         carPrice = scan.nextDouble();
         System.out.println();
         cars.add(new Car(carMake, carModel, carYear, carPrice));
         counter++;
      }//end while
      
      if(userCars==0){
         System.out.println("No cars stored.");
      }//end if
      else{
         System.out.println("Current Inventory:");
         for(int i=0; i<cars.size(); i++){
            System.out.println(cars.get(i).toString());
         }//end for
      }//end else
      scan.close();
   }//end main
}//end CarApp
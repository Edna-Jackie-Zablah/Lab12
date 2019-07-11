package motorConsole;
//Lab12

import java.util.*;

public class CarApp2{
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      int userChoice;
      String userBuy;
      List<Car> cars = new ArrayList<Car>();
      cars.add(new Car("Nikolai", "Model S", 2017, 54999.90));
      cars.add(new Car("Fourd", "Escapade", 2017, 31999.90));
      cars.add(new Car("Chewie", "Vette", 2017, 44989.95));
      cars.add(new UsedCar("Hyonda", "Prior", 2015, 14795.50, 35987.6));
      cars.add(new UsedCar("GC", "Chirpus", 2013, 8500.00, 12345));
      cars.add(new UsedCar("GC", "Whitherell", 2016, 14450, 3500.3)); 
      
      do{     
         for(int i=1; i<=cars.size(); i++){
            System.out.println(i + ". " + cars.get(i-1).toString());
         }//end for
         System.out.println((cars.size()+1) + ". Quit");
   
         System.out.print("\nWhich car would you like? ");
         userChoice = scan.nextInt();
         try{
            System.out.println(cars.get(userChoice-1));
            System.out.print("Would you like to buy this car? ");
            userBuy = scan.next();
            if(userBuy.equals("y") || userBuy.equals("Y")){
               cars.remove(userChoice-1);
               System.out.println("Excellent! Our finance department will be in touch shortly.\n");
               userChoice=0;
            }//end if
         }//end try
         catch(IndexOutOfBoundsException e){}//end catch
      }//end do
      while(userChoice!=(cars.size()+1));
      
      System.out.println("Have a great day!");
      scan.close();
   }//end main
}//end CarApp
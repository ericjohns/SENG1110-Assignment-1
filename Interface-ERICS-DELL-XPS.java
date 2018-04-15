
/**
 * Write a description of class Interface here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class Interface
{
         
    
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        MovieDatabase md = new MovieDatabase();
        String Mname, Dname, number, name="a";
        
        showSelection();
        
        while(choice != 9)                                    //Step 6
        {
            switch(choice)                                    //Step 6a
             {
             case 1: sellProduct
                     break;
             case 2: sellProduct
                     break;
             case 3: sellProduct;
                     break;
             case 4: sellProduct;
                     break;
             default: System.out.println("Invalid Selection");
             }//end switch

            showSelection();                                  //Step 6b
             choice = console.nextInt();			//Step 6c
        }//end while
        
        
        System.out.println("Enter movie name");
        Mname = console.next();
        System.out.println("Enter directors name");
        Dname = console.next();
        md.addData(1, Mname, Dname , 1.2, 2.2);
        
        System.out.println("name="+md.M1getName());
      
        
        
        
    }
    
    public static void showSelection()
    {
          System.out.println("*** Welcome tothe Movie Database ***");
          System.out.println("To select an item, enter ");
          System.out.println("1 for enter new movie to database");
          System.out.println("2 for deleting a movie from database");
          System.out.println("3 for listing movies in database");
          System.out.println("4 for listing the stored playlists");
          System.out.println("5 for listing the movies in a specific playlist");
          System.out.println("6 for listing movies made by the same director");
          System.out.println("7 for listing the stored playlists");
          System.out.println("9 to exit");
    }//end showSelection
}

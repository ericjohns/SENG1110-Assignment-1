
/**
 * Write a description of class MovieDatabase here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MovieDatabase
{
  public class MovieDatabase()
  {
      Movie M1 = new Movie();
      Movie M2 = new Movie();
      Movie M3 = new Movie();
      Movie M4 = new Movie();
    }

  public void addData(int option, String newName, String newDirector, double newFilesize, double newDuration)
  {
      if (option==1) setData(M1, newName, newDirector, newFilesize, newDuration);
      if (option==2) setData(M3, newName, newDirector, newFilesize, newDuration);
      if (option==3) setData(M3, newName, newDirector, newFilesize, newDuration);
      if (option==4) setData(M3, newName, newDirector, newFilesize, newDuration);
  }
   
  
  public void setData(Movie m, String name, String director, Double filesize, double duration)
  {
      m.setName(name);
  }
  
  public String getData1(Movie m)
  {
      return m.getName();
  }
  
}

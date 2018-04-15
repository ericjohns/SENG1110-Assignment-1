
/**
 * Write a description of class MovieDatabase here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MovieDatabase
{
  private Movie M1, M2, M3, M4;

    
  public MovieDatabase()
  {
      M1 = new Movie();
      M2 = new Movie();
      M3 = new Movie();
      M4 = new Movie();
  }

  public void addData(int option, String newName, String newDirector, double newFilesize, double newDuration)
  {
      if (option==1) setData(M1, newName, newDirector, newFilesize, newDuration);
      if (option==2) setData(M2, newName, newDirector, newFilesize, newDuration);
      if (option==3) setData(M3, newName, newDirector, newFilesize, newDuration);
      if (option==4) setData(M4, newName, newDirector, newFilesize, newDuration);
  }
   
  
  private void setData(Movie m, String name, String director, double filesize, double duration)
  {
      m.setName(name);
      m.setDirector(director);
      m.setFilesize(filesize);
      m.setDuration(duration);
  }
  

  public String M1getName()
  {
    return M1.getName();
  }    
  
  public String M2getName()
  {
    return M2.getName();
  }   
  
  public String M3getName()
  {
    return M3.getName();
  }   
  
  public String M4getName()
  {
    return M4.getName();
  }   
  
  public String M1getDirector()
  {
    return M1.getDirector();
  }    
  
  public String M2getDirector()
  {
    return M2.getDirector();
  }   
  
  public String M3getDirector()
  {
    return M3.getDirector();
  }   
  
  public String M4getDirector()
  {
    return M4.getDirector();
  }
  
    public double M1getDuration()
  {
    return M1.getDuration();
  }  
  
    public double M2getDuration()
  {
    return M2.getDuration();
  }  
  
    public double M3getDuration()
  {
    return M3.getDuration();
  }  
  
    public double M4getDuration()
  {
    return M4.getDuration();
  }  
}

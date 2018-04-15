
/**
 * Write a description of class Movie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Movie
{
    // instance variables - replace the example below with your own
    private String name;
    private String director;
    private double filesize;
    private double duration;
    
    public Movie()
    {
        name = "";
        director = "";
        filesize = 0;
        duration = 0;
    }
    
    public Movie(String newName, String newDirector, double newFilesize, double newDuration)
    {
        name = newName;
        director = newDirector;
        filesize = newFilesize;
        duration = newDuration;
    }
    
    
    public void setName (String newName)
    {
        name = newName;
    }

    public String getName ()
    {
        return name;
    }
         
    public void setDirector (String newDirector)
    {
        director = newDirector;
    }

    public String getDirector ()
    {
        return director;
    }
    
    public void setFilesize (double newFilesize)
    {
        filesize = newFilesize;
    }
    
    public double getFilesize ()
    {
        return filesize;
    }
        
    public void setDuration (double newDuration)
    {
        duration = newDuration;
    }
    
    public double getDuration ()
    {
        return duration;
    }
   
}

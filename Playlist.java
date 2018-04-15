
/**
 * Write a description of class Playlist here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Playlist
{
    private int Movie1;
    private int Movie2;
    private int Movie3;
    private double totalDuration;
    private double totalSize;
    
    public Playlist()
    {
        Movie1 = 0;
        Movie2 = 0;
        Movie3 = 0;
        totalDuration = 0;
        totalSize = 0;
    }
    
    public Playlist(int newMovie1, int newMovie2, int newMovie3, double newtotalDuration, double newtotalSize)
    {
        Movie1 = newMovie1;
        Movie2 = newMovie2;
        Movie3 = newMovie3;
        totalDuration = newtotalDuration;
        totalSize = newtotalSize;
    }
    
       
    public void setMovie1 (int newMovie1)
    {
        Movie1 = newMovie1;
    }
    
    public int getMovie1 ()
    {
        return Movie1;
    }
    
        public void setMovie2 (int newMovie2)
    {
        Movie2 = newMovie2;
    }
    
    public int getMovie2 ()
    {
        return Movie2;
    }
    
    public void setMovie3 (int newMovie3)
    {
        Movie3 = newMovie3;
    }
    
    public int getMovie3 ()
    {
        return Movie3;
    }
    
    public void settotalDuration(double newtotalDuration)
    {   
        totalDuration = newtotalDuration;
    }
    
    public double gettotalDuration()
    {
        return totalDuration;
    }
    
    public void settotalSize (double newtotalSize)
    {
        totalSize = newtotalSize;
    }
    
    public double gettotalSize()
    {
        return totalSize;
    }
}

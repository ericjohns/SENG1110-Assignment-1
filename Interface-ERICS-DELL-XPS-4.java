
/**
 * Write a description of class Interface here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.util.InputMismatchException;

public class Interface
{
         
    
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        MovieDatabase md = new MovieDatabase();
        Playlist P1 = new Playlist();
        Playlist P2 = new Playlist();
        String Mname, Dname, MnameCheck1, MnameCheck2, MnameCheck3, MnameCheck4; 
        String DnameCheck1, DnameCheck2, DnameCheck3, DnameCheck4;
        double FSname=0 , DURname=0;
        double DurationCheck1, DurationCheck2, DurationCheck3, DurationCheck4;
        int choice=0, Movie1=0, Movie2=0, Movie3=0, Movie4=0, delete=0, playlistSelection=0, playlist1=0, playlist2=0, getPlaylistMovie=0, movDelete=0, playlistMove=0;
        boolean valid= true;
        
        
        showSelection();
        /*
        if (console.hasNextInt())
        {
            console = console.nextInt();
        } 
        else
        {
            console.nextLine();
            System.out.println("Error, Please enter an integer");
            continue;
        }*/
        
        /*
        try
        {
            choice = console.nextInt();
        }
        catch (InputMismatchException e)
        {
            console.next();
            System.out.println("Error, Please enter an Integer");
            continue;
        }*/
        do{
            if(console.hasNextInt())
            {
                choice = console.nextInt();
                valid = true;
            }
            else
            {
                console.nextLine();
                valid = false;
                System.out.println("Enter a valid Integer Value");
            }
        }while(!valid);
        
        while(choice != 9)                                    
        {
            switch(choice)                                    
             {
             case 1: 
                    if(Movie1 == 1 & Movie2 == 1 & Movie3 == 1 & Movie4 == 1)
                    {
                        System.out.println("Database is Full");
                    }
                    else 
                    {
                        if (Movie1 == 0 & Movie2 == 0 & Movie3 == 0 & Movie4 == 0)
                        {
                            System.out.println("Enter movie name");
                            Mname = console.next();
                            System.out.println("Enter directors name");
                            Dname = console.next();
                            System.out.println("Enter FileSize");
                            //FSname = console.nextDouble();
                            do{
                                if(console.hasNextDouble())
                                {
                                    FSname = console.nextDouble();
                                    valid = true;
                                }
                                else
                                {
                                    console.nextLine();
                                    valid = false;
                                    System.out.println("Enter a valid Value");
                                }
                            }while(!valid);
                            System.out.println("Enter Duration");
                            //DURname = console.nextDouble();
                            do{
                                if(console.hasNextDouble())
                                {
                                    DURname = console.nextDouble();
                                    valid = true;
                                }
                                else
                                {
                                    console.nextLine();
                                    valid = false;
                                    System.out.println("Enter a valid Value");
                                }
                            }while(!valid);
                            MnameCheck1 = md.M1getName();
                            MnameCheck2 = md.M2getName();
                            MnameCheck3 = md.M3getName();
                            MnameCheck4 = md.M4getName();
                            MnameCheck1 = MnameCheck1.toLowerCase();
                            MnameCheck2 = MnameCheck2.toLowerCase();
                            MnameCheck3 = MnameCheck3.toLowerCase();
                            MnameCheck4 = MnameCheck4.toLowerCase();
                            Mname = Mname.toLowerCase();
                            DnameCheck1 = md.M1getDirector();
                            DnameCheck2 = md.M2getDirector();
                            DnameCheck3 = md.M3getDirector();
                            DnameCheck4 = md.M4getDirector();
                            DnameCheck1= DnameCheck1.toLowerCase();
                            DnameCheck2= DnameCheck2.toLowerCase();
                            DnameCheck3= DnameCheck3.toLowerCase();
                            DnameCheck4= DnameCheck4.toLowerCase();
                            Dname = Dname.toLowerCase();
                            DurationCheck1 = md.M1getDuration();
                            DurationCheck2 = md.M2getDuration();
                            DurationCheck3 = md.M3getDuration();
                            DurationCheck4 = md.M4getDuration();
                            if((Objects.equals(Mname, MnameCheck1))|(Objects.equals(Mname, MnameCheck2))|(Objects.equals(Mname, MnameCheck3))|(Objects.equals(Mname, MnameCheck4)))
                            {
                                if((Objects.equals(Dname, DnameCheck1))|(Objects.equals(Dname, DnameCheck2))|(Objects.equals(Dname, DnameCheck3))|(Objects.equals(Dname, DnameCheck4)))
                                {
                                    if((Objects.equals(DURname, DurationCheck1))|(Objects.equals(DURname, DurationCheck2))|(Objects.equals(DURname, DurationCheck3))|(Objects.equals(DURname, DurationCheck4)))
                                    {
                                        System.out.println("Duplicate Movie in Database");
                                    }
                                    else
                                    {
                                        md.addData(1, Mname, Dname , FSname, DURname);
                                        Movie1 = 1;
                                    }
                                }
                                else
                                {
                                    md.addData(1, Mname, Dname , FSname, DURname);
                                    Movie1 = 1;
                                }
                            }
                            else
                            {
                                md.addData(1, Mname, Dname , FSname, DURname);
                                Movie1 = 1;
                            }
                        }
                       
                        else if (Movie1 == 1 & Movie2 == 0 & Movie3 == 0 & Movie4 == 0)
                        {
                            System.out.println("Enter movie2 name");
                            Mname = console.next();
                            System.out.println("Enter directors name");
                            Dname = console.next();
                            System.out.println("Enter FileSize");
                            do{
                                if(console.hasNextDouble())
                                {
                                    FSname = console.nextDouble();
                                    valid = true;
                                }
                                else
                                {
                                    console.nextLine();
                                    valid = false;
                                    System.out.println("Enter a valid Value");
                                }
                            }while(!valid);
                            System.out.println("Enter Duration");
                            //DURname = console.nextDouble();
                            do{
                                if(console.hasNextDouble())
                                {
                                    DURname = console.nextDouble();
                                    valid = true;
                                }
                                else
                                {
                                    console.nextLine();
                                    valid = false;
                                    System.out.println("Enter a valid Value");
                                }
                            }while(!valid);
                            MnameCheck1 = md.M1getName();
                            MnameCheck2 = md.M2getName();
                            MnameCheck3 = md.M3getName();
                            MnameCheck4 = md.M4getName();
                            MnameCheck1 = MnameCheck1.toLowerCase();
                            MnameCheck2 = MnameCheck2.toLowerCase();
                            MnameCheck3 = MnameCheck3.toLowerCase();
                            MnameCheck4 = MnameCheck4.toLowerCase();
                            Mname = Mname.toLowerCase();
                            DnameCheck1 = md.M1getDirector();
                            DnameCheck2 = md.M2getDirector();
                            DnameCheck3 = md.M3getDirector();
                            DnameCheck4 = md.M4getDirector();
                            DnameCheck1= DnameCheck1.toLowerCase();
                            DnameCheck2= DnameCheck2.toLowerCase();
                            DnameCheck3= DnameCheck3.toLowerCase();
                            DnameCheck4= DnameCheck4.toLowerCase();
                            Dname = Dname.toLowerCase();
                            DurationCheck1 = md.M1getDuration();
                            DurationCheck2 = md.M2getDuration();
                            DurationCheck3 = md.M3getDuration();
                            DurationCheck4 = md.M4getDuration();
                            if((Objects.equals(Mname, MnameCheck1))|(Objects.equals(Mname, MnameCheck2))|(Objects.equals(Mname, MnameCheck3))|(Objects.equals(Mname, MnameCheck4)))
                            {
                                if((Objects.equals(Dname, DnameCheck1))|(Objects.equals(Dname, DnameCheck2))|(Objects.equals(Dname, DnameCheck3))|(Objects.equals(Dname, DnameCheck4)))
                                {
                                    if((Objects.equals(DURname, DurationCheck1))|(Objects.equals(DURname, DurationCheck2))|(Objects.equals(DURname, DurationCheck3))|(Objects.equals(DURname, DurationCheck4)))
                                    {
                                        System.out.println("Duplicate Movie in Database");
                                    }
                                    else
                                    {
                                        md.addData(2, Mname, Dname , FSname, DURname);
                                        Movie2 = 1;
                                    }
                                }
                                else
                                {
                                    md.addData(2, Mname, Dname , FSname, DURname);
                                    Movie2 = 1;
                                }
                            }
                            else
                            {
                                md.addData(2, Mname, Dname , FSname, DURname);
                                Movie2 = 1;
                            }    
                        }
                        else if (Movie1 == 1 & Movie2 == 1 & Movie3 == 0 & Movie4 == 0)
                        {
                            System.out.println("Enter movie3 name");
                            Mname = console.next();
                            System.out.println("Enter directors name");
                            Dname = console.next();
                            System.out.println("Enter FileSize");
                            do{
                                if(console.hasNextDouble())
                                {
                                    FSname = console.nextDouble();
                                    valid = true;
                                }
                                else
                                {
                                    console.nextLine();
                                    valid = false;
                                    System.out.println("Enter a valid Value");
                                }
                            }while(!valid);
                            System.out.println("Enter Duration");
                            //DURname = console.nextDouble();
                            do{
                                if(console.hasNextDouble())
                                {
                                    DURname = console.nextDouble();
                                    valid = true;
                                }
                                else
                                {
                                    console.nextLine();
                                    valid = false;
                                    System.out.println("Enter a valid Value");
                                }
                            }while(!valid);
                            MnameCheck1 = md.M1getName();
                            MnameCheck2 = md.M2getName();
                            MnameCheck3 = md.M3getName();
                            MnameCheck4 = md.M4getName();
                            MnameCheck1 = MnameCheck1.toLowerCase();
                            MnameCheck2 = MnameCheck2.toLowerCase();
                            MnameCheck3 = MnameCheck3.toLowerCase();
                            MnameCheck4 = MnameCheck4.toLowerCase();
                            Mname = Mname.toLowerCase();
                            DnameCheck1 = md.M1getDirector();
                            DnameCheck2 = md.M2getDirector();
                            DnameCheck3 = md.M3getDirector();
                            DnameCheck4 = md.M4getDirector();
                            DnameCheck1= DnameCheck1.toLowerCase();
                            DnameCheck2= DnameCheck2.toLowerCase();
                            DnameCheck3= DnameCheck3.toLowerCase();
                            DnameCheck4= DnameCheck4.toLowerCase();
                            Dname = Dname.toLowerCase();
                            DurationCheck1 = md.M1getDuration();
                            DurationCheck2 = md.M2getDuration();
                            DurationCheck3 = md.M3getDuration();
                            DurationCheck4 = md.M4getDuration();
                            if((Objects.equals(Mname, MnameCheck1))|(Objects.equals(Mname, MnameCheck2))|(Objects.equals(Mname, MnameCheck3))|(Objects.equals(Mname, MnameCheck4)))
                            {
                                if((Objects.equals(Dname, DnameCheck1))|(Objects.equals(Dname, DnameCheck2))|(Objects.equals(Dname, DnameCheck3))|(Objects.equals(Dname, DnameCheck4)))
                                {
                                    if((Objects.equals(DURname, DurationCheck1))|(Objects.equals(DURname, DurationCheck2))|(Objects.equals(DURname, DurationCheck3))|(Objects.equals(DURname, DurationCheck4)))
                                    {
                                        System.out.println("Duplicate Movie in Database");
                                    }
                                    else
                                    {
                                        md.addData(3, Mname, Dname , FSname, DURname);
                                        Movie3 = 1;
                                    }
                                }
                                else
                                {
                                    md.addData(3, Mname, Dname , FSname, DURname);
                                    Movie3 = 1;
                                }
                            }
                            else
                            {
                                md.addData(3, Mname, Dname , FSname, DURname);
                                Movie3 = 1;
                            }
                        }
                        else if (Movie1 == 1 & Movie2 == 1 & Movie3 == 1 & Movie4 == 0)
                        {
                            System.out.println("Enter movie4 name");
                            Mname = console.next();
                            System.out.println("Enter directors name");
                            Dname = console.next();
                            System.out.println("Enter FileSize");
                            do{
                                if(console.hasNextDouble())
                                {
                                    FSname = console.nextDouble();
                                    valid = true;
                                }
                                else
                                {
                                    console.nextLine();
                                    valid = false;
                                    System.out.println("Enter a valid Value");
                                }
                            }while(!valid);
                            System.out.println("Enter Duration");
                            //DURname = console.nextDouble();
                            do{
                                if(console.hasNextDouble())
                                {
                                    DURname = console.nextDouble();
                                    valid = true;
                                }
                                else
                                {
                                    console.nextLine();
                                    valid = false;
                                    System.out.println("Enter a valid Value");
                                }
                            }while(!valid);
                            MnameCheck1 = md.M1getName();
                            MnameCheck2 = md.M2getName();
                            MnameCheck3 = md.M3getName();
                            MnameCheck4 = md.M4getName();
                            MnameCheck1 = MnameCheck1.toLowerCase();
                            MnameCheck2 = MnameCheck2.toLowerCase();
                            MnameCheck3 = MnameCheck3.toLowerCase();
                            MnameCheck4 = MnameCheck4.toLowerCase();
                            Mname = Mname.toLowerCase();
                            DnameCheck1 = md.M1getDirector();
                            DnameCheck2 = md.M2getDirector();
                            DnameCheck3 = md.M3getDirector();
                            DnameCheck4 = md.M4getDirector();
                            DnameCheck1= DnameCheck1.toLowerCase();
                            DnameCheck2= DnameCheck2.toLowerCase();
                            DnameCheck3= DnameCheck3.toLowerCase();
                            DnameCheck4= DnameCheck4.toLowerCase();
                            Dname = Dname.toLowerCase();
                            DurationCheck1 = md.M1getDuration();
                            DurationCheck2 = md.M2getDuration();
                            DurationCheck3 = md.M3getDuration();
                            DurationCheck4 = md.M4getDuration();
                            if((Objects.equals(Mname, MnameCheck1))|(Objects.equals(Mname, MnameCheck2))|(Objects.equals(Mname, MnameCheck3))|(Objects.equals(Mname, MnameCheck4)))
                            {
                                if((Objects.equals(Dname, DnameCheck1))|(Objects.equals(Dname, DnameCheck2))|(Objects.equals(Dname, DnameCheck3))|(Objects.equals(Dname, DnameCheck4)))
                                {
                                    if((Objects.equals(DURname, DurationCheck1))|(Objects.equals(DURname, DurationCheck2))|(Objects.equals(DURname, DurationCheck3))|(Objects.equals(DURname, DurationCheck4)))
                                    {
                                        System.out.println("Duplicate Movie in Database");
                                    }
                                    else
                                    {
                                        md.addData(4, Mname, Dname , FSname, DURname);
                                        Movie4 = 1;
                                    }
                                }
                                else
                                {
                                    md.addData(4, Mname, Dname , FSname, DURname);
                                    Movie4 = 1;
                                }
                            }
                            else
                            {
                                md.addData(4, Mname, Dname , FSname, DURname);
                                Movie4 = 1;
                            }
                        }
                        else if (Movie1 == 0 & Movie2 == 1 & Movie3 == 1 & Movie4 == 1)
                        {
                            System.out.println("Enter movie name");
                            Mname = console.next();
                            System.out.println("Enter directors name");
                            Dname = console.next();
                            System.out.println("Enter FileSize");
                            FSname = console.nextDouble();
                            System.out.println("Enter Duration");
                            DURname = console.nextDouble();
                                MnameCheck1 = md.M1getName();
                            MnameCheck1 = md.M1getName();
                            MnameCheck2 = md.M2getName();
                            MnameCheck3 = md.M3getName();
                            MnameCheck4 = md.M4getName();
                            MnameCheck1 = MnameCheck1.toLowerCase();
                            MnameCheck2 = MnameCheck2.toLowerCase();
                            MnameCheck3 = MnameCheck3.toLowerCase();
                            MnameCheck4 = MnameCheck4.toLowerCase();
                            Mname = Mname.toLowerCase();
                            DnameCheck1 = md.M1getDirector();
                            DnameCheck2 = md.M2getDirector();
                            DnameCheck3 = md.M3getDirector();
                            DnameCheck4 = md.M4getDirector();
                            DnameCheck1= DnameCheck1.toLowerCase();
                            DnameCheck2= DnameCheck2.toLowerCase();
                            DnameCheck3= DnameCheck3.toLowerCase();
                            DnameCheck4= DnameCheck4.toLowerCase();
                            Dname = Dname.toLowerCase();
                            DurationCheck1 = md.M1getDuration();
                            DurationCheck2 = md.M2getDuration();
                            DurationCheck3 = md.M3getDuration();
                            DurationCheck4 = md.M4getDuration();
                            if((Objects.equals(Mname, MnameCheck1))|(Objects.equals(Mname, MnameCheck2))|(Objects.equals(Mname, MnameCheck3))|(Objects.equals(Mname, MnameCheck4)))
                            {
                                if((Objects.equals(Dname, DnameCheck1))|(Objects.equals(Dname, DnameCheck2))|(Objects.equals(Dname, DnameCheck3))|(Objects.equals(Dname, DnameCheck4)))
                                {
                                    if((Objects.equals(DURname, DurationCheck1))|(Objects.equals(DURname, DurationCheck2))|(Objects.equals(DURname, DurationCheck3))|(Objects.equals(DURname, DurationCheck4)))
                                    {
                                        System.out.println("Duplicate Movie in Database");
                                    }
                                    else
                                    {
                                        md.addData(1, Mname, Dname , FSname, DURname);
                                        Movie1 = 1;
                                    }
                                }
                                else
                                {
                                    md.addData(1, Mname, Dname , FSname, DURname);
                                    Movie1 = 1;
                                }
                            }
                            else
                            {
                            md.addData(1, Mname, Dname , FSname, DURname);
                            Movie1 = 1;
                            }
                        }
                        else if (Movie1 == 1 & Movie2 == 0 & Movie3 == 1 & Movie4 == 1)
                        {
                            System.out.println("Enter movie name");
                            Mname = console.next();
                            System.out.println("Enter directors name");
                            Dname = console.next();
                            System.out.println("Enter FileSize");
                            do{
                                if(console.hasNextDouble())
                                {
                                    FSname = console.nextDouble();
                                    valid = true;
                                }
                                else
                                {
                                    console.nextLine();
                                    valid = false;
                                    System.out.println("Enter a valid Value");
                                }
                            }while(!valid);
                            System.out.println("Enter Duration");
                            //DURname = console.nextDouble();
                            do{
                                if(console.hasNextDouble())
                                {
                                    DURname = console.nextDouble();
                                    valid = true;
                                }
                                else
                                {
                                    console.nextLine();
                                    valid = false;
                                    System.out.println("Enter a valid Value");
                                }
                            }while(!valid);
                            MnameCheck1 = md.M1getName();
                            MnameCheck2 = md.M2getName();
                            MnameCheck3 = md.M3getName();
                            MnameCheck4 = md.M4getName();
                            MnameCheck1 = MnameCheck1.toLowerCase();
                            MnameCheck2 = MnameCheck2.toLowerCase();
                            MnameCheck3 = MnameCheck3.toLowerCase();
                            MnameCheck4 = MnameCheck4.toLowerCase();
                            Mname = Mname.toLowerCase();
                            DnameCheck1 = md.M1getDirector();
                            DnameCheck2 = md.M2getDirector();
                            DnameCheck3 = md.M3getDirector();
                            DnameCheck4 = md.M4getDirector();
                            DnameCheck1= DnameCheck1.toLowerCase();
                            DnameCheck2= DnameCheck2.toLowerCase();
                            DnameCheck3= DnameCheck3.toLowerCase();
                            DnameCheck4= DnameCheck4.toLowerCase();
                            Dname = Dname.toLowerCase();
                            DurationCheck1 = md.M1getDuration();
                            DurationCheck2 = md.M2getDuration();
                            DurationCheck3 = md.M3getDuration();
                            DurationCheck4 = md.M4getDuration();
                            if((Objects.equals(Mname, MnameCheck1))|(Objects.equals(Mname, MnameCheck2))|(Objects.equals(Mname, MnameCheck3))|(Objects.equals(Mname, MnameCheck4)))
                            {
                                if((Objects.equals(Dname, DnameCheck1))|(Objects.equals(Dname, DnameCheck2))|(Objects.equals(Dname, DnameCheck3))|(Objects.equals(Dname, DnameCheck4)))
                                {
                                    if((Objects.equals(DURname, DurationCheck1))|(Objects.equals(DURname, DurationCheck2))|(Objects.equals(DURname, DurationCheck3))|(Objects.equals(DURname, DurationCheck4)))
                                    {
                                        System.out.println("Duplicate Movie in Database");
                                    }
                                    else
                                    {
                                        md.addData(2, Mname, Dname , FSname, DURname);
                                        Movie2 = 1;
                                    }
                                }
                                else
                                {
                                    md.addData(2, Mname, Dname , FSname, DURname);
                                    Movie2 = 1;
                                }
                            }
                            else
                            {
                                md.addData(2, Mname, Dname , FSname, DURname);
                                Movie2 = 1;
                            }
                        }
                        else if (Movie1 == 1 & Movie2 == 1 & Movie3 == 0 & Movie4 == 1)
                        {
                            System.out.println("Enter movie name");
                            Mname = console.next();
                            System.out.println("Enter directors name");
                            Dname = console.next();
                            System.out.println("Enter FileSize");
                            do{
                                if(console.hasNextDouble())
                                {
                                    FSname = console.nextDouble();
                                    valid = true;
                                }
                                else
                                {
                                    console.nextLine();
                                    valid = false;
                                    System.out.println("Enter a valid Value");
                                }
                            }while(!valid);
                            System.out.println("Enter Duration");
                            //DURname = console.nextDouble();
                            do{
                                if(console.hasNextDouble())
                                {
                                    DURname = console.nextDouble();
                                    valid = true;
                                }
                                else
                                {
                                    console.nextLine();
                                    valid = false;
                                    System.out.println("Enter a valid Value");
                                }
                            }while(!valid);
                            MnameCheck1 = md.M1getName();
                            MnameCheck2 = md.M2getName();
                            MnameCheck3 = md.M3getName();
                            MnameCheck4 = md.M4getName();
                            MnameCheck1 = MnameCheck1.toLowerCase();
                            MnameCheck2 = MnameCheck2.toLowerCase();
                            MnameCheck3 = MnameCheck3.toLowerCase();
                            MnameCheck4 = MnameCheck4.toLowerCase();
                            Mname = Mname.toLowerCase();
                            DnameCheck1 = md.M1getDirector();
                            DnameCheck2 = md.M2getDirector();
                            DnameCheck3 = md.M3getDirector();
                            DnameCheck4 = md.M4getDirector();
                            DnameCheck1= DnameCheck1.toLowerCase();
                            DnameCheck2= DnameCheck2.toLowerCase();
                            DnameCheck3= DnameCheck3.toLowerCase();
                            DnameCheck4= DnameCheck4.toLowerCase();
                            Dname = Dname.toLowerCase();
                            DurationCheck1 = md.M1getDuration();
                            DurationCheck2 = md.M2getDuration();
                            DurationCheck3 = md.M3getDuration();
                            DurationCheck4 = md.M4getDuration();
                            if((Objects.equals(Mname, MnameCheck1))|(Objects.equals(Mname, MnameCheck2))|(Objects.equals(Mname, MnameCheck3))|(Objects.equals(Mname, MnameCheck4)))
                            {
                                if((Objects.equals(Dname, DnameCheck1))|(Objects.equals(Dname, DnameCheck2))|(Objects.equals(Dname, DnameCheck3))|(Objects.equals(Dname, DnameCheck4)))
                                {
                                    if((Objects.equals(DURname, DurationCheck1))|(Objects.equals(DURname, DurationCheck2))|(Objects.equals(DURname, DurationCheck3))|(Objects.equals(DURname, DurationCheck4)))
                                    {
                                        System.out.println("Duplicate Movie in Database");
                                    }
                                    else
                                    {
                                        md.addData(3, Mname, Dname , FSname, DURname);
                                        Movie3 = 1;
                                    }
                                }
                                else
                                {
                                    md.addData(3, Mname, Dname , FSname, DURname);
                                    Movie3 = 1;
                                }
                            }
                            else
                            {
                                md.addData(3, Mname, Dname , FSname, DURname);
                                Movie3 = 1;
                            }
                        }
                        else if (Movie1 == 1 & Movie2 == 0 & Movie3 == 0 & Movie4 == 1)
                        {
                            System.out.println("Enter movie name");
                            Mname = console.next();
                            System.out.println("Enter directors name");
                            Dname = console.next();
                            System.out.println("Enter FileSize");
                            do{
                                if(console.hasNextDouble())
                                {
                                    FSname = console.nextDouble();
                                    valid = true;
                                }
                                else
                                {
                                    console.nextLine();
                                    valid = false;
                                    System.out.println("Enter a valid Value");
                                }
                            }while(!valid);
                            System.out.println("Enter Duration");
                            //DURname = console.nextDouble();
                            do{
                                if(console.hasNextDouble())
                                {
                                    DURname = console.nextDouble();
                                    valid = true;
                                }
                                else
                                {
                                    console.nextLine();
                                    valid = false;
                                    System.out.println("Enter a valid Value");
                                }
                            }while(!valid);
                            MnameCheck1 = md.M1getName();
                            MnameCheck2 = md.M2getName();
                            MnameCheck3 = md.M3getName();
                            MnameCheck4 = md.M4getName();
                            MnameCheck1 = MnameCheck1.toLowerCase();
                            MnameCheck2 = MnameCheck2.toLowerCase();
                            MnameCheck3 = MnameCheck3.toLowerCase();
                            MnameCheck4 = MnameCheck4.toLowerCase();
                            Mname = Mname.toLowerCase();
                            DnameCheck1 = md.M1getDirector();
                            DnameCheck2 = md.M2getDirector();
                            DnameCheck3 = md.M3getDirector();
                            DnameCheck4 = md.M4getDirector();
                            DnameCheck1= DnameCheck1.toLowerCase();
                            DnameCheck2= DnameCheck2.toLowerCase();
                            DnameCheck3= DnameCheck3.toLowerCase();
                            DnameCheck4= DnameCheck4.toLowerCase();
                            Dname = Dname.toLowerCase();
                            DurationCheck1 = md.M1getDuration();
                            DurationCheck2 = md.M2getDuration();
                            DurationCheck3 = md.M3getDuration();
                            DurationCheck4 = md.M4getDuration();
                            if((Objects.equals(Mname, MnameCheck1))|(Objects.equals(Mname, MnameCheck2))|(Objects.equals(Mname, MnameCheck3))|(Objects.equals(Mname, MnameCheck4)))
                            {
                                if((Objects.equals(Dname, DnameCheck1))|(Objects.equals(Dname, DnameCheck2))|(Objects.equals(Dname, DnameCheck3))|(Objects.equals(Dname, DnameCheck4)))
                                {
                                    if((Objects.equals(DURname, DurationCheck1))|(Objects.equals(DURname, DurationCheck2))|(Objects.equals(DURname, DurationCheck3))|(Objects.equals(DURname, DurationCheck4)))
                                    {
                                        System.out.println("Duplicate Movie in Database");
                                    }
                                    else
                                    {
                                        md.addData(2, Mname, Dname , FSname, DURname);
                                        Movie2 = 1;
                                    }
                                }
                                else
                                {
                                    md.addData(2, Mname, Dname , FSname, DURname);
                                    Movie2 = 1;
                                }
                            }
                            else
                            {
                                md.addData(2, Mname, Dname , FSname, DURname);
                                Movie2 = 1;
                            }
                        }
                        else if (Movie1 == 0 & Movie2 == 0 & Movie3 == 1 & Movie4 == 1)
                        {
                            System.out.println("Enter movie name");
                            Mname = console.next();
                            System.out.println("Enter directors name");
                            Dname = console.next();
                            System.out.println("Enter FileSize");
                            do{
                                if(console.hasNextDouble())
                                {
                                    FSname = console.nextDouble();
                                    valid = true;
                                }
                                else
                                {
                                    console.nextLine();
                                    valid = false;
                                    System.out.println("Enter a valid Value");
                                }
                            }while(!valid);
                            System.out.println("Enter Duration");
                            //DURname = console.nextDouble();
                            do{
                                if(console.hasNextDouble())
                                {
                                    DURname = console.nextDouble();
                                    valid = true;
                                }
                                else
                                {
                                    console.nextLine();
                                    valid = false;
                                    System.out.println("Enter a valid Value");
                                }
                            }while(!valid);
                            MnameCheck1 = md.M1getName();
                            MnameCheck2 = md.M2getName();
                            MnameCheck3 = md.M3getName();
                            MnameCheck4 = md.M4getName();
                            MnameCheck1 = MnameCheck1.toLowerCase();
                            MnameCheck2 = MnameCheck2.toLowerCase();
                            MnameCheck3 = MnameCheck3.toLowerCase();
                            MnameCheck4 = MnameCheck4.toLowerCase();
                            Mname = Mname.toLowerCase();
                            DnameCheck1 = md.M1getDirector();
                            DnameCheck2 = md.M2getDirector();
                            DnameCheck3 = md.M3getDirector();
                            DnameCheck4 = md.M4getDirector();
                            DnameCheck1= DnameCheck1.toLowerCase();
                            DnameCheck2= DnameCheck2.toLowerCase();
                            DnameCheck3= DnameCheck3.toLowerCase();
                            DnameCheck4= DnameCheck4.toLowerCase();
                            Dname = Dname.toLowerCase();
                            DurationCheck1 = md.M1getDuration();
                            DurationCheck2 = md.M2getDuration();
                            DurationCheck3 = md.M3getDuration();
                            DurationCheck4 = md.M4getDuration();
                            if((Objects.equals(Mname, MnameCheck1))|(Objects.equals(Mname, MnameCheck2))|(Objects.equals(Mname, MnameCheck3))|(Objects.equals(Mname, MnameCheck4)))
                            {
                                if((Objects.equals(Dname, DnameCheck1))|(Objects.equals(Dname, DnameCheck2))|(Objects.equals(Dname, DnameCheck3))|(Objects.equals(Dname, DnameCheck4)))
                                {
                                    if((Objects.equals(DURname, DurationCheck1))|(Objects.equals(DURname, DurationCheck2))|(Objects.equals(DURname, DurationCheck3))|(Objects.equals(DURname, DurationCheck4)))
                                    {
                                        System.out.println("Duplicate Movie in Database");
                                    }
                                    else
                                    {
                                        md.addData(3, Mname, Dname , FSname, DURname);
                                        Movie3 = 1;
                                    }
                                }
                                else
                                {
                                    md.addData(3, Mname, Dname , FSname, DURname);
                                    Movie3 = 1;
                                }
                            }
                            else
                            {
                                md.addData(3, Mname, Dname , FSname, DURname);
                                Movie3 = 1;
                            }
                        }
                        else if (Movie1 == 0 & Movie2 == 0 & Movie3 == 0 & Movie4 == 1)
                        {
                            System.out.println("Enter movie name");
                            Mname = console.next();
                            System.out.println("Enter directors name");
                            Dname = console.next();
                            System.out.println("Enter FileSize");
                            do{
                                if(console.hasNextDouble())
                                {
                                    FSname = console.nextDouble();
                                    valid = true;
                                }
                                else
                                {
                                    console.nextLine();
                                    valid = false;
                                    System.out.println("Enter a valid Value");
                                }
                            }while(!valid);
                            System.out.println("Enter Duration");
                            //DURname = console.nextDouble();
                            do{
                                if(console.hasNextDouble())
                                {
                                    DURname = console.nextDouble();
                                    valid = true;
                                }
                                else
                                {
                                    console.nextLine();
                                    valid = false;
                                    System.out.println("Enter a valid Value");
                                }
                            }while(!valid);
                            MnameCheck1 = md.M1getName();
                            MnameCheck2 = md.M2getName();
                            MnameCheck3 = md.M3getName();
                            MnameCheck4 = md.M4getName();
                            MnameCheck1 = MnameCheck1.toLowerCase();
                            MnameCheck2 = MnameCheck2.toLowerCase();
                            MnameCheck3 = MnameCheck3.toLowerCase();
                            MnameCheck4 = MnameCheck4.toLowerCase();
                            Mname = Mname.toLowerCase();
                            DnameCheck1 = md.M1getDirector();
                            DnameCheck2 = md.M2getDirector();
                            DnameCheck3 = md.M3getDirector();
                            DnameCheck4 = md.M4getDirector();
                            DnameCheck1= DnameCheck1.toLowerCase();
                            DnameCheck2= DnameCheck2.toLowerCase();
                            DnameCheck3= DnameCheck3.toLowerCase();
                            DnameCheck4= DnameCheck4.toLowerCase();
                            Dname = Dname.toLowerCase();
                            DurationCheck1 = md.M1getDuration();
                            DurationCheck2 = md.M2getDuration();
                            DurationCheck3 = md.M3getDuration();
                            DurationCheck4 = md.M4getDuration();
                            if((Objects.equals(Mname, MnameCheck1))|(Objects.equals(Mname, MnameCheck2))|(Objects.equals(Mname, MnameCheck3))|(Objects.equals(Mname, MnameCheck4)))
                            {
                                if((Objects.equals(Dname, DnameCheck1))|(Objects.equals(Dname, DnameCheck2))|(Objects.equals(Dname, DnameCheck3))|(Objects.equals(Dname, DnameCheck4)))
                                {
                                    if((Objects.equals(DURname, DurationCheck1))|(Objects.equals(DURname, DurationCheck2))|(Objects.equals(DURname, DurationCheck3))|(Objects.equals(DURname, DurationCheck4)))
                                    {
                                        System.out.println("Duplicate Movie in Database");
                                    }
                                    else
                                    {
                                        md.addData(1, Mname, Dname , FSname, DURname);
                                        Movie1 = 1;
                                    }
                                }
                                else
                                {
                                    md.addData(1, Mname, Dname , FSname, DURname);
                                    Movie1 = 1;
                                }
                            }
                            else
                            {
                                md.addData(1, Mname, Dname , FSname, DURname);
                                Movie1 = 1;
                            }
                        }
                    }
                    break;
             
             case 2:
                    System.out.println("To delete a movie enter the number associated with it");
                    if(Movie1 == 1)
                    {
                    System.out.println("Movie 1:"+md.M1getName());
                    }
                    if(Movie2 == 1)
                    {
                    System.out.println("Movie 2:"+md.M2getName());
                    }
                    if(Movie3 == 1)
                    {
                    System.out.println("Movie 3:"+md.M3getName());
                    }
                    if(Movie4 == 1)
                    {
                    System.out.println("Movie 4:"+md.M4getName());
                    }
                    delete = console.nextInt();
                    if(delete == 1)
                    {
                        Movie1 = 0;
                        getPlaylistMovie= P1.getMovie1();
                        if(getPlaylistMovie == delete)
                        {
                            playlistMove= P1.getMovie2();
                            P1.setMovie1(playlistMove);
                            playlistMove= P1.getMovie3();
                            P1.setMovie2(playlistMove);
                            playlistMove= -1;
                            P1.setMovie3(playlistMove);
                            playlistMove= P1.getMovie3();
                            P1.setMovie2(playlistMove);
                            playlistMove= -1;
                            P1.setMovie3(playlistMove);
                        
                        }
                        if(getPlaylistMovie == delete)
                    {
                        
                    }
                    
                    }
                    if(delete == 2)
                    {
                    Movie2 = 0;
                    }
                    if(delete == 3)
                    {
                    Movie3 = 0;
                    }
                    if(delete == 4)
                    {
                    Movie4 = 0;
                    }
                    System.out.println("Movie "+delete+" was deleted");
                    break;
             
             case 3:
                    System.out.println("Movie Database");
                    if(Movie1 == 1)
                    {
                    System.out.println("name="+md.M1getName());
                    }
                    if(Movie2 == 1)
                    {
                    System.out.println("name="+md.M2getName());
                    }
                    if(Movie3 == 1)
                    {
                    System.out.println("name="+md.M3getName());
                    }
                    if(Movie4 == 1)
                    {
                    System.out.println("name="+md.M4getName());
                    }
                    break;
             
             case 4:
                    if(playlist1 == 1 & playlist2 == 1)
                    {
                        System.out.println("Database is Full");
                    }
                    else
                    {
                    System.out.println("To create a playlist enter the number associated with it");
                    System.out.println("To complete playlist enter the number 9");
                    if(Movie1 == 1)
                    {
                    System.out.println("Movie 1:"+md.M1getName());
                    }
                    if(Movie2 == 1)
                    {
                    System.out.println("Movie 2:"+md.M2getName());
                    }
                    if(Movie3 == 1)
                    {
                    System.out.println("Movie 3:"+md.M3getName());
                    }
                    if(Movie4 == 1)
                    {
                    System.out.println("Movie 4:"+md.M4getName());
                    }
                    if(playlist1 ==  0 & playlist2 == 0)
                    {
                    System.out.println("Enter 1st movie");
                    do{
                        if(console.hasNextInt())
                        {
                            playlistSelection = console.nextInt();
                            valid = true;
                        }
                        else
                        {
                            console.nextLine();
                            valid = false;
                            System.out.println("Enter a valid Integer Value");
                        }
                    }while(!valid);
                    if(playlistSelection== 1 | playlistSelection== 2 | playlistSelection== 3 | playlistSelection== 4)
                    {
                        P1.setMovie1(playlistSelection);
                        System.out.println("Enter 2nd movie");
                        do{
                            if(console.hasNextInt())
                            {
                                playlistSelection = console.nextInt();
                                valid = true;
                            }
                            else
                            {
                                console.nextLine();
                                valid = false;
                                System.out.println("Enter a valid Integer Value");
                            }
                        }while(!valid);
                        if(playlistSelection== 1 | playlistSelection== 2 | playlistSelection== 3 | playlistSelection== 4)
                        {
                             P1.setMovie2(playlistSelection);
                             System.out.println("Enter 3nd movie");
                             do{
                                 if(console.hasNextInt())
                                 {
                                     playlistSelection = console.nextInt();
                                     valid = true;
                                 }
                                 else
                                 {
                                     console.nextLine();
                                     valid = false;
                                     System.out.println("Enter a valid Integer Value");
                                 }
                                }while(!valid);
                             if(playlistSelection== 1 | playlistSelection== 2 | playlistSelection== 3 | playlistSelection== 4)
                             {
                                 P1.setMovie3(playlistSelection);
                             }
                             else if(playlistSelection!= 1 | playlistSelection!= 2 | playlistSelection!= 3 | playlistSelection!= 4)
                             {
                                 playlistSelection = -1;
                                 P1.setMovie3(playlistSelection);
                             }
                        }
                        else if(playlistSelection!= 1 | playlistSelection!= 2 | playlistSelection!= 3 | playlistSelection!= 4)
                        {
                               playlistSelection = -1;
                               P1.setMovie3(playlistSelection);
                        }
                    }
                    else if(playlistSelection!= 1 | playlistSelection!= 2 | playlistSelection!= 3 | playlistSelection!= 4)
                    {
                        playlistSelection = -1;
                        P1.setMovie3(playlistSelection);
                    }
                    playlist1 = 1;
                }
                else if(playlist1 ==  1 & playlist2 == 0)
                    {
                    System.out.println("Enter 1st movie");
                    do{
                        if(console.hasNextInt())
                        {
                            playlistSelection = console.nextInt();
                            valid = true;
                        }
                        else
                        {
                            console.nextLine();
                            valid = false;
                            System.out.println("Enter a valid Integer Value");
                        }
                    }while(!valid);
                    if(playlistSelection== 1 | playlistSelection== 2 | playlistSelection== 3 | playlistSelection== 4)
                    {
                        P2.setMovie1(playlistSelection);
                        System.out.println("Enter 2nd movie");
                        do{
                            if(console.hasNextInt())
                            {
                                playlistSelection = console.nextInt();
                                valid = true;
                            }
                            else
                            {
                                console.nextLine();
                                valid = false;
                                System.out.println("Enter a valid Integer Value");
                            }
                        }while(!valid);
                        if(playlistSelection== 1 | playlistSelection== 2 | playlistSelection== 3 | playlistSelection== 4)
                        {
                             P2.setMovie2(playlistSelection);
                             System.out.println("Enter 3nd movie");
                             do{
                                 if(console.hasNextInt())
                                 {
                                     playlistSelection = console.nextInt();
                                     valid = true;
                                 }
                                 else
                                 {
                                     console.nextLine();
                                     valid = false;
                                     System.out.println("Enter a valid Integer Value");
                                 }
                                }while(!valid);
                             if(playlistSelection== 1 | playlistSelection== 2 | playlistSelection== 3 | playlistSelection== 4)
                             {
                                 P2.setMovie3(playlistSelection);
                             }
                             else if(playlistSelection!= 1 | playlistSelection!= 2 | playlistSelection!= 3 | playlistSelection!= 4)
                             {
                                 playlistSelection = -1;
                                 P1.setMovie3(playlistSelection);
                             }
                        }
                        else if(playlistSelection!= 1 | playlistSelection!= 2 | playlistSelection!= 3 | playlistSelection!= 4)
                             {
                                 playlistSelection = -1;
                                 P1.setMovie3(playlistSelection);
                             }
                    }
                    else if(playlistSelection!= 1 | playlistSelection!= 2 | playlistSelection!= 3 | playlistSelection!= 4)
                             {
                                 playlistSelection = -1;
                                 P1.setMovie3(playlistSelection);
                             }
                    playlist2 = 1;
                }
                else if(playlist1 ==  0 & playlist2 == 1)
                    {
                    System.out.println("Enter 1st movie");
                    do{
                        if(console.hasNextInt())
                        {
                            playlistSelection = console.nextInt();
                            valid = true;
                        }
                        else
                        {
                            console.nextLine();
                            valid = false;
                            System.out.println("Enter a valid Integer Value");
                        }
                    }while(!valid);
                    if(playlistSelection== 1 | playlistSelection== 2 | playlistSelection== 3 | playlistSelection== 4)
                    {
                        P1.setMovie1(playlistSelection);
                        System.out.println("Enter 2nd movie");
                        do{
                            if(console.hasNextInt())
                            {
                                playlistSelection = console.nextInt();
                                valid = true;
                            }
                            else
                            {
                                console.nextLine();
                                valid = false;
                                System.out.println("Enter a valid Integer Value");
                            }
                        }while(!valid);
                        if(playlistSelection== 1 | playlistSelection== 2 | playlistSelection== 3 | playlistSelection== 4)
                        {
                             P1.setMovie2(playlistSelection);
                             System.out.println("Enter 3nd movie");
                             do{
                                 if(console.hasNextInt())
                                 {
                                     playlistSelection = console.nextInt();
                                     valid = true;
                                 }
                                 else
                                 {
                                     console.nextLine();
                                     valid = false;
                                     System.out.println("Enter a valid Integer Value");
                                 }
                                }while(!valid);
                             if(playlistSelection== 1 | playlistSelection== 2 | playlistSelection== 3 | playlistSelection== 4)
                             {
                                 P1.setMovie3(playlistSelection);
                             }
                             else if(playlistSelection!= 1 | playlistSelection!= 2 | playlistSelection!= 3 | playlistSelection!= 4)
                             {
                                 playlistSelection = -1;
                                 P1.setMovie3(playlistSelection);
                             }
                        }
                        else if(playlistSelection!= 1 | playlistSelection!= 2 | playlistSelection!= 3 | playlistSelection!= 4)
                             {
                                 playlistSelection = -1;
                                 P1.setMovie3(playlistSelection);
                             }
                    }
                    else if(playlistSelection!= 1 | playlistSelection!= 2 | playlistSelection!= 3 | playlistSelection!= 4)
                             {
                                 playlistSelection = -1;
                                 P1.setMovie3(playlistSelection);
                             }
                    playlist1 = 1;
                }
                    break;
                }
             case 5:
                    {
                        if(playlist1 == 1)
                        {
                        System.out.println("Playlist 1:");
                        getPlaylistMovie = P1.getMovie1();
                        if(getPlaylistMovie == 1)
                        {
                              System.out.println("Movie 1:"+md.M1getName());  
                        }
                        if(getPlaylistMovie == 2)
                        {
                            System.out.println("Movie 1:"+md.M2getName());
                        }
                        if(getPlaylistMovie == 3)
                        {
                            System.out.println("Movie 1:"+md.M3getName());
                        }
                        if(getPlaylistMovie == 4)
                        {
                            System.out.println("Movie 1:"+md.M4getName());
                        }
                        if(getPlaylistMovie == -1)
                        {
                            System.out.println("Movie 1:NULL ");
                        }
                        getPlaylistMovie = P1.getMovie2();
                        if(getPlaylistMovie == 1)
                        {
                              System.out.println("Movie 2:"+md.M1getName());  
                        }
                        if(getPlaylistMovie == 2)
                        {
                            System.out.println("Movie 2:"+md.M2getName());
                        }
                        if(getPlaylistMovie == 3)
                        {
                            System.out.println("Movie 2:"+md.M3getName());
                        }
                        if(getPlaylistMovie == 4)
                        {
                            System.out.println("Movie 2:"+md.M4getName());
                        }
                        if(getPlaylistMovie == -1)
                        {
                            System.out.println("Movie 2:NULL ");
                        }
                        getPlaylistMovie = P1.getMovie3();
                        if(getPlaylistMovie == 1)
                        {
                              System.out.println("Movie 3:"+md.M1getName());  
                        }
                        if(getPlaylistMovie == 2)
                        {
                            System.out.println("Movie 3:"+md.M2getName());
                        }
                        if(getPlaylistMovie == 3)
                        {
                            System.out.println("Movie 3:"+md.M3getName());
                        }
                        if(getPlaylistMovie == 4)
                        {
                            System.out.println("Movie 3:"+md.M4getName());
                        }
                        if(getPlaylistMovie == -1)
                        {
                            System.out.println("Movie 3:NULL ");
                        }
                    }
                    if(playlist2 == 1)
                    {
                        System.out.println("Playlist 2:");
                        getPlaylistMovie = P2.getMovie1();
                        if(getPlaylistMovie == 1)
                        {
                              System.out.println("Movie 1:"+md.M1getName());  
                        }
                        if(getPlaylistMovie == 2)
                        {
                            System.out.println("Movie 1:"+md.M2getName());
                        }
                        if(getPlaylistMovie == 3)
                        {
                            System.out.println("Movie 1:"+md.M3getName());
                        }
                        if(getPlaylistMovie == 4)
                        {
                            System.out.println("Movie 1:"+md.M4getName());
                        }
                        if(getPlaylistMovie == -1)
                        {
                            System.out.println("Movie 1:NULL ");
                        }
                        getPlaylistMovie = P2.getMovie2();
                        if(getPlaylistMovie == 1)
                        {
                              System.out.println("Movie 2:"+md.M1getName());  
                        }
                        if(getPlaylistMovie == 2)
                        {
                            System.out.println("Movie 2:"+md.M2getName());
                        }
                        if(getPlaylistMovie == 3)
                        {
                            System.out.println("Movie 2:"+md.M3getName());
                        }
                        if(getPlaylistMovie == 4)
                        {
                            System.out.println("Movie 2:"+md.M4getName());
                        }
                        if(getPlaylistMovie == -1)
                        {
                            System.out.println("Movie 2:NULL ");
                        }
                        getPlaylistMovie = P2.getMovie3();
                        if(getPlaylistMovie == 1)
                        {
                              System.out.println("Movie 3:"+md.M1getName());  
                        }
                        if(getPlaylistMovie == 2)
                        {
                            System.out.println("Movie 3:"+md.M2getName());
                        }
                        if(getPlaylistMovie == 3)
                        {
                            System.out.println("Movie 3:"+md.M3getName());
                        }
                        if(getPlaylistMovie == 4)
                        {
                            System.out.println("Movie 3:"+md.M4getName());
                        }  
                        if(getPlaylistMovie == -1)
                        {
                            System.out.println("Movie 3:NULL ");
                        }
                    }
                     else if(playlist1 == 0 & playlist2 ==0)
                {
                    System.out.println("There are no playlists to delete");
                }
                        break;
                    }
             case 6:
             {
                    System.out.println("To delete a playlist enter the number associated with it");
                    
                    if(playlist1==1)
                    {
                        System.out.println("Playlist 1:");
                        getPlaylistMovie = P1.getMovie1();
                        if(getPlaylistMovie == 1)
                        {
                              System.out.println("Movie 1:"+md.M1getName());  
                        }
                        if(getPlaylistMovie == 2)
                        {
                            System.out.println("Movie 1:"+md.M2getName());
                        }
                        if(getPlaylistMovie == 3)
                        {
                            System.out.println("Movie 1:"+md.M3getName());
                        }
                        if(getPlaylistMovie == 4)
                        {
                            System.out.println("Movie 1:"+md.M4getName());
                        }
                        if(getPlaylistMovie == -1)
                        {
                            System.out.println("Movie 1:NULL ");
                        }
                        getPlaylistMovie = P1.getMovie2();
                        if(getPlaylistMovie == 1)
                        {
                              System.out.println("Movie 2:"+md.M1getName());  
                        }
                        if(getPlaylistMovie == 2)
                        {
                            System.out.println("Movie 2:"+md.M2getName());
                        }
                        if(getPlaylistMovie == 3)
                        {
                            System.out.println("Movie 2:"+md.M3getName());
                        }
                        if(getPlaylistMovie == 4)
                        {
                            System.out.println("Movie 2:"+md.M4getName());
                        }
                        if(getPlaylistMovie == -1)
                        {
                            System.out.println("Movie 2:NULL ");
                        }
                        getPlaylistMovie = P1.getMovie3();
                        if(getPlaylistMovie == 1)
                        {
                              System.out.println("Movie 3:"+md.M1getName());  
                        }
                        if(getPlaylistMovie == 2)
                        {
                            System.out.println("Movie 3:"+md.M2getName());
                        }
                        if(getPlaylistMovie == 3)
                        {
                            System.out.println("Movie 3:"+md.M3getName());
                        }
                        if(getPlaylistMovie == 4)
                        {
                            System.out.println("Movie 3:"+md.M4getName());
                        }
                        if(getPlaylistMovie == -1)
                        {
                            System.out.println("Movie 3:NULL ");
                        }
                    }
                    if(playlist2 == 1)
                    {
                        System.out.println("Playlist 2:");
                        getPlaylistMovie = P2.getMovie1();
                        if(getPlaylistMovie == 1)
                        {
                              System.out.println("Movie 1:"+md.M1getName());  
                        }
                        if(getPlaylistMovie == 2)
                        {
                            System.out.println("Movie 1:"+md.M2getName());
                        }
                        if(getPlaylistMovie == 3)
                        {
                            System.out.println("Movie 1:"+md.M3getName());
                        }
                        if(getPlaylistMovie == 4)
                        {
                            System.out.println("Movie 1:"+md.M4getName());
                        }
                        if(getPlaylistMovie == -1)
                        {
                            System.out.println("Movie 1:NULL ");
                        }
                        getPlaylistMovie = P2.getMovie2();
                        if(getPlaylistMovie == 1)
                        {
                              System.out.println("Movie 2:"+md.M1getName());  
                        }
                        if(getPlaylistMovie == 2)
                        {
                            System.out.println("Movie 2:"+md.M2getName());
                        }
                        if(getPlaylistMovie == 3)
                        {
                            System.out.println("Movie 2:"+md.M3getName());
                        }
                        if(getPlaylistMovie == 4)
                        {
                            System.out.println("Movie 2:"+md.M4getName());
                        }
                        if(getPlaylistMovie == -1)
                        {
                            System.out.println("Movie 2:NULL ");
                        }
                        getPlaylistMovie = P2.getMovie3();
                        if(getPlaylistMovie == 1)
                        {
                              System.out.println("Movie 3:"+md.M1getName());  
                        }
                        if(getPlaylistMovie == 2)
                        {
                            System.out.println("Movie 3:"+md.M2getName());
                        }
                        if(getPlaylistMovie == 3)
                        {
                            System.out.println("Movie 3:"+md.M3getName());
                        }
                        if(getPlaylistMovie == 4)
                        {
                            System.out.println("Movie 3:"+md.M4getName());
                        }
                        if(getPlaylistMovie == -1)
                        {
                            System.out.println("Movie 3:NULL ");
                        }
                    }
                   if(playlist1 == 1 | playlist2 == 1)
                   {
                        delete = console.nextInt();
                    if(delete == 1)
                    {
                    playlist1 = 0;
                    }
                    if(delete == 2)
                    {
                    playlist2 = 0;
                    }
                }
                else if(playlist1 == 0 & playlist2 ==0)
                {
                    System.out.println("There are no playlists to delete");
                }
                
                    break;
             }
             case 7:
             {
                 System.out.println("To delete a Movie enter the number associated with the playlist it is in");
                    
                    if(playlist1==1)
                    {
                        System.out.println("Playlist 1:");
                        getPlaylistMovie = P1.getMovie1();
                        if(getPlaylistMovie == 1)
                        {
                              System.out.println("Movie 1:"+md.M1getName());  
                        }
                        if(getPlaylistMovie == 2)
                        {
                            System.out.println("Movie 1:"+md.M2getName());
                        }
                        if(getPlaylistMovie == 3)
                        {
                            System.out.println("Movie 1:"+md.M3getName());
                        }
                        if(getPlaylistMovie == 4)
                        {
                            System.out.println("Movie 1:"+md.M4getName());
                        }
                        if(getPlaylistMovie == -1)
                        {
                            System.out.println("Movie 1:NULL ");
                        }
                        getPlaylistMovie = P1.getMovie2();
                        if(getPlaylistMovie == 1)
                        {
                              System.out.println("Movie 2:"+md.M1getName());  
                        }
                        if(getPlaylistMovie == 2)
                        {
                            System.out.println("Movie 2:"+md.M2getName());
                        }
                        if(getPlaylistMovie == 3)
                        {
                            System.out.println("Movie 2:"+md.M3getName());
                        }
                        if(getPlaylistMovie == 4)
                        {
                            System.out.println("Movie 2:"+md.M4getName());
                        }
                        if(getPlaylistMovie == -1)
                        {
                            System.out.println("Movie 2:NULL ");
                        }
                        getPlaylistMovie = P1.getMovie3();
                        if(getPlaylistMovie == 1)
                        {
                              System.out.println("Movie 3:"+md.M1getName());  
                        }
                        if(getPlaylistMovie == 2)
                        {
                            System.out.println("Movie 3:"+md.M2getName());
                        }
                        if(getPlaylistMovie == 3)
                        {
                            System.out.println("Movie 3:"+md.M3getName());
                        }
                        if(getPlaylistMovie == 4)
                        {
                            System.out.println("Movie 3:"+md.M4getName());
                        }
                        if(getPlaylistMovie == -1)
                        {
                            System.out.println("Movie 3:NULL ");
                        }
                    }
                    if(playlist2 == 1)
                    {
                        System.out.println("Playlist 2:");
                        getPlaylistMovie = P2.getMovie1();
                        if(getPlaylistMovie == 1)
                        {
                              System.out.println("Movie 1:"+md.M1getName());  
                        }
                        if(getPlaylistMovie == 2)
                        {
                            System.out.println("Movie 1:"+md.M2getName());
                        }
                        if(getPlaylistMovie == 3)
                        {
                            System.out.println("Movie 1:"+md.M3getName());
                        }
                        if(getPlaylistMovie == 4)
                        {
                            System.out.println("Movie 1:"+md.M4getName());
                        }
                        if(getPlaylistMovie == -1)
                        {
                            System.out.println("Movie 1:NULL ");
                        }
                        getPlaylistMovie = P2.getMovie2();
                        if(getPlaylistMovie == 1)
                        {
                              System.out.println("Movie 2:"+md.M1getName());  
                        }
                        if(getPlaylistMovie == 2)
                        {
                            System.out.println("Movie 2:"+md.M2getName());
                        }
                        if(getPlaylistMovie == 3)
                        {
                            System.out.println("Movie 2:"+md.M3getName());
                        }
                        if(getPlaylistMovie == 4)
                        {
                            System.out.println("Movie 2:"+md.M4getName());
                        }
                        if(getPlaylistMovie == -1)
                        {
                            System.out.println("Movie 2:NULL ");
                        }
                        getPlaylistMovie = P2.getMovie3();
                        if(getPlaylistMovie == 1)
                        {
                              System.out.println("Movie 3:"+md.M1getName());  
                        }
                        if(getPlaylistMovie == 2)
                        {
                            System.out.println("Movie 3:"+md.M2getName());
                        }
                        if(getPlaylistMovie == 3)
                        {
                            System.out.println("Movie 3:"+md.M3getName());
                        }
                        if(getPlaylistMovie == 4)
                        {
                            System.out.println("Movie 3:"+md.M4getName());
                        }
                        if(getPlaylistMovie == -1)
                        {
                            System.out.println("Movie 3:NULL ");
                        }
                    }
                   if(playlist1 == 1 | playlist2 == 1)
                   {
                        delete = console.nextInt();
                    if(delete == 1)
                    {
                        System.out.println("Enter the number associated with movie that will be deleted");
                        movDelete = console.nextInt();
                        if(movDelete ==1)
                        {
                            playlistMove= P1.getMovie2();
                            P1.setMovie1(playlistMove);
                            playlistMove= P1.getMovie3();
                            P1.setMovie2(playlistMove);
                            playlistMove= -1;
                            P1.setMovie3(playlistMove);
                        }
                        if(movDelete ==2)
                        {
                            playlistMove= P1.getMovie3();
                            P1.setMovie2(playlistMove);
                            playlistMove= -1;
                            P1.setMovie3(playlistMove);
                        }
                        if(movDelete ==3)
                        {
                            playlistMove= -1;
                            P1.setMovie3(playlistMove);
                        }
                    }
                    if(delete == 2)
                    {
                        System.out.println("Enter the number associated with movie that will be deleted");
                        movDelete = console.nextInt();
                        if(movDelete ==1)
                        {
                            playlistMove= P2.getMovie2();
                            P2.setMovie1(playlistMove);
                            playlistMove= P2.getMovie3();
                            P2.setMovie2(playlistMove);
                            playlistMove= -1;
                            P2.setMovie3(playlistMove);
                        }
                        if(movDelete ==2)
                        {
                            playlistMove= P2.getMovie3();
                            P2.setMovie2(playlistMove);
                            playlistMove= -1;
                            P2.setMovie3(playlistMove);
                        }
                        if(movDelete ==3)
                        {
                            playlistMove= -1;
                            P2.setMovie3(playlistMove);
                        }
                    }
                    }
                
                else if(playlist1 == 0 & playlist2 ==0)
                {
                    System.out.println("There are no movies to delete");
                }
                
                                   
                 break;
             }
             case 8:
             { 
                            System.out.println("List of movies with same director");
                            DnameCheck1 = md.M1getDirector();
                            DnameCheck2 = md.M2getDirector();
                            DnameCheck3 = md.M3getDirector();
                            DnameCheck4 = md.M4getDirector();
                            DnameCheck1= DnameCheck1.toLowerCase();
                            DnameCheck2= DnameCheck2.toLowerCase();
                            DnameCheck3= DnameCheck3.toLowerCase();
                            DnameCheck4= DnameCheck4.toLowerCase();
                            if(Objects.equals(DnameCheck1, DnameCheck2))
                            {
                                System.out.println(md.M1getName());
                                System.out.println(md.M2getName());
                            }
                            if(Objects.equals(DnameCheck1, DnameCheck3))
                            {
                                System.out.println(md.M1getName());
                                System.out.println(md.M3getName());
                            }
                            if(Objects.equals(DnameCheck1, DnameCheck4))
                            {
                                System.out.println(md.M1getName());
                                System.out.println(md.M4getName());
                            }
                            if(Objects.equals(DnameCheck2, DnameCheck3))
                            {
                                System.out.println(md.M2getName());
                                System.out.println(md.M3getName());
                            }
                            if(Objects.equals(DnameCheck2, DnameCheck4))
                            {
                                System.out.println(md.M2getName());
                                System.out.println(md.M4getName());
                            }
                            if(Objects.equals(DnameCheck3, DnameCheck4))
                            {
                                System.out.println(md.M3getName());
                                System.out.println(md.M4getName());
                            }
                            break;
             }
             default: System.out.println("Invalid Selection");
             }//end switch

            showSelection();                                  //Step 6b
            // choice = console.nextInt();            //Step 6c
        do{
            if(console.hasNextInt())
            {
                choice = console.nextInt();
                valid = true;
            }
            else
            {
                console.nextLine();
                valid = false;
                System.out.println("Enter a valid Integer Value");
            }
        }while(!valid);
        }//end while
        
        /*
        System.out.println("Enter movie name");
        Mname = console.next();
        System.out.println("Enter directors name");
        Dname = console.next();
        md.addData(1, Mname, Dname , 1.2, 2.2);
        
        System.out.println("name="+md.M1getName());
      */
        
        
        
    }
    
    public static void showSelection()
    {
          System.out.println("");
          System.out.println("*** Welcome to the Movie Database ***");
          System.out.println("To select an item, enter ");
          System.out.println("1 for entering a new movie to the database");
          System.out.println("2 for deleting a movie from the database");
          System.out.println("3 for listing movies in the database");
          System.out.println("4 for creating a playlist");
          System.out.println("5 for listing the playlists and their specific movies");
          System.out.println("6 for deleting a playlist");
          System.out.println("7 for deleting a movie from a playlist");
          System.out.println("8 for a list of movies made by the same director");
          System.out.println("9 to exit");
          System.out.println("");
    }//end showSelection


/*
    public static void AddMovie(String Mname,String Dname,double FSname,double DURname,int Movie1,int Movie2,int Movie3,int Movie4)
    {
        Scanner console = new Scanner(System.in);
        MovieDatabase md = new MovieDatabase();
        System.out.println("Enter movie name");
        Mname = console.next();
        System.out.println("Enter directors name");
        Dname = console.next();
        System.out.println("Enter FileSize");
        FSname = console.nextDouble();
        System.out.println("Enter Duration");
        DURname = console.nextDouble();
        md.addData(1, Mname, Dname , FSname, DURname);
    }*/
}
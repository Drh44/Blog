import java.io.*;
import java.util.*;
/* Author: Dylan Hesser
version 1.00
This program allows a person to create a blog that involves their name, the date, and the content of the blog */
public class BlogEntry
{
private static String userName;
private static String dateOfBlog;
public static Scanner scanner = new Scanner(System.in);
private static String blog ; 
/** These are the blog variables */

 public static void main(String[] args)
   {
   
      userName = " ";
      dateOfBlog = " ";
      blog = " " ;
      
   }
    
    
    public BlogEntry ( String userName, String dateOfBlog, String blog )
         {
         
              this.userName = userName;
              this.dateOfBlog = dateOfBlog;
              this.blog = blog;
           
         }
 /**Accessors*/        
         
        public void setUserName ( String userName )
        {   
           this.userName = userName ;
           }
           
        public void setDateOfBlog ( String dateOfBlog)
        { 
            this.dateOfBlog = dateOfBlog;
            }
        public void setBlog ( String blog )
        {
            this.blog = blog ;
            }
            
   /** Mutators*/         
        public String getUserName ()
        {
            return this.userName ;
            }
            
            
        public String getDateOfBlog ()
        {
            return this.dateOfBlog ; 
            }
            
        public String getBlog ()
        { 
            return this.blog ;
            }
            
            
            
  /** String format for the blog */
        
        public String toString ()
   {
         return  String.format ( "%s %n %s %n %s. " , this.userName, this.dateOfBlog, this.blog);
   
   }
 
 /** Allows a summary to be formatted at the top of the blog */
   private final String TEMP = " ";
   public String getSummary()
   { 
      String[] blogArray = blog.split("summary");
      String finalSummary = " ";
      int length = blogArray.length;
      
      if (length <= 10)
         finalSummary = this.blog;
      else
      {
         for(int i = 0; i < length; i++)
         {
            if (i >10)
            
              
               finalSummary = finalSummary + TEMP + blogArray[i];
               
         }
      }
      return finalSummary;
   }
   
}
     
        
        
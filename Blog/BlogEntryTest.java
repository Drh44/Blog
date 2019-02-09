import java.util.*;
import java.io.*;
import java.text.*;
/** Author: Dylan Hesser
version 1.00 **/
/* This tester shows how the blog will become set up, and how the content can be changed */
public class BlogEntryTest 
{
public static void main(String[]args)
  {

BlogEntry Brittany = new BlogEntry ( "Brittany" , " 01,12,2006", "Today i had to go to the store and buy my mom a soda pop \n ");
System.out.printf("%n %s %n", Brittany.getSummary());
Brittany.setDateOfBlog("01,12,2012");
System.out.printf (" %s %n %s %n %s", Brittany.getUserName(), Brittany.getDateOfBlog(), Brittany.getBlog());

BlogEntry Austin = new BlogEntry ( "Austin"," 21,12,2001", "I don't like sand, its course and its rough, and it gets everywhere. \n");
System.out.printf("%n %s %n" , Austin.getSummary());
System.out.printf (" %s %n %s %n %s", Austin.getUserName(), Austin.getDateOfBlog(), Austin.getBlog());

BlogEntry Anakin = new BlogEntry("Anakin","00,66,19 BBY"," Anakin, channelor palpatine is evil! From my point of view the jedi are evil! Well you are lost than. \n");
System.out.printf("%n %s %n ", Anakin.getSummary()); 
System.out.printf (" %s %n %s %n %s ", Anakin.getUserName(), Anakin.getDateOfBlog(), Anakin.getBlog());







}
   }

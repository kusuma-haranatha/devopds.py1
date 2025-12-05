import java.io.*;
public class Trythrows
{
public static void disply()
{
System.out.println("hello");
}
public static void readfile() throws FileNotFoundException //usage of throws while calling a method
{
FileInputStream GFG
 = new FileInputStream("C:/Users/ADMIN/Desktop/book.txt");
throw new ArrayIndexOutOfBoundsException(); //usage of throw inside a method
}
public static void main(String args[])
{
Try
{
disply();
readfile();
}
catch(Exception e)
{
System.out.println(e);
}
finally
{
System.out.println("End of resources of the program");
}
}
}
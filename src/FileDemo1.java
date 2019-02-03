import java.io.*;
import java.util.*;



class FileDemo1 {
public static void main(String args[])
{
  try
  {
int serialno;
String fname;
float cgpa;
char grade;
File f=null;


  f=new File("file.txt");
  FileWriter fout = new FileWriter(f);
  BufferedWriter bout = new BufferedWriter(fout);
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the serial no.");
  while(sc.hasNext())
  {
  bout.write(sc.next());
  bout.newLine();
  }
  bout.close();
  }catch(Exception e){
  e.printStackTrace();
  }   
 }    
  }
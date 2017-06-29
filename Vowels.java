import java.util.*;
public class Vowels
{
  public static  void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    String i=s.nextLine();
    char j[]=i.toCharArray();
    int l=i.length();
    int cou;
    
        for(int k=0;k<l;k++)
      {
      if(j[k]=='a'||j[k]=='e'||j[k]=='i'||j[k]=='o'||j[k]=='u')
      {
          cou++;
      }
      }
      if(cou>=1)
     {
         System.out.println("vowels");
     
      }
    

     else
     { System.out.println("consonent");
     
                        }
     
      
                         }
                         }

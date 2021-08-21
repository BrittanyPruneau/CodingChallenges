package helloWorld;

import java.util.Arrays;
import java.util.List;

public class GettingStarted 
{

	public static void main(String[] args) 
	{
		
		System.out.println("Hello World");
		System.out.println("Programming is awesome! ");
		System.out.println("Brittany Pruneau");
		
		List<String> trees = Arrays.asList("oak", "pine", "fir","ash", "birch", "elm", "yew");
		System.out.println(listWithSeparator(trees, " "));
		
		String str = "xsss"; 
		Boolean bol = xyBalance(str); 
		System.out.println(bol);
		
		Boolean answer = xyzMiddle(str);
		
		String str2 = "BrittanyPruneau";
		String oneTwo = oneTwo(str2);
		System.out.println(oneTwo);
		
		String str3 = "okhiokhi";
		
		int countHi = countHi(str3); 
		int countHi2 = countHi2(str3); 
		System.out.println(countHi2);
		String a = "Brittanyprun";
		String b = "prun"; 
		Boolean oneAfterAnother = endOther(a,b);
		System.out.println(oneAfterAnother);
	}
		

	
	private static Boolean endOther(String a, String b)
	{	
		a = a.toLowerCase();
		b = b.toLowerCase();
	
		  if(a.endsWith(b) || b.endsWith(a))
				{
					return true; 
				}
				else 
					return false; 
	}
	
	
	
	private static int countHi2(String str3)
	{
		int count = 0; 
		StringBuilder s = new StringBuilder(str3); 
		if(str3.contains("hi")) 
		{
			for(int i = 0; i<str3.length(); i++)
			{
				if(str3.charAt(i) == 'h' && str3.charAt(i+1)=='i')
					count++;
			}
		}
		return count; 
	}
	
	
	
	private static int countHi(String str) 
	{
	  int count =0; 
	  if(str.length() ==1 && str.charAt(0) == 'h')
	  count = 0;
	  else
	  {
	    for(int i =0; i<str.length(); i++)
	    {
	      if((str.charAt(i) == 'h') && (str.charAt(i+1) == 'i') )
	      count+=1;
	    }  
	  }
	return count; 
	}
	
	
	   private static String oneTwo(String str) 
	   {
			  if(str.length()< 3 ) return "";

			  return ""+str.charAt(1)+str.charAt(2)+str.charAt(0)+oneTwo(str.substring(3));
	   }
		
	
	   private static Boolean xyzMiddle(String str)
	   {
			  String xyz = "xyz"; 
			  int len = str.length(); 
			  int middle = len/2; 
			  
			  if(len<3)
			    return false; 
			  
			  if((len % 2) != 0)
			  {
			    if(xyz.equals(str.substring(middle-1,middle+2)))
			    {
			      return true;
			    }
			      else
			      {
			        return false;
			      }
			    }
			    else if (xyz.equals(str.substring(middle-1, middle+2)) || xyz.equals(str.substring(middle-2, middle+1)))
			    {
			      return true;
			    }
			    else 
			      return false; 
			  
			
	   }
	
		private static Boolean xyBalance(String str)
		{
			  Boolean x = false;
			  Boolean y = false; 
			  int len = str.length();
			  
			  for(int i = 0; i<len; i++)
			  {
			    if(str.charAt(i) == 'x' && y == true)
			    {
			      x = true;
			      y = false; 
			    }
			      else if(str.charAt(i) == 'x')
			      {
			        x = true; 
			      }
			      
			    if(str.charAt(i) == 'y' && x == true)
			      y = true;
			  }  
			  
			  if(x == false)
			    y = true; 
			  return y; 
			  
		}
	
		private static String listWithSeparator(List<String> list, String separator)
		{
			StringBuilder sb = new StringBuilder(32); 
			boolean first = true; 
			
			for(String el : list)
			{
				if(first)
				   first = false; 
				else
				{
					sb.append(separator);
				}
				sb.append(el);
			}
			return sb.toString(); 
		}

	}



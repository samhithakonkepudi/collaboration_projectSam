package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyEx {

	public static void main(String[] args) {
		
		

char[] c=new char[128];
int cLen=c.length;
try
(FileReader fr =new FileReader("e:\\a.txt");
FileWriter fw=new FileWriter("e:\\b.txt"))
{
int count=0;
int read=0;
while((read=fr.read(c))!=1)//Line 1
{
if(read<cLen)//Line 2
fw.write(c,0,read);//line 3
else
fw.write(c);
count+=read;//Line 4
}

System.out.println("Wrote:"+count+"characters.");
}
catch(FileNotFoundException f)
{
System.out.println("File "+args[0]+"not found.");
}
catch(IOException e)
{
System.out.println("IOException:"+e);
}
		
		
		
		
	
	}

}

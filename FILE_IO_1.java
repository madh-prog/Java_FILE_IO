import java.io.*;
public class FILE_IO_1
{
	public static void main(String[] args)
	{
		try
		{
			FileReader file1 = new FileReader("C:\Users\150151\OneDrive - Arrow Electronics, Inc\Desktop\java\num.txt");
			FileWriter fileven= new FileWriter("C:\Users\150151\OneDrive - Arrow Electronics, Inc\Desktop\java\even.txt");
			FileWriter fileodd= new FileWriter("C:\Users\150151\OneDrive - Arrow Electronics, Inc\Desktop\java\odd.txt");
			int p=0;
			while(( p=file1.read()) != -1 )
			{
				if(p%2 == 0)
				{
					fileven.write(p);
				}
				else
				{
					fileodd.write(p);
				}
			}
			fileven.close();
			fileodd.close();
			System.out.println("Even & Odd Numbers Are Pinted ");
		}catch(Exception e){}
	}
}
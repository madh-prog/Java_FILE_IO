/*Write a java program which read numbers from number.txt file and store even number to

even.txt and odd number into odd.txt file*/

importjava.util.*;
importjava.io.*;
publicclass FILE_IO_2 
{
    publicstatic void main(String[] args) 
    {
        try 
        {   
            Scannersc= newScanner(System.in);
            int counter=0;
            FileReaderf1 = newFileReader("C:\\Users\\150151\\Desktop\\data.txt");   
            System.out.println("Enter word you want to relace:");
            Stringword1 =sc.nextLine();
            System.out.println("Enter word you want with relace:");
            Stringword2 =sc.nextLine(); 
            Stringmsg="";
            Scannerb1 = newScanner(f1);
            while(b1.hasNext())
            {
                msg += b1.next()+" ";
            }
            System.out.println("File Before Replace word:"+msg);
            Scannerb2 = newScanner(msg);
            Stringmsg1;
            while(b2.hasNext())
            {
                msg1 = b2.next();
                if(msg1.equals(word1)) 
                {
                    counter++;
                }
            }
            msg = msg.replace(word1,word2);
            f1.close();
            System.out.println("Total Replaced word:"+counter);
            System.out.println("File After Replace word:"+msg);
            sc.close();
            b1.close();
	    b2.close();
        }catch(Exceptione) {}
    }
}
package Exam1Review;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadInFile
{
    public static void main(String[] args){
        String fileName = "Bee_Movie_Weekly_Views.txt";
        try
        {
            FileReader fileReader = new FileReader(fileName);
            Scanner reader = new Scanner(fileReader);
            int views = 0;
            while(reader.hasNext()){
                String content = reader.nextLine().replace(",", "");
                views+=Integer.parseInt(content);

            }

            System.out.println("Total views:" + views);
        }catch (FileNotFoundException e)
        {
            System.out.println("The file " + fileName + " was not found!");
        }catch(Exception e)
        {
            //catch every other exceptions and just print them here to save time
            System.out.println(e.getMessage());
        }

    }
}

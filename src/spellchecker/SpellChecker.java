/* 
    Abdullah Mohammed Bajaman
    abajaman0002@stu.kau.edu.sa
    CPCS204
    ZA1 
    Spell Checker 
    10 / July / 2020  
 */
package spellchecker;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class SpellChecker {

    public static void main(String[] args) throws FileNotFoundException {

        File input = new File("wordsList.txt"); // spotting the input file ..
        File article = new File ("SpellChecker.in"); // spotting the article file ..
        PrintWriter pen = new PrintWriter("SpellChecker.out"); // creating the pen (output) file ..
        Scanner readList = new Scanner(input); // scanner for WordList ..
        Scanner readArt = new Scanner(article); // scanner for Article ..
        englishWords objNeeded = new englishWords(); // creating Object of englishWords ..

        if (!(input.exists()) && (!(article.exists()))) // if the file was not found, the program will stop .. 
        {
            System.out.println("File Not Found!");
            System.exit(0);
        }
        
        while (readList.hasNext())
            /* sending everyword from the words list to the tree .. */ 
        {
            objNeeded.insert(readList.next());
        }
        
        while (readArt.hasNext())
        {
            // putting the word into a variable .. 
            String tempWord = readArt.next();
            
            // checking if the word is there or not .. 
            boolean tempCheck = objNeeded.search(tempWord);
            if (!tempCheck)
            {
                /* if not, we'll print it with "" */ 
                pen.print("\"" + tempWord + "\" ");
            }
            else 
            {
                // if yes, we do not modify anything .. 
                pen.print(tempWord + " ");
            }
            
        }
        pen.flush();
        pen.close();
        System.exit(0);
    }
    
}

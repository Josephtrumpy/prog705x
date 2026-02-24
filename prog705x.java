import java.io.*;
import java.util.*;
public class prog705x {
    public static void main(String [] args) throws Exception 
    {
        Scanner poemfile = new Scanner(new File("prog512h.dat"));
        ArrayList<String> poemLines = new ArrayList<>();

        while(poemfile.hasNextLine())
            {
                poemLines.add(poemfile.nextLine());
            }

        poemfile.close();

        Scanner codeFile = new Scanner(new File("prog705x.txt"));
        ArrayList<String> codes = new ArrayList<>();

        while(codeFile.hasNextLine())
            {
                codes.add(codeFile.nextLine());
            }
           codeFile.close();


         String magicword = "";

                for(String code : codes)
                {
                    int lineNum = Integer.parseInt(code.substring(0,2));
                    int wordNum = Integer.parseInt(code.substring(2,3));
                    int charNum = Integer.parseInt(code.substring(3,4));

                    String line = poemLines.get(lineNum -1);
                    String[] words = line.split(" ");
                    String word = words[wordNum-1];
                    String letter = word.substring(charNum-1,charNum);

                    magicword = magicword + letter;
                }

                System.out.println("MagicWord: " + magicword);
                
                
        
    }
  }    

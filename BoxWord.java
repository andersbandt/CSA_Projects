//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

class BoxWord
{
   private String word;

    public BoxWord()
    {
        word="";
    }

    public BoxWord(String s)
    {
        setWord(s);
    }

    public void setWord(String w)
    {
        word = w;
    }
    
    public void Box(String word)
    {
        System.out.print(word);
        System.out.println("");
        int length = word.length();
        for (int i = 1; i < length - 1; i++) {
            System.out.print(word.substring(i,i+1));
            for(int t = 0; t < (length - 2); t++) {
                 System.out.print(" ");
                }
            System.out.print(word.substring(length - i - 1, length - i));
            System.out.println(" ");
        }
        for (int i = length; i > 0; i--) {
            System.out.print(word.substring(i - 1, i));
        }
        System.out.println("");
               
  
           }
        
       
        

    public String toString()
    {
        String output="";
        return output+"\n";
    }
}
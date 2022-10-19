//The Happy "Palindrome" Program
import java.util.Scanner;

public class String2
{
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
        boolean notFinished = false;
        System.out.println("\n String2.java\n");
        do
        {
        System.out.println("Enter a string ===>> ");
        String str = input.nextLine();
        System.out.println();
        System.out.println("Entered string:  " + str);
        System.out.println("Palindromoe:   " + Palindrome.isPal(str));
        System.out.println("Almost Palindrome:  " + Palindrome.almostPal(str));
        System.out.print("Do you wish to repeat this program [Y/N]? ===>> ");
        String repeat = input.nextLine();
        notFinished = (repeat.equals("Y")) || (repeat.equals("y"));
        System.out.println();
    }
    while(notFinished);
    System.out.println();
    } 
}
class Palindrome
{
    /*
    *Precondition: s is an arbitrary String.
    *Postcondition: The value of true is returned is s is a Palindrome, false otherwise.
    *>>>>>This method ignores cases <<<<<
    */
    public static boolean isPal(String s)
    {
        String temp = "";
        s = s.toUpperCase();
        int n = s.length()-1;
        for(int k = n; k>=0; k--)
            temp = temp+s.substring(k,k+1);
        return s.equals(temp);
    }
    /*
    * Precondition: s is a String of one character
    * Postcondition: The value of true is returned is s is a letter and false otherwise
    *Note:   >>>>>This method uses compareTo and compound conditions(boolean aperators)<<<<<
    Note:    >>>>>> This is a helper method - only called by another method in this class<<<<<
    */
    private static boolean isLetter(String letter)
    {
        boolean determLetter = letter.compareTo("A")>0
        && letter.compareTo("Z")<0;
        return determLetter;
        
    }
    /*
    *Precondition: s is an arbitrary String
    * Postcondition: All non-letter characters are removed from s, and this "purged" String is returned.
    *Note:     >>>>>This method uses a helper method <<<<<
    */
    private static String purge(String s)
    {
    s=s.toUpperCase();
    String temp = "";
    for(int k=0; k<s.length();k++)
    {
        String tempChar = s.substring(k,k+1);
        if(isLetter(tempChar));
            temp = temp+ s.substring(k,k+1);
            
    }
    return temp;
}
/*
*Precondition: s is an arbitrary string
*Postcondition: After purging all non-letter characters from s,
the value is returned is the resulting string is a Palindrome, false otherwise.
*Note: >>>>>This method uses two of the other methods in the class <<<<<
*/
public static boolean almostPal(String s)
{
    if(isPal(s))
    {
        return false;
    }
    else
    {
        String purgedPhrase = purge(s);
        return isPal(purgedPhrase);
    }
}
}

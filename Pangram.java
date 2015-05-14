import java.util.*;
import java.io.*;

class Pangram {

static char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
static HashMap<Character, Integer> alphaHash = new HashMap<Character, Integer>();

// check whether or not the sentence contains all the letters in the alphabet
public boolean isPangram(String sentence) {
  boolean isPangram = true;  // be optimistic
  char[] S = sentence.toCharArray();

  for (int i = 0; i < S.length; i++ ) {
    String regex= "[A-Za-z]";
    String str = "" +S[i];
    // confirm it is a letter
    if (str.matches(regex)) {
      S[i] = Character.toLowerCase(S[i]); //put to lower case to add to hash
      int o = alphaHash.get(S[i]);
      alphaHash.remove(S[i]);
      alphaHash.put(S[i], ++o);
    }
  }
  for(Character key: alphaHash.keySet()){
    int count = alphaHash.get(key);
    if ( count == 0 ) {
      isPangram = false;
      break;
    }
  }
  return isPangram;
}


 public final static void main(String[] args)  {

    Pangram mystrPlay = new Pangram();
    Scanner scan = new Scanner(System.in);
    // create dictionary
    for (int i = 0; i < alphabet.length; i++) {
      alphaHash.put(alphabet[i], 0);
    }

    String input = scan.nextLine();
	if (mystrPlay.isPangram(input)) {
            System.out.println("pangram");
         }
         else {
            System.out.println("not pangram");
         }

 } //main

} //Pangram

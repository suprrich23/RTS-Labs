import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
  
    public static Map<String, Integer> aboveBelow(List<Integer> unsort, Integer comp){
      int up = 0, down = 0;
      for (int i = 0; i < unsort.size(); i++){
        if (unsort.get(i) < comp){
          down++;
        }
        else if (unsort.get(i) > comp){
          up++;
        }
      }

      Map <String, Integer> sorted = new HashMap<String, Integer>();
      sorted.put("below", down);
      sorted.put("above", up);
      return sorted; 
    }

    public static String stringRotation(String word, int rot){
      if (rot < 0){
        System.out.print("Not positive Integer");
        return null;
      }
      if (rot > word.length()){
        rot = rot % word.length();
      }
      int lastChar = word.length();
      int startChar = lastChar-rot;
      String subPhrase = word.substring(startChar,lastChar);
      String mainPhrase = word.substring(0, startChar);
      String result = subPhrase.concat(mainPhrase);
      
      return result;
    }

    public static void main(String[] args) {
      List<Integer> unsort = Arrays.asList(1, 5, 2, 1, 10);
      int compare = 6;
      aboveBelow(unsort, compare);

      String sentence = "MyString";
      int rotation = 2;
      stringRotation(sentence, rotation);
    }
  }
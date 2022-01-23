import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
  
    public static Map<String, Integer> aboveBelow(List<Integer> unsort, Integer comp){
      int up = 0, down = 0;
      long start1 = System.nanoTime();
      for (int i = 0; i < unsort.size(); i++){
        if (unsort.get(i) < comp){
          down++;
        }
        else if (unsort.get(i) > comp){
          up++;
        }
      }
      long end1 = System.nanoTime();
      System.out.println("Elapsed Time in nano seconds: "+ (end1-start1));

      Map <String, Integer> sorted = new HashMap<String, Integer>();
      sorted.put("below", down);
      sorted.put("above", up);

      System.out.println(Arrays.asList(sorted));

      long start12 = System.nanoTime();
      Integer[] sort = new Integer[unsort.size()];
      sort = unsort.toArray(sort);
      Arrays.sort(sort);
      long end12 = System.nanoTime();
      System.out.println("Elapsed Time in nano seconds: "+ (end12-start12));

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
      System.out.println(result);
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
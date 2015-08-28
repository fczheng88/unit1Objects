import java.util.StringTokenizer;
public class string2
{
   public static void main(String[] args)
   {
       //2.2 and 2.3 --------------------------
      String animal1 = "quick brown fox";
      String animal2 = "lazy dog";
      String article = "the";
      String action = "jumps over";
      String space = " ";
      String period = ".";
      /* Your work goes here */
      String message = article.concat(space.concat(animal1.concat(space.concat(action.concat(space.concat(article.concat(space.concat(animal2.concat(period)))))))));
      
      String message1 = article + space + animal1 + space + action + space + article + space + animal2 + period;
      
      System.out.println(message);
      System.out.println(message1);
      
      //2.4 ------------------------------------
      
      String sentence1 = "      abc   ";
      String sentence2 = "   def";
      String sentence3 = "ghi         ";
       
      String message2 = sentence1.trim() + sentence2.trim() + sentence3.trim();

      System.out.println(message2);
      
      //Extension ----------------------------
      //hypothesis - 4,Mary, had
      String sentence = "Mary had a little lamb.";
      StringTokenizer mystery = new StringTokenizer(sentence);
      System.out.println(mystery.countTokens());
      System.out.println(mystery.nextToken());
      System.out.println(mystery.nextToken());
   }
}
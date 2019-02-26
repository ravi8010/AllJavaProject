import java.util.*;
public class SetExample {

  public static void main(String args[]) { 
      int count[] = {34, 22,10,60,30,22};
      Set<Integer> set = new HashSet<Integer>();
      try {
         for(int i = 0; i < 5; i++) {
            set.add(count[i]);
         }
         System.out.println(set);

         Set<Integer> sortedSet = new TreeSet<Integer>(set);
         System.out.println("The sorted list is:");
         set.remove(count[0]);
         System.out.println(sortedSet);
         boolean b=sortedSet.contains(32);
         
         System.out.println(b);

         
         
      }
      catch(Exception e) {}
   }
}
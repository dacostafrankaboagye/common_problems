/*
author: @dacostafrankaboagye
intstruction:
You probably know the "like" system from Facebook and other pages. People can "like" blog posts, pictures or other items. We want to create the text that should be displayed next to such an item.

Implement a function likes :: [String] -> String, which must take in input array, containing the names of people who like an item. It must return the display text as shown in the examples:

likes {} // must be "no one likes this"
likes {"Peter"} // must be "Peter likes this"
likes {"Jacob", "Alex"} // must be "Jacob and Alex like this"
likes {"Max", "John", "Mark"} // must be "Max, John and Mark like this"
likes {"Alex", "Jacob", "Mark", "Max"} // must be "Alex, Jacob and 2 others like this"

For 4 or more names, the number in and 2 others simply increases.
*/


// who like it?
class Who_likes_it {
  
  static String goToSwitch(int acc, String ... names){
    switch(acc){
      case 0:
        return "no one likes this";
        
      case 1:
        return names[0] + " likes this";
        
      case 2:
        return names[0] + " and " + names[1] + " like this";
        
      case 3:
        return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        
    }
    return "";
    
  }
  
  public static String solution(String... names) {
    
    int acc = names.length;

    if(acc <= 3){
      return goToSwitch(acc, names);
    }
    else{
      
      return names[0] + ", " + names[1] + " and " + (acc-2) + " others like this";
      
    }


    }

  public static void main(String args[]){
    System.out.println(solution("Frank", "Aboagye", "Kate", "Ivy", "Priscilla"));

  }
}


// Another simple solution by alexr007
/*
class Solution {
  public static String whoLikesIt(String... names) {
    final String Template1 = "%s likes this";
    final String Template2 = "%s and %s like this";
    final String Template3 = "%s, %s and %s like this";
    final String TemplateN = "%s, %s and %d others like this";
    return
        names.length == 0 ? "no one likes this" :
        names.length == 1 ? String.format(Template1, names[0]) :
        names.length == 2 ? String.format(Template2, names[0], names[1]) :
        names.length == 3 ? String.format(Template3, names[0], names[1], names[2]) :
        String.format(TemplateN, names[0], names[1], names.length-2);
  }
}

*/

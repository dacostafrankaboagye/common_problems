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

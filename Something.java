public class Something {
  public String name = "A place";
  public String description = "A place with stuff";
  
  public Something(String n, String d){
      name=n;
      description=d;
      
    }
  public void inspect(){
    System.out.println(name);
    System.out.println(description);
  }
}
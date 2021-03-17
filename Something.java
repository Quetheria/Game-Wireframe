public class Something {
  public String name = "A place";
  public String description = "A place with stuff";
  public boolean found = false;
  public Something(String n, String d){
      name=n;
      description=d;
      
    }
    public String getName(){
      return name;
    }
    
  public void inspect(){
    System.out.println(name);
    found=true;
    System.out.println(description);
  }
  public boolean check(){
    return found;
  }
}
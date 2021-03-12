public class Item extends Something {
    public Item (String n, String d){
        super(n,d);
    }
    public void take(){
        System.out.println("You pick up the "+name);
    }


    
}

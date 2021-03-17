public class Lock extends Something{
    public boolean locked=false;
    public String key="";
    public Lock(String n, String d,String k){
        super(n,d);
        key=k;

    }
}
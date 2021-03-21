public class Lock extends Something{
    public boolean locked=true;
    public String key="";
    public Lock(String n, String d,String k){
        super(n,d);
        key=k;

    }
    public boolean unlock(){
        locked=false;
        return locked;
    }
}
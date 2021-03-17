public class Key extends Item {
    public String lock="";

    public Key(String n, String d,String l){
        super(n,d);
        lock=l;
    }
    public boolean use(String l){
        //(use key lock)
        if(l.equals(lock)){
            return true;
        }else{
            return false;
        }
    }
    public String getLock(){
        return lock;
    }
}

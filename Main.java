import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        new Room("office", "an office with bright flourescent lights"),
        new Key("bronzekey", "a dull bronze key","brassdoor");
        new Lock("brassdoor","A large brass door");
        while(true);
            String answer=scan.nextLine();
            int space=answer.indexOf(" ");
            int tab=answer.indexOf("\t");
            String command=answer.substring(0,space);
            if(command.equals("use")){
                String arg1=answer.substring(space+1,tab);
                String arg2=answer.substring(tab+1);
            }else{
                String arg1=answer.substring(space+1);
            }
            if (command.equals("quit")){break;}
        
            if(command.equals("inspect")){
                    arg1.inspect();

            }else if(command.equals("use")){
                try{
                    arg1.use(arg2);
                }
            }
            
        

        scan.close();

    }
}
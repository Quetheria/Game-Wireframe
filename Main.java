import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        Something[] things={
            new Room("office", "an office with bright flourescent lights"),
            new Key("bronzekey", "a dull bronze key","brassdoor"),
            new Lock("brassdoor","A large brass door","bronzekey") 
        };
        String[] names={
            "office",
            "bronzekey",
            "brassdoor"
        };

        while(true);
            String answer=scan.nextLine();
            int space=answer.indexOf(" ");
            String command=answer.substring(0,space);
            String arg1=answer.substring(space+1);
            
            if (command.equals("quit")){break;}
        
            if(command.equals("inspect")){
                int index;
                for(int i=0; i<3; i++){
                    if(arg1.equals(names[i])){
                        index=i;
                    }
                }

                things[index].inspect();

            }else if(command.equals("use")){
                int index;
                for(int i=0; i<3; i++){
                    if(arg1.equals(names[i])){
                        index=i;
                    }
                }
                if((things[index].getLock).equals(things[index+1])){

                }
            }
            
        

        scan.close();

    }
}
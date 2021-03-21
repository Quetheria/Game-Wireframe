import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        Boolean room2= false;
        Something[] things={
            new Room("office", "an office with bright flourescent lights"),
            new Key("redkey", "a dull bronze key","reddoor"),
            new Lock("reddoor","A large brass door","redkey"), 
            new Room("chamber", "A dark, grimy chamber"),
            new Something("vault","A combination based vault, the dial{dial} is letter based"),
            new Something("table","A rusty folding table, on the table is a note{note}."),
            new Something("note","A peice of paper, on it is a message; What you will need is the fifth through ninth of the fibonacci."),
            new Something("dial","A dial with all of the alphabet. \n Input code:")
        };
        String[] names={
            "office",
            "redkey",
            "reddoor",
            "chamber",
            "vault",
            "table",
            "note",
            "dial"
        };
        System.out.println("You are standing in an office{office}, in front of you is a large red door{reddoor}, on a nondescript table in front of you is a red key{redkey}.");
        while (true){

            String answer=scan.nextLine();
            if (answer.equals("quit")){
                break;
            }else if(answer.equals("cehmu")){
                System.out.println("You have opened the vault and beaten the game");
                break;
            }
            int space=answer.indexOf(" ");
            if(space>0){
                String command=answer.substring(0,space);
                String arg1=answer.substring(space+1);
                int index=0;
                if(command.equals("inspect")){
                    if (room2==false){
                        for(int i=0; i<3; i++){
                            if(arg1.equals(names[i])){
                                index=i;
                            }
                        }
                    }else{
                        for(int i=3; i<8; i++){
                            if(arg1.equals(names[i])){
                                index=i;
                            }
                    }
    
                    }
                }
                    things[index].inspect();
                if(answer.equals("cehmu")){
                    System.out.println("You have unlocked the Vault and beaten the game");
                }
                else if(command.equals("use")){
                    index=0;
                    for(int i=0; i<3; i++){
                        if(arg1.equals(names[i])){
                            index=i;
                        }
                    }
                    if (things[index] instanceof Key){
                        if((things[index].getLock()).equals(names[index+1])&&(things[index+1].check())&&(things[index].check())){
                            things[index+1].unlock();
                            System.out.println("You have unlocked the "+names[index+1]);
                            if(names[index+1]=="reddoor"){
                                room2=true;
                                System.out.println("The next room is a chamber{chamber}, inside is a combination vault{vault} and a metal table{table}.");
    
                            }
                        }else{
                            System.out.println("You haven't found the door.");
                        }
                    }else{
                        System.out.println("You can't do that");
                    }
    
                }
            }else{
                System.out.println("Invalid input");
            }

        }

        scan.close();

    }
}

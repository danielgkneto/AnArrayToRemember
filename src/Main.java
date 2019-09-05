import java.util.Scanner;

public class Main {

    public static void main (String[] args){
        String[] myArray = new String[10];
        //String[] myArray = {"Kennedy", "Johnson", "Nixon", "Ford", "Carter", "Reagan", "Bush", "Clinton", "Bush", "Obama"};

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Type 10 names:");
        for (int i = 0; i < 10; i++){
            myArray[i] = keyboard.nextLine();
        }

        System.out.println("All right. 10 names saved. Type 'history' to show them");

        while (!(keyboard.next().equals("history"))){}

        for (int i = 9; i >= 0; i--){
            System.out.println(myArray[i]);
        }
    }
}

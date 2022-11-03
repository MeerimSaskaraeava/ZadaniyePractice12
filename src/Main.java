import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boy boy = new Boy();
        System.out.println("Write our name");
        boy.setBoyName(scanner.nextLine());
        System.out.println("Do you study at?");
        boy.setStudy(scanner.nextLine());
        System.out.println("How old are you?");
        boy.setAge(scanner.nextByte());


        byte age = boy.getAge();
        String study = boy.getStudy();
        toKnow(age, study);

    }
    public static void toKnow(byte age,String study){
        if ( age<18){
            System.out.println("Early in the army!!!");
        }
        else if (age>=18 && study.contains("n")|| study.contains("N") ){
            System.out.println("It's time for the army");
        }
        else {
            System.out.println("Studies");
        }




    }
}
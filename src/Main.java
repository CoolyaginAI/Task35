import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String newName;
        Integer newAge;

        ArrayList<User> myArrayList = new ArrayList<>();

        for (int i=0; i<5; i++) {

            System.out.println("Введите имя " + (i+1) + "-го пользователя");
            newName = in.nextLine();
            System.out.println("Введите возраст " + (i+1) + "-го пользователя");
            newAge = in.nextInt();
            in.nextLine(); // РЕШЕНИЕ ПРОБЛЕМЫ СО СЧИТЫВАНИЕМ

            User userTemp = new User(newName, newAge);
            myArrayList.add(userTemp);
        }


        Comparator sortAge = new AgeComporator();
        myArrayList.sort(sortAge);

        for (int i=0; i<5; i++) {
            System.out.println(myArrayList.get(i).toString());
        }
    }
}
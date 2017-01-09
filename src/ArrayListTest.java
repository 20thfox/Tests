/**
 * Created by twent on 24.10.2016.
 */
import java.util.ArrayList;

public class ArrayListTest {


    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<String>();
        //добавить в список ряд элементов
        states.add("Germany");
        states.add("England");
        states.add("Spain");
        states.add(1,"Italy"); //add element on index 1

        System.out.println(states.get(1)); //get element 2
        states.set(1,"Russia"); //set new element

        System.out.printf("В списке %d элементов \n", states.size()); //%d показывает сколько элементов с списке


    }
}

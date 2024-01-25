package arrayList;
import java.util.ArrayList;

public class removeLastElement {

    public static void removeLast(ArrayList<String> stringList) {
        if (!stringList.isEmpty()) {
            stringList.remove(stringList.size() - 1);
            System.out.println("Removed the last object.");
        } else {
            System.out.println("ArrayList is already empty. Nothing to remove.");
        }
    }
}

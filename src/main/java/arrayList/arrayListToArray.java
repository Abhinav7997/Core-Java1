package arrayList;
import java.util.ArrayList;

public class arrayListToArray {

    public static String[] convertToArray(ArrayList<String> stringList) {
        String[] stringArray = new String[stringList.size()];
        return stringList.toArray(stringArray);
    }
}

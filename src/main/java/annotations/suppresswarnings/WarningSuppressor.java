package annotations.suppresswarnings;

import java.util.ArrayList;
import java.util.List;

public class WarningSuppressor {

    @SuppressWarnings("unchecked")
    public List addElements() {
        ArrayList list = new ArrayList();
        list.add("Java");
        list.add(100);
        list.add(true);
        return list;
    }

    public static void main(String[] args) {
        WarningSuppressor ws = new WarningSuppressor();
        System.out.println("List contents: " + ws.addElements());
    }
}


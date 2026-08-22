import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<String> tasks = new ArrayList<>();
        
        tasks.add("Buy milk");
        tasks.add("Buy water");
        tasks.add("Buy ham");

        System.out.println(tasks.size());
        System.out.println(tasks.get(0));
    }
}
import java.util.List;
import java.util.ArrayList;

public class Main {
    /* public static void main(String[] args) {
        List<String> tasks = new ArrayList<>();
        
        tasks.add("Buy milk");
        tasks.add("Buy water");
        tasks.add("Buy ham");
        // tasks.remove(1); //

        // System.out.println(tasks.size()); //
        // System.out.println(tasks.get(1)); //
        // System.out.println(tasks.contains("Buy bread")); //
        // System.out.println(tasks.contains("Buy milk")); //
        for (String task : tasks) {
            System.out.println(task);
        }

        List<Integer> numbers = new ArrayList<>();

        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum = sum + numbers.get(i);
        }
        System.out.println(sum);
    }*/
    
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);

        int result = sumList(numbers);
        System.out.println(result);

        List<String> tasks = new ArrayList<>();
        tasks.add("Buy milk");
        tasks.add("Buy water");

        printAll(tasks);
    }

    public static int sumList(List<Integer> list) {
        int sum = 0;
        for(int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }

        return sum;
    }

    public static void printAll(List<String> tasks) {
        for(String task : tasks) {
            System.out.println(task);
        }
    }
}
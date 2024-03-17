import java.util.Arrays;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<String> words1 = new ArrayList<String>(3);

        words1.add("Hello");
        words1.add("I'm");
        words1.add("getting");

        ArrayList<String> words2 = new ArrayList<String>(Arrays.asList("World!", "just", "started."));

        String hello = words1.get(0);
        String world = words2.get(0);
        String im = words1.get(1);
        String just = words2.get(1);
        String  getting = words1.get(2);
        String started = words2.get(2);

        String phrase = hello + " " + world + " " + im + " " + just + " " + getting + " " + started;

        System.out.println(phrase);
    }  
}
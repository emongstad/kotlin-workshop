package workshop.kotlin.task2;

import java.util.stream.Collectors;

public class JavaUtilityFunction {

    public static boolean isHelloWorld(String str) {
        if (str != null)
            return str.equals("Hello World");
        else
            return false;
    }
    private static boolean hasCharsInAlphabeticalOrder(String s) {
        return s.chars()
                .sorted()
                .mapToObj(i -> (char) i)
                .toList()
                .equals(s.chars()
                        .mapToObj(i -> (char) i)
                        .collect(Collectors.toList()));
    }

    public static void main(String[] args) {
        assert isHelloWorld("Hello World");
        String str = "foobar";
        assert !isHelloWorld(str);
        assert !isHelloWorld(null);

        assert hasCharsInAlphabeticalOrder("aegilops");
        assert !hasCharsInAlphabeticalOrder("onomatopoetikon");
    }

}
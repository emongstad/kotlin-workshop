package workshop.kotlin.task1;

public class JavaNull {

    private final String variable = "Grattis ";
    private final String nullableVariable = Math.random() > 0.5 ? "Kotlin" : null;

    {
        System.out.println(variable + " " + nullableVariable);
    }
    public String getVariablesAsUpperCase() {
        return variable.toUpperCase() + nullableVariable.toUpperCase();
    }

    public static void main(String[] args) {
        String str = new JavaNull().getVariablesAsUpperCase();
        assert str.equals("GRATTIS ") || str.equals("GRATTIS KOTLIN");
    }
}
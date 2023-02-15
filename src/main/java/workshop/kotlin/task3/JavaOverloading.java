package workshop.kotlin.task3;

public class JavaOverloading {
    private String name = "Tom Bombadill";
    private int age = 759;
    private JavaGender gender = JavaGender.Male;

    public String override(String name) {
        this.name = name;
        return toString();
    }

    public String override(int age) {
        this.age = age;
        return toString();
    }

    public String override(JavaGender gender) {
        this.gender = gender;
        return toString();
    }

    public String override(String name, int age) {
        this.name = name;
        this.age = age;
        return toString();
    }

    public String override(String name, JavaGender gender) {
        this.name = name;
        this.gender = gender;
        return toString();
    }

    public String override(int age, JavaGender gender) {
        this.age = age;
        this.gender = gender;
        return toString();
    }

    public String override(String name, int age, JavaGender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        return toString();
    }

    public String toString() {
        return String.format("%s %s %s", this.name, this.age, this.gender.name());
    }

    public static void main(String[] args) {
        assert new JavaOverloading().override("Per Bombadill").equals("Per Bombadill 759 Male");
        assert new JavaOverloading().override(123).equals("Tom Bombadill 123 Male");
        assert new JavaOverloading().override(JavaGender.Female).equals("Tom Bombadill 759 Female");
        assert new JavaOverloading().override("Per Bombadill", 123).equals("Per Bombadill 123 Male");
        assert new JavaOverloading().override("Per Bombadill", JavaGender.Female).equals("Per Bombadill 759 Female");
        assert new JavaOverloading().override(123, JavaGender.Female).equals("Tom Bombadill 123 Female");
        assert new JavaOverloading().override("Per Bombadill", 123, JavaGender.Female).equals("Per Bombadill 123 Female");
    }
}
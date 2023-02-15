package workshop.kotlin.task4;

public class JavaReturnExceptions {

    public int function() {
        int random = (int) (Math.random() * 100);
        if (random < 33) {
            throw new JavaLessThan33();
        } else if (random < 67) {
            throw new JavaLessThan67();
        } else if (random < 99) {
            throw new JavaLessThan99();
        } else {
            return 99;
        }
    }

    public static void main(String[] args) {
        JavaReturnExceptions javaReturnExceptions = new JavaReturnExceptions();

        try {
            assert javaReturnExceptions.function() == 99;
        } catch (JavaLessThan33 ex) {
            System.out.println("1 - 32");
        } catch (JavaLessThan67 ex) {
            System.out.println("33 - 66");
        } catch (JavaLessThan99 ex) {
            System.out.println("67 - 98");
        }
    }
}


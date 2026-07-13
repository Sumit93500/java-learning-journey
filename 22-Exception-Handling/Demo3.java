class CustomException extends Exception {

    public CustomException(String message) {
        super(message);
    }
}

public class Demo3 {

    public static void main(String[] args) {

        int i = 1;
        int j = 0;

        try {

            j = j / i;

            if (j == 0) {
                throw new CustomException("j cannot be zero");
            }

        } catch (CustomException e) {

            System.out.println("Custom Exception called");
            System.out.println(e.getMessage());
        }
    }
}
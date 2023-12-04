package inner_class;

public class LocalClassExample {

    static final String REGULAR_EXPRESSION = "[^0-9]";

    public static void validatePhoneNumber(String... phoneNumbers) {
        int numberLength = 10;

        class PhoneNumber {
            String formattedPhoneNumber;

            PhoneNumber(String phoneNumber) {
                String currentNumber = phoneNumber.replaceAll(REGULAR_EXPRESSION, "");
                if (currentNumber.length() == numberLength)
                    formattedPhoneNumber = currentNumber;
            }

            public String getNumber() {
                return formattedPhoneNumber;
            }

            @Override
            public String toString() {
                if (formattedPhoneNumber != null)
                    return """
                            PhoneNumber {
                                formattedPhoneNumber = '""" + formattedPhoneNumber
                            + """
                            '
                            }""";
                return "Illegal phone number format";
            }
        }

        for (String s : phoneNumbers)
            System.out.println(new PhoneNumber(s));
    }

    public static void main(String... args) {
        validatePhoneNumber("123-456-7890", "456-7890");
    }
}

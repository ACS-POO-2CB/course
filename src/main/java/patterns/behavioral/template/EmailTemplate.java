package patterns.behavioral.template;

public abstract class EmailTemplate {

    // Template method
    public final void sendEmail() {
        prepareHeader();
        String body = createBody();
        prepareFooter();
        send(body);
    }

    // Common method used by all subclasses
    private void prepareHeader() {
        System.out.println("Creating super email header...");
    }

    // Abstract method to be implemented by subclasses
    protected abstract String createBody();

    // Common method used by all subclasses
    private void prepareFooter() {
        System.out.println("Adding default disclaimer to the email...");
    }

    // Simulate sending email
    private void send(String body) {
        System.out.println("Sending Email >>>\n" + body);
    }
}


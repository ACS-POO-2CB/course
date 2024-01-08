package patterns.behavioral.template;

public class TemplatePlay {
    public static void main(String[] args) {
        EmailTemplate welcomeEmail = new WelcomeEmail();
        welcomeEmail.sendEmail();

        System.out.println("\n--------------------------------\n");

        EmailTemplate goodbyeEmail = new GoodbyeEmail();
        goodbyeEmail.sendEmail();
    }
}

package patterns.behavioral.template;

public class WelcomeEmail extends EmailTemplate {

    @Override
    public String createBody() {
        return "Welcome to this spectacular OOP course!";
    }
}

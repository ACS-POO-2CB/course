package patterns.behavioral.template;

public class WelcomeEmail extends EmailTemplate {

    @Override
    public String createBody() {
        return "Welcome to our spectacular OOP course!";
    }
}

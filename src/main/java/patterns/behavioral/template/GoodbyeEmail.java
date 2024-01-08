package patterns.behavioral.template;

public class GoodbyeEmail extends EmailTemplate {

    @Override
    protected String createBody() {
        return "Noooo! Please don't go!";
    }
}
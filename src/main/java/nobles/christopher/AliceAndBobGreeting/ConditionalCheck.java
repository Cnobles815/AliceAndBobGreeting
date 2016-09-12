package nobles.christopher.AliceAndBobGreeting;

/**
 * Created by christophernobles on 9/10/16.
 */
public class ConditionalCheck {
    Display display = new Display();

    String response;


    public String checkName(String userName){

        userName = display.getUserInput();


        if (userName.equals("Alice") || userName.equals("Bob"))
            response = ("Greetings. You have a valid name.");
        else response = ("Your name is invalid. You are invalid. Begone pleb.");

        return response;
    }



}

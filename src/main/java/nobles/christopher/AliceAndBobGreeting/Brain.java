package nobles.christopher.AliceAndBobGreeting;

/**
 * Created by christophernobles on 9/10/16.
 */
public class Brain {

    Display display;
    ConditionalCheck conditionalCheck;

    public Brain(){

        this.display = new Display();
        this.conditionalCheck = new ConditionalCheck();

    }

    public void combine() {


        String userInput1 = display.getUserInput();



        display.showResult(conditionalCheck.checkName(userInput1));
        //return display.showResult(calculator.calculate(userInput1));

    }

}


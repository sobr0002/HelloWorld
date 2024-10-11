package Classes;

public class RobotHead {
    String userInput;
    String language;
    String material;



    public RobotHead (String language, String material) {
        this.language = language;
        this.material = material;
        if (userInput.equals("1")) {
            material = "Plastikhoved";
        } else if (userInput.equals("2")) {
            material = "Metalhoved";
        }
    }



}

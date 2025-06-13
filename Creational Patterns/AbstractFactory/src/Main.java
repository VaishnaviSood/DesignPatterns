import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input which type of GUI you want (WINDOWS/MAC)?");
        String input = sc.nextLine();
        GUIFactory guiFactory = selectFactory(input);
        Button button = guiFactory.getButton();
        CheckBox checkBox = guiFactory.getCheckbox();
        button.pressbutton();
        checkBox.selectCheckBox();
        checkBox.deselectCheckBox();
    }

    public static GUIFactory selectFactory(String factoryName){
        if(factoryName.equals("WINDOWS")){
            return new WinGUIFactory();
        }
        else if(factoryName.equals("MAC")){
            return new MacGUIFactory();
        }
        else{
            return new WinGUIFactory();
        }

    }
}
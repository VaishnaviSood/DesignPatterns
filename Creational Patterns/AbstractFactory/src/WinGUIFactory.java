public class WinGUIFactory implements GUIFactory{

    private final WinButton button = new WinButton();
    private final WinCheckbox checkbox = new WinCheckbox();


    @Override
    public Button getButton() {
        return button;
    }

    @Override
    public CheckBox getCheckbox() {
        return checkbox;
    }
}

public class MacGUIFactory implements GUIFactory{

    final private MacButton button = new MacButton();
    final private MacCheckbox checkbox = new MacCheckbox();

    @Override
    public Button getButton() {
        return button;
    }

    @Override
    public CheckBox getCheckbox() {
        return checkbox;
    }
}

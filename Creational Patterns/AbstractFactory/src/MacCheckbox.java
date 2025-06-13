public class MacCheckbox implements CheckBox{
    @Override
    public void selectCheckBox() {
        System.out.println("Mac checkbox is selected");
    }

    @Override
    public void deselectCheckBox() {
        System.out.println("Mac checkbox is de-selected");
    }
}

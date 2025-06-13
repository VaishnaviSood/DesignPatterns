public class WinCheckbox implements CheckBox{
    @Override
    public void selectCheckBox() {
        System.out.println("Windows checkbox is selected");
    }

    @Override
    public void deselectCheckBox() {
        System.out.println("Windows checkbox is de-selected");
    }
}

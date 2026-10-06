package WebTheme.theme;

public class LightTheme implements Theme {

    @Override
    public String getBackgroundColor() {
        return "White";
    }

    @Override
    public String getTextColor() {
        return "Black";
    }

    @Override
    public String getButtonColor() {
        return "Blue";
    }

    @Override
    public int getFontSize() {
        return 16;
    }
}

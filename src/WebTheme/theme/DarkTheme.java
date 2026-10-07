package WebTheme.theme;
public class DarkTheme implements Theme {
    @Override
    public String getBackgroundColor() {
        return "Black";
    }
    @Override
    public String getTextColor() {
        return "White";
    }
    @Override
    public String getButtonColor() {
        return "Gray";
    }
    @Override
    public int getFontSize() {
        return 16;
    }
}
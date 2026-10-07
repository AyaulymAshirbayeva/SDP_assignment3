package WebTheme.theme;
public class CustomTheme implements Theme {
    private String backgroundColor;
    private String textColor;
    private String buttonColor;
    private int fontSize;

    public CustomTheme(String backgroundColor, String textColor, String buttonColor, int fontSize) {
        this.backgroundColor = backgroundColor;
        this.textColor = textColor;
        this.buttonColor = buttonColor;
        this.fontSize = fontSize;
    }

    @Override
    public String getBackgroundColor() {
        return backgroundColor;
    }
    @Override
    public String getTextColor() {
        return textColor;
    }
    @Override
    public String getButtonColor() {
        return buttonColor;
    }
    @Override
    public int getFontSize() {
        return fontSize;
    }
}

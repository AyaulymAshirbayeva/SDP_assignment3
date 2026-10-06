package WebTheme.website;
import WebTheme.theme.Theme;

public abstract class Website {

    protected Theme theme;

    public Website(Theme theme) {
        this.theme = theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    protected void showThemeSettings() {

        System.out.println("Background: "
                + theme.getBackgroundColor());

        System.out.println("Text: "
                + theme.getTextColor());

        System.out.println("Button: "
                + theme.getButtonColor());

        System.out.println("Font size: "
                + theme.getFontSize());
    }

    public abstract void display();
}
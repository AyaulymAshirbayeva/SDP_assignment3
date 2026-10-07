package WebTheme.website;
import WebTheme.theme.Theme;

public class PortfolioWebsite extends Website {
    public PortfolioWebsite(Theme theme) {
        super(theme);
    }
    @Override
    public void display() {
        System.out.println("PORTFOLIO WEBSITE");
        System.out.println("Welcome to my portfolio!");
        System.out.println("Here you can see my projects.");
        System.out.println();
        System.out.println("Theme Settings;");

        showThemeSettings();
    }
}

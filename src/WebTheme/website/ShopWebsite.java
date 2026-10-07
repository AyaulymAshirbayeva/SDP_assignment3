package WebTheme.website;
import WebTheme.theme.Theme;

public class ShopWebsite extends Website {
    public ShopWebsite(Theme theme) {
        super(theme);
    }
    @Override
    public void display() {
        System.out.println("SHOP WEBSITE");
        System.out.println("Welcome to our online shop!");
        System.out.println("Products are available here.");
        System.out.println();
        System.out.println("Theme Settings:");

        showThemeSettings();
    }
}

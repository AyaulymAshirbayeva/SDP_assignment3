package WebTheme.website;
import WebTheme.theme.Theme;

public class BlogWebsite extends Website {
    public BlogWebsite(Theme theme) {
        super(theme);
    }
    @Override
    public void display() {
        System.out.println("BLOG WEBSITE");
        System.out.println("Welcome to our blog!");
        System.out.println("Latest articles are available here.");
        System.out.println();
        System.out.println("Theme Settings:");

        showThemeSettings();
    }
}
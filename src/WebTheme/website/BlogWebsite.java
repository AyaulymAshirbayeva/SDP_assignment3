package WebTheme.website;

import WebTheme.theme.Theme;

public class BlogWebsite extends Website {

    public BlogWebsite(Theme theme) {
        super(theme);
    }

    @Override
    public void display() {
        System.out.println("=== BLOG WEBSITE ===");
        System.out.println("Welcome to our blog!");

        showThemeSettings();
    }
}
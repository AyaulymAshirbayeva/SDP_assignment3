package WebTheme;
import WebTheme.theme.CustomTheme;
import WebTheme.theme.DarkTheme;
import WebTheme.theme.LightTheme;
import WebTheme.theme.Theme;
import WebTheme.website.BlogWebsite;
import WebTheme.website.PortfolioWebsite;
import WebTheme.website.ShopWebsite;
import WebTheme.website.Website;

public class Main {
    public static void main(String[] args) {
        Theme lightTheme = new LightTheme();
        Theme darkTheme = new DarkTheme();

        Theme customTheme = new CustomTheme("Purple", "White", "Pink", 18);

        // Create a blog website with Light Theme
        Website blog = new BlogWebsite(lightTheme);

        blog.display();

        System.out.println();

        // Switch Blog Website from Light Theme to Dark Theme
        blog.setTheme(darkTheme);

        blog.display();

        System.out.println();

        // Switch Blog Website from Dark Theme to Custom Theme
        blog.setTheme(customTheme);

        blog.display();

        System.out.println();

        Website shop = new ShopWebsite(darkTheme);

        shop.display();

        System.out.println();

        Website portfolio =
                new PortfolioWebsite(customTheme);

        portfolio.display();
    }
}

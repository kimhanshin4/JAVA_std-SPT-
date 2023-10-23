package Practice.Kiosk;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String name;
    private String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Menu() {
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}

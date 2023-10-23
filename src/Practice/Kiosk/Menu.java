package Practice.Kiosk;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private int ID;
    private String name;
    private String description;

    public Menu(int ID, String name, String description) {
        this.ID = ID;
        this.name = name;
        this.description = description;
    }

    public Menu() {

    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}

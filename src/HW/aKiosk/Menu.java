package HW.aKiosk;

public class Menu {
    private int menuId;
    private String menuName;

    private double price;
    private String coinName;
    private String ingredients;

    public Menu(int menuId, String menuName, double price, String coinName, String ingrediendts) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.price = price;
        this.coinName = coinName;
        this.ingredients = ingrediendts;
    }

    public int getMenuId() {
        return menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public double getPrice() {
        return price;
    }

    public String getCoinName() {
        return coinName;
    }

    public String getIngredients() {
        return ingredients;
    }
    public void printMenuInfo() {
        System.out.println(this.menuId + this.menuName + this.price + this.coinName +this.ingredients);
    }


}
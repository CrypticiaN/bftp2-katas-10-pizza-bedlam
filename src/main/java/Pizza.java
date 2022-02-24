import java.math.BigDecimal;
import java.util.Locale;

public class Pizza {
    private int id;
    private String name;
    private String ingredients;
    private double price;
    private boolean hasExtras;

    public Pizza(int id, String name, String ingredients, double price, boolean hasExtras) {
        this.id = id;
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
        this.hasExtras = hasExtras;
    }

    public void printTicket() {
        String ticket =



public record Pizza(String name, BigDecimal price) {


    public String getTicket() {
        // Java string interpolation
        return String.format("%s   %.2f€\n   _____________________________\n   TOTAL                 %.2f€",
                name.toUpperCase(Locale.ROOT), price, price);
    }
}

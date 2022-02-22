import java.math.BigDecimal;
import java.util.Locale;

public record Pizza(String name, BigDecimal price) {


    public String getTicket() {
        // Java string interpolation
        return String.format("%s   %.2f€\n   _____________________________\n   TOTAL                 %.2f€",
                name.toUpperCase(Locale.ROOT), price, price);
    }
}

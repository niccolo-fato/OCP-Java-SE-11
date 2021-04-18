package persicoDev.code.practiceSix.lib;

import java.math.BigDecimal;
import java.time.LocalDate;

public final class Food extends Product {
    private LocalDate bestBerfore;

    Food(int id, String name, BigDecimal price, Rating rating, LocalDate bestBerfore) {
        super(id, name, price, rating);
        this.bestBerfore = bestBerfore;
    }
    
    public LocalDate getBestBefore() {
        return bestBerfore;
    }

    @Override
    public String toString() {
      return  super.toString() + " " + bestBerfore;
    }

    @Override
    public BigDecimal getDiscount() {
        return (bestBerfore.isEqual(LocalDate.now()))
            ? super.getDiscount() : BigDecimal.ZERO;
    }

    @Override
    public Product applyRating(Rating newRating) {
        return new Food(getId(), getName(), getPrice(), newRating, bestBerfore);
    }
    
}

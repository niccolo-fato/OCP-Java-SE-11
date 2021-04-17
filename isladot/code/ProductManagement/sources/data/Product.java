package ProductManagement.sources.data;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {
  public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);
  private int id;
  private String name;
  private BigDecimal price;

  public int getId() {
    return id;
  }

  public void setId(final int id) {
    this.id = id;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(final BigDecimal price) {
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public BigDecimal getDiscount() {
    return price.multiply(DISCOUNT_RATE).setScale(2, RoundingMode.HALF_UP);
  }
}

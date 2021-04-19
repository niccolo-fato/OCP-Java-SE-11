package niccolo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.Objects;

import static persicoDev.code.practiceSix.lib.Rating.NOT_RATED;

public abstract class Product {
  public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);
  private int id;
  private String name;
  private BigDecimal price;
  private Rating rating;

  // Product() {
  //   this(0, "no name", BigDecimal.ZERO);
  //  }

  Product(int id, String name, BigDecimal price, Rating rating) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.rating = rating;
  }

  Product(int id, String name, BigDecimal price) {
    this(id, name, price, NOT_RATED);
  }

  public int getId() {
    return id;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public String getName() {
    return name;
  }

  public BigDecimal getDiscount() {
    return price.multiply(DISCOUNT_RATE).setScale(2, RoundingMode.HALF_UP);
  }

  public Rating getRating() {
    return rating;
  }

  public abstract Product applyRating(Rating newRating);
  // {
  //   return new Product(this.id, this.name, this.price, newRating);
  // }
 public LocalDate getBestBefore() {
   return LocalDate.now();
 }
  @Override
  public String toString() {
    return id + ", " + name + ", " + price + ", " + getDiscount() + ", " + rating.getStars() + " " + getBestBefore();
  }

  @Override
  public int hashCode() {
    int hash = 5;
    hash = 23 * hash + this.id;
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    // if (obj == null && getClass() == obj.getClass()){
      if (obj instanceof Product){
      final Product other = (Product) obj;
      return this.id == other.id && Objects.equals(this.name, other.name);
  }
  return false;
}

}
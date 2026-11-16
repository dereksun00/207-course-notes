/** A rectangle with a width and height that can be scaled together. */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Creates a rectangle with the given dimensions.
   *
   * @param w the width
   * @param h the height
   */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
   * Returns this rectangle's area.
   *
   * @return width multiplied by height
   */
  public double area() {
    return width * height;
  }

  /**
   * Scales both dimensions by the given factor.
   *
   * @param factor the multiplier for the width and height
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Compares this rectangle's area with another rectangle's area.
   *
   * @param other the rectangle to compare with
   * @return true if this rectangle has a strictly greater area
   */
  public boolean isLargerThan(Rectangle other) {
    if (area() > other.area()) {
      return true;
    } else {
      return false;
    }
  }
}

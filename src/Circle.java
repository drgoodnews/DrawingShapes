public class Circle extends Shape implements Drawable{
    private int radius;
    final double pi = 3.14;

    public Circle(int radius) {
        setRadius(radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        // النجمه على الدائرة اذا كانت تحقق المعالة التالية
        // Distance Square <= Radius Square

        double r = radius;
        double radiusSquare = r * r;

        for (int y = radius; y >= -radius; y--) {
            StringBuilder sb = new StringBuilder();
            for (int x = -radius; x <= radius; x++) {
                double distanceSquare = x * x + y * y;

                if (distanceSquare <= radiusSquare) sb.append("* ");
                else sb.append("  ");

            }
            System.out.println(sb.toString());
        }
    }

    @Override
    public double getArea() {
        return pi * radius * radius;
    }
}

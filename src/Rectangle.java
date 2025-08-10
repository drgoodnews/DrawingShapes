public class Rectangle extends Shape implements Drawable {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        setWidth(width);
        setHeight(height);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        if(width > 0)
            this.width = width;
        else
            System.out.println("Width must be more than 0");
    }

    public void setHeight(int height) {
        if(height > 0)
            this.height = height;
        else
            System.out.println("Height must be more than 0");
    }

    @Override
    public void draw() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

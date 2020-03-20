import java.awt.Graphics;


public abstract class Shape implements Cloneable {
    private int x, y;
    private int width, height;
    protected String shapeName;

    public String getShapeName() {
        return this.shapeName;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public Shape(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }


    public abstract void draw(Graphics g);

    // This returns a clone of the object to be drawn.
    public Object clone(){
        try {
            return super.clone();
        }
        catch(CloneNotSupportedException c) {
            return null;
        }
    };

    public void setCenter(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

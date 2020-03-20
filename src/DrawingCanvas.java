import javax.swing.*;
import java.awt.*;
import java.util.Iterator;

public class DrawingCanvas extends JPanel {

    private ShapeModel shapeModel;

    public DrawingCanvas(){
        // This should include the drawing area, where you click to show
        // shapes, as well as the toolbar panels.

    	GridLayout grid = new GridLayout (6, 4, 10, 10); 
        this.setPreferredSize(new Dimension(800,600));

        this.setLayout(grid);
        this.setBackground(Color.lightGray);
        shapeModel = new ShapeModel();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);


        Iterator it = shapeModel.iterator();

        while (it.hasNext()) {
            Shape drawMe = (Shape) it.next();
            drawMe.draw(g);
        }
    }


    public void addShape(Shape shape) {
        shapeModel.addFigure(shape);


        // This will use the Collections library to utilize the paintComponent;
        repaint();

    }
}



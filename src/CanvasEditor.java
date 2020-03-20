
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CanvasEditor extends JPanel implements MouseListener{
    private Shape currentShape;
    private JTextField textField;

    public void setCurrentShape(Shape currentS){
        this.currentShape = currentS;
    }

    public Shape getCurrentShape() {
        Shape returnCurrentShape = this.currentShape;
        return returnCurrentShape;
    }

    CanvasEditor(Shape initialShape, JTextField statusText) {
        this.currentShape = initialShape;
        this.textField = statusText;
    }

    CanvasEditor() {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Shape newShape = (Shape)currentShape.clone();
        newShape.setCenter(e.getX(), e.getY());
        DrawingCanvas drawCanvas = (DrawingCanvas)e.getSource();
        drawCanvas.addShape(newShape);
        textField.setText(newShape.getShapeName() + " drawn");

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

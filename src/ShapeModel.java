import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;


public class ShapeModel implements Iterable<Shape>
{
    private ArrayList<Shape> shape;

    public ShapeModel() {
        shape = new ArrayList<>();
    }

    public void addFigure(Shape newShape) {
        shape.add(newShape);
    }

    @Override
    public Iterator<Shape> iterator() {
        return shape.iterator();
    }

    @Override
    public void forEach(Consumer<? super Shape> action) {


    }

    @Override
    public Spliterator<Shape> spliterator() {
        return null;
    }



}

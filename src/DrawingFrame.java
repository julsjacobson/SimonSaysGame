import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DrawingFrame extends JFrame {
    DrawingCanvas squares = new DrawingCanvas();
    private JTextField statusText = new JTextField(20);
    private CanvasEditor canvasListener = new CanvasEditor(new Square(0,0,1,1), statusText);

    public DrawingFrame() {
        //Creating instance of Action Listener

        //Setting default settings and title
        this.setTitle("Color Match!");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        GridLayout grid = new GridLayout (2, 2, 10, 10);
        this.setLayout(grid); 
        


        //Adding a DrawingCanvas object
        squares.addMouseListener(canvasListener);
        



        JPanel toolbarPanel = getToolBar();
        this.add(toolbarPanel, BorderLayout.SOUTH);
    }

    private JPanel getToolBar() {
        // Connects observer data pattern to the subjects in this frame,
        // buttons, and created default setting "None". This prevents coupling
        // and dependency.
//        canvas = new DrawingEditor(new JButton("None"));

        JPanel toolbar = new JPanel();


        JPanel buttonBar = new JPanel();
        JPanel statusBar = new JPanel();
        statusBar.add(statusText);
        toolbar.add(buttonBar, BorderLayout.NORTH);
        toolbar.add(statusBar, BorderLayout.SOUTH);



        // Add toolbar panel
        // Text field layout on the top and on the bottom
        //
        JButton play = new JButton("Play Game");


        // Adding to to toolbar panel
        buttonBar.add(play);

        // Setting all buttons to the same size
        Dimension buttonSize = new Dimension (60, 40);
        play.setSize(buttonSize);




        // This allows us to use an anonymous class to locally implement the
        // different mouse action
        play.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

            	//Start game, call to gameplay

            }
        });


        return toolbar;
    }

}

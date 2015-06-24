package lab9_joseph_borel;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JButtonPractice extends JFrame
{
 Container contents;
 // GUI components
 private JButton open;
 private JButton close;
 private Circuit circuit;

 private static JButtonPractice app;
 private boolean firstTime = true;

 public JButtonPractice( )
 {
  super( "Choose your activity" );
  contents = getContentPane( );
  contents.setLayout( new FlowLayout( ) );

  circuit = new Circuit( );

  open = new JButton( "OPEN" );
  contents.add( open );
  close = new JButton( "CLOSE" );
  contents.add( close );

  // ***** 1. Student code starts here
  // declare and instantiate the button handler
  // and register it on the buttons
  // Instantiate the button handler
  ButtonHandler bh = new ButtonHandler();
  
  // Register buttons to ButtonHandler
  open.addActionListener(bh);
  close.addActionListener(bh);
  // end of task 1

  setSize( 500, 375 );
  setVisible( true );
 }

 // ***** 2. Student code restarts here
 // Code a private class to implement the correct Listener
 // and its required method
 // To open the switch, call the open method with the statement
 //   open( );
 // To close the switch, call the close method with the statement
 //   close( );
 // The last statement of the method should be
 //   animate( );
 private class ButtonHandler implements ActionListener {
     // implement actionPerformed method
     public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == open)
            open();
        else if(ae.getSource() == close)
            close(); 
        /*try {
             // identify which button was pressed
             if(ae.getSource() == open)
                 open();
             else if(ae.getSource() == close)
                 close();
         } //end try block
         
         catch(NumberFormatException nfe) {
             
         }*/
        animate();
     } //end of actionPerformed() method
 }


 // end of task 2

 public void open( )
 {
  circuit.open( );
 }

 public void close( )
 {
  circuit.close( );
 }

 private void animate( )
 {
  try
  {
   repaint( );
   Thread.sleep( 200 );
  }
  catch ( InterruptedException e )
  {
   System.out.println( "IE Exception " + e.getMessage( ) );
   System.out.println( e.toString( ) );
  }
 }

 public void paint( Graphics g )
 {
  if ( firstTime )
    firstTime = false;
  super.paint( g );
  circuit.draw( g );
 }

 public static void main( String [] args )
 {
  app = new JButtonPractice( );
  app.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
 }
}
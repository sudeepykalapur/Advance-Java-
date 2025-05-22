/* 5b. Develop a Swing program in Java to create a Tabbed Pane of RED, BLUE, and GREEN and
   display the concerned color whenever the specific tab is selected in the Pane. */

   import javax.swing.*;
   import java.awt.*;
   
   public class ColorTabbedPane {
       public static void main(String[] args) {
           JFrame frame = new JFrame("Color Tabs");
           frame.setSize(400, 300);
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
           // Create tabbed pane
           JTabbedPane tabbedPane = new JTabbedPane();
   
           // RED panel
           JPanel redPanel = new JPanel();
           redPanel.setBackground(Color.RED);
   
           // BLUE panel
           JPanel bluePanel = new JPanel();
           bluePanel.setBackground(Color.BLUE);
   
           // GREEN panel
           JPanel greenPanel = new JPanel();
           greenPanel.setBackground(Color.GREEN);
   
           // Add tabs
           tabbedPane.addTab("Red", redPanel);
           tabbedPane.addTab("Blue", bluePanel);
           tabbedPane.addTab("Green", greenPanel);
   
           // Add tabbed pane to frame
           frame.add(tabbedPane);
   
           // Show the frame
           frame.setVisible(true);
       }
   }
   
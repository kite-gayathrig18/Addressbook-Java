/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.views;
//import javax.swing.JOptionPane;
// vo object class
import mvc.models.Person;

// for GUI
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.PopupMenu;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import javax.swing.JButton;
//import javax.swing.JComponent;
import javax.swing.JFrame;
//import javax.swing.JOptionPane;
import javax.swing.JPanel;
import mvc.controller.AddressBookController;

/**
 *
 * @author Admin
 */
public class ContactDialog {//implements ActionListener{
    private JFrame frame;
    private DetailViewPanel detailsPanel;
    final private JButton submitButton;
    private JButton cancelButton;
    private JButton exitButton; 
    private JButton searchButton; 
    private JPanel panel_btn;
    private Person  person;
    private AddressBookController controller;

    
    public ContactDialog(String name){
        frame = new JFrame(name);
        frame.getContentPane().setLayout(new BorderLayout());
        //frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
         frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
      // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(600, 600);
       frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        detailsPanel = new DetailViewPanel();
        frame.getContentPane().add(detailsPanel,BorderLayout.CENTER);
        
        panel_btn= new JPanel();
        panel_btn.setLayout(new GridLayout(1, 2));
        
        submitButton = new JButton("Submit");
        panel_btn.add(submitButton);
        
        cancelButton = new JButton("Cancel");
        panel_btn.add(cancelButton);
        
        exitButton = new JButton("Exit");
        panel_btn.add(exitButton);
        
        exitButton = new JButton("Search");
        panel_btn.add(searchButton);
        
        frame.getContentPane().add(panel_btn,BorderLayout.SOUTH);
        
        
    }
    
   
    
    public JButton getSubmitButton()
            {
                return submitButton;
            }
    
    
     public JButton getcancelButton()
            {
                return cancelButton;
            }
     public JButton getexitButton()
            {
                return exitButton;
            }
      public JButton getsearchButton()
            {
                return searchButton;
            }
     
    public JFrame getFrame()
    {
        return frame;
    }
   
    /**
     *
     * @return
     */
    public DetailViewPanel getPanel()
    {
    //detailsPanel.getNameField();
        return detailsPanel;
    }
 
    
    public void getValues()
    {
        System.out.println("name from getValues"+detailsPanel.getNameField().getText());
    }
    public Person getPerson()
    {
        return person;
    }

   
   

}
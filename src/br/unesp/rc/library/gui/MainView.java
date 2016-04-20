package br.unesp.rc.library.gui;

import br.unesp.rc.library.beans.Book;
import br.unesp.rc.library.beans.ItemCollection;
import br.unesp.rc.library.beans.Magazine;
import br.unesp.rc.library.beans.Media;
import br.unesp.rc.library.controller.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Dalton Lima / Lucas Pinheiro
 * github.com/daltonbr/LibraryManager
 *
 *  This project is under The MIT License (MIT)
 *  github.com/daltonbr/LibraryManager
 */

public class MainView extends JFrame {

    private JButton saveButton;
    private JButton findButton;
    private JButton newButton;
    private JTextField newNameTextField;
    private JTextField newCodeTextField;
    private JTextField newAuthorTextField;
    private JPanel mainPanel;
    private JComboBox newTypeComboBox;
    private JTabbedPane tabbedPane;
    private JTextField searchTextField;
    private JCheckBox newAvailableCheckBox;
    private JCheckBox findAvailableCheckBox;
    private JPanel searchJPanel;
    private JPanel resultsJPanel;
    private JPanel buttonsJPanel;
    private JPanel fieldsJPanel;
    private JTextField findCodeTextField;
    private JTextField findNameTextField;
    private JTextField findAuthorTextField;
    private JComboBox findTypeComboBox;
    private JTextField findTypeTextFieldTextField;
    private JButton exitButton;
    private JList searchList;


    public MainView() throws IOException, ClassNotFoundException {

        // instantiate the Controller class
        LibraryController libController = new LibraryController();

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //getting the inputs from form
                //TODO: Data Validation
                //TODO: Autogenerated code
                int code = Integer.parseInt( newCodeTextField.getText() );
                String name = newNameTextField.getText();
                String author = newAuthorTextField.getText();
                String type = newTypeComboBox.getSelectedItem().toString();
                Boolean available = newAvailableCheckBox.isSelected();

                //TODO: make this switch non-hardcoded (if we have time)
                // Switch from type - here we instantiate our object
                ItemCollection tempItem = null;
                switch (type)
                {
                    case "Book":
                        tempItem = new Book (code, name, author, available);
                        break;
                    case "Magazine":
                        tempItem = new Magazine(code, name, author, available);
                        break;
                    case "Media":
                        tempItem = new Media(code, name, author, available);
                        break;
                    default:  // catch unhandled types, could make a Warning PopUp (optional)
                        break;
                }

                libController.saveItemLocally(tempItem);

                //Console Debug
                System.out.println("object itemCollection generated! " +  tempItem.getClass()
                                    + " - Code: " + tempItem.getCode()
                                    + " - Name: " + tempItem.getName()
                                    + " - Author: " + tempItem.getAuthor() );

            }
        });

        newButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Clear all the fields
                newCodeTextField.setText("");
                newNameTextField.setText("");
                newAuthorTextField.setText("");
                newTypeComboBox.setSelectedIndex(0);  // reset the comboBox to the first option (Book)
                newAvailableCheckBox.setSelected(true);

                //TODO: generate the next CODE automatically
            }

        });



        findButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // an array to store the filtered searched results to show
                ArrayList<ItemCollection> arrayToShow = null;

                // passes two String to a search method: the search string itself and the type (book, mag, media)
                arrayToShow = libController.searchItem(searchTextField.getText(),
                                                        findTypeComboBox.getSelectedItem().toString() );


                //searchlist
                                               //= (arrayToShow.toArray() );
                System.out.println("Debug: Search Array size: "+ arrayToShow.size() );
            }
        });
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        JFrame frame = new JFrame("MainView");
        frame.setContentPane(new MainView().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}

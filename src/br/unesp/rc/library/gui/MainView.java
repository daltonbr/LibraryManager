package br.unesp.rc.library.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

//    saveButton.addActionListener(new ActionListener() {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//
//        }
//    });
//
//    public MainView() {
//        saveButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                DebugGraphics.logStream();
//            }
//        });
//    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MainView");
        frame.setContentPane(new MainView().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        //frame.setSize(640,480);
        frame.setVisible(true);

    }

}

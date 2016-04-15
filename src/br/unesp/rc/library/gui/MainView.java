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
    private JTextField nameTextField;
    private JTextField codeTextField;
    private JTextField authorTextField;
    private JPanel rootPanel;
    private JRadioButton bookRadioButton;
    private JRadioButton magazineRadioButton;
    private JRadioButton mediaRadioButton;

//    saveButton.addActionListener(new ActionListener() {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//
//        }
//    });

    public static void main(String[] args) {
        JFrame frame = new JFrame("MainView");
        frame.setContentPane(new MainView().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);



    }
}

package br.unesp.rc.library.controller;

import br.unesp.rc.library.beans.*;
import br.unesp.rc.library.persistence.*;
import java.io.*;


/**
 * @author Dalton Lima / Lucas Pinheiro
 * github.com/daltonbr/LibraryManager
 *
 *  This project is under The MIT License (MIT)
 *  github.com/daltonbr/LibraryManager
 */

public class LibraryController {

    // instantiate a ItemFile
    ItemFile iFile = new ItemFile();

    // constructor
    public LibraryController () throws IOException, ClassNotFoundException {

        // Check if the file exist, and if not, create it
        File ourFile = new File("itemFile.ser");
        if (!ourFile.exists()) {
            ourFile.createNewFile();
        }

        // Read from disk using FileInputStream
        FileInputStream fInput = new FileInputStream(ourFile); //"itemFile.ser");

        try {
            // Read object using ObjectInputStream
            ObjectInputStream objInput = new ObjectInputStream(fInput);

            // Read an object
            iFile = (ItemFile) objInput.readObject();
            objInput.close();

        } catch (EOFException e) {
            System.out.println("EOF Reached in itemFile.ser");
        } catch (IOException e) {
            // handle exception which is not expected
            System.out.println("ERROR: exception not expected!");
            e.printStackTrace();
        }
    }


     // This method receive a ItemCollection Object (Book, Media or Magazine)
     // and write it into the persistence objects (initially an ArrayList)
    public void saveItemLocally(ItemCollection object)
    {
        iFile.insertItem(object);
    }


}

package br.unesp.rc.library.persistence;

import br.unesp.rc.library.beans.ItemCollection;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * @author Dalton Lima / Lucas Pinheiro
 * github.com/daltonbr/LibraryManager
 *
 *  This project is under The MIT License (MIT)
 *  github.com/daltonbr/LibraryManager
 */

/* This class manage the ArrayList<ItemCollection> and we save an object
    of this class in the output file (serialized)
*/
public class ItemFile implements Item, Serializable{

    // this array will hold all registers
    ArrayList<ItemCollection> itemArray = new ArrayList<>();

    public ArrayList<ItemCollection> getItemArray() {
        return itemArray;
    }

    public void setItemArray(ArrayList<ItemCollection> itemArray) {
        this.itemArray = itemArray;
    }

    public void insertItem(ItemCollection object)
    {
        itemArray.add(object);
        System.out.println("Array size: " + itemArray.size() );  //Debug
        saveToFile(this);
    }


    // Save the array of itens in a file (Serialized)
    public void saveToFile (ItemFile iFile)
    {
        try
        {
            FileOutputStream fileOut = new FileOutputStream("itemFile.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(iFile);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in itemFile.ser ");
        }catch(IOException i)
        {
            i.printStackTrace();
        }
    }
}

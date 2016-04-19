package br.unesp.rc.library.persistence;

//import br.unesp.rc.library.beans.*;
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
public class ItemFile implements Item{

    ArrayList<ItemCollection> itemArray = new ArrayList<>();

    public void insertItem(ItemCollection object)
    {
        itemArray.add(object);
        System.out.println("Array size: " + itemArray.size() );  //Debug
        saveToFile(itemArray);
    }


    // Save the array of itens in a file (Serialized)
    public void saveToFile (ArrayList<ItemCollection> itemArray)
    {
        try
        {
            FileOutputStream fileOut = new FileOutputStream("itemFile.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(itemArray);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in itemFile.ser ");
        }catch(IOException i)
        {
            i.printStackTrace();
        }
    }

//    public ItemCollection search(String arg)
//    {
//        ItemCollection searchResult = null;
//
//        return searchResult;
//    }
}

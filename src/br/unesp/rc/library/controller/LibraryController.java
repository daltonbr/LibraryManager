package br.unesp.rc.library.controller;

import br.unesp.rc.library.beans.*;
import br.unesp.rc.library.persistence.*;

/**
 * @author Dalton Lima / Lucas Pinheiro
 * github.com/daltonbr/LibraryManager
 *
 *  This project is under The MIT License (MIT)
 *  github.com/daltonbr/LibraryManager
 */

public class LibraryController {

    // instantiate a BookFile
    ItemFile itemFileObject = new ItemFile();

     // This method receive a ItemCollection Object (Book, Media or Magazine)
     // and write it into the persistence objects (initially an ArrayList)
    public void saveItemLocally(ItemCollection object)
    {
        itemFileObject.insertItem(object);
    }


}

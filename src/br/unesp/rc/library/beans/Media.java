package br.unesp.rc.library.beans;

/**
 * @author Dalton Lima / Lucas Pinheiro
 * github.com/daltonbr/LibraryManager
 *
 *  This project is under The MIT License (MIT)
 *  github.com/daltonbr/LibraryManager
 */
public class Media extends ItemCollection{
    //constructor
    public Media (int _code, String _name, String _author, boolean _available)
    {
        this.setCode( _code);
        this.setName( _name);
        this.setAuthor( _author);
        this.setAvailable( _available);
    }
}

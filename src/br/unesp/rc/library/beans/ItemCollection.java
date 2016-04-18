package br.unesp.rc.library.beans;

/**
 * @author Dalton Lima / Lucas Pinheiro
 * github.com/daltonbr/LibraryManager
 *
 *  This project is under The MIT License (MIT)
 *  github.com/daltonbr/LibraryManager
 */
public abstract class ItemCollection {

    // Variables
    private int code;
    private String name;
    private String author;
    private boolean available;

    //constructor

    public ItemCollection () {}  //default constructor

    public ItemCollection (int _code, String _name, String _author, boolean _available)
    {
        this.setCode( _code);
        this.setName( _name);
        this.setAuthor( _author);
        this.setAvailable( _available);
    }

    // Getters and Setters
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

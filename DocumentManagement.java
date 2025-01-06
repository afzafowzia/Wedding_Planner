/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package weddingplanner;

/**
 *
 * @author rafia
 */
public class DocumentManagement {
    protected String File;

    public DocumentManagement() {
    }

    public DocumentManagement(String File) {
        this.File = File;
    }

    public String getFile() {
        return File;
    }

    public void setFile(String File) {
        this.File = File;
    }

    @Override
    public String toString() {
        return "DocumentManagement{" + "File=" + File + '}';
    }
    
}

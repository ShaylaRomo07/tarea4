package org.ies.tierno.models.typefiles;

import org.ies.tierno.models.File;

public class TextFile extends File {
    private final String text;

    public TextFile(int fileSize, String path, String text) {
        super(fileSize, path);
        this.text = text;
    }


    @Override
    public void open() {
        System.out.println("Archivo de texto");
        openGeneral();
        System.out.println("Contenido:");
        System.out.println(text);
    }
}

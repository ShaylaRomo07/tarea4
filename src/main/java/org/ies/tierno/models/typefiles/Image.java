package org.ies.tierno.models.typefiles;

import org.ies.tierno.models.File;

public class Image extends File {
    private final int width;
    private final int height;

    public Image(int fileSize, String path, int width, int height) {
        super(fileSize, path);
        this.width = width;
        this.height = height;
    }
    @Override
    public void open() {
        System.out.println("Archivo de texto");
        openGeneral();
        System.out.println("Contenido:");
        System.out.println(text);
    }
}
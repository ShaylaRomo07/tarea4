package org.ies.tierno.models.typefiles;

import org.ies.tierno.models.File;

public class ImageFile extends File {
    private final int width;
    private final int height;

    public ImageFile(int fileSize, String path, int width, int height) {
        super(fileSize, path);
        this.width = width;
        this.height = height;
    }

    @Override
    public void open() {
        System.out.println("Archivo de texto");
        openGeneral();
        System.out.println("Tamaño:");
        System.out.println(width + " x " + height);
    }
}
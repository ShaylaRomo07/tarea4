package org.ies.tierno.models.typefiles;


import org.ies.tierno.models.File;

import java.util.Objects;

public class ImageFile extends File {
    private int width;
    private int height;

    public ImageFile(int fileSize, String path, int width, int height) {
        super(fileSize, path);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ImageFile imageFile = (ImageFile) o;
        return width == imageFile.width && height == imageFile.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    @Override
    public void open() {
        System.out.println("Archivo de texto");
        openGeneral();
        System.out.println("Tamaño:");
        System.out.println(width + " x " + height);
    }
}
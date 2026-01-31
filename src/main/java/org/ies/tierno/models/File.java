package org.ies.tierno.models;


import java.util.Objects;

public abstract class File {
    private int fileSize;
    private String path;

    public File(int fileSize, String path) {
        this.fileSize = fileSize;
        this.path = path;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        File file = (File) o;
        return fileSize == file.fileSize && Objects.equals(path, file.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileSize, path);
    }

    public abstract void open();

    public void openGeneral() {
        System.out.println("Tamaño del archivo: " + fileSize);
        System.out.println("Ruta: " + path);
    }

    public void move(String newPath) {
        if (newPath.equals(path)) {
            System.out.println("No hay cambios");
        } else {
            setPath(newPath);
            System.out.println("Se ha movido el fichero a" + newPath);
        }
    }
}

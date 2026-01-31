package org.ies.tierno.models.typefiles;

import org.ies.tierno.models.File;

import java.util.Objects;

public class AudioFile extends File {
    private String lenght;

    public AudioFile(int fileSize, String path, String lenght) {
        super(fileSize, path);
        this.lenght = lenght;
    }

    public String getLenght() {
        return lenght;
    }

    public void setLenght(String lenght) {
        this.lenght = lenght;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AudioFile audioFile = (AudioFile) o;
        return Objects.equals(lenght, audioFile.lenght);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(lenght);
    }

    @Override
    public void open() {
        System.out.println("Archivo de audio");
        openGeneral();
        System.out.println("Duracion: " + lenght);
    }
}

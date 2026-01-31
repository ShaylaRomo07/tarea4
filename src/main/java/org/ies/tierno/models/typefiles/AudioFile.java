package org.ies.tierno.models.typefiles;

import org.ies.tierno.models.File;

public class AudioFile extends File {
    private final String lenght;

    public AudioFile(int fileSize, String path, String lenght) {
        super(fileSize, path);
        this.lenght = lenght;
    }

    @Override
    public void open() {
        System.out.println("Archivo de audio");
        openGeneral();
        System.out.println("Duracion: " + lenght);
    }
}

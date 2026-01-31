package org.ies.tierno.models.typefiles;

import org.ies.tierno.models.File;

public class Audio extends File {
    private final String lenght;

    public Audio(int fileSize, String path, String lenght) {
        super(fileSize, path);
        this.lenght = lenght;
    }
}

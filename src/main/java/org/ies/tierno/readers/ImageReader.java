package org.ies.tierno.readers;

import org.ies.tierno.models.typefiles.ImageFile;
import java.util.Random;

public class ImageReader implements Reader<ImageFile> {
    private final static String[] PATH = {"/Image","/Desktop/Imagenes/Tarea","/Desktop/Imagenes/Dibujos","/Image/CapturasDePantalla"};
    private final Random random;

    public ImageReader(Random random) {
        this.random = random;
    }

    @Override
    public ImageFile read() {
        return new ImageFile(
                random.nextInt(128),
                PATH[random.nextInt(PATH.length)],
                random.nextInt(100000),
                random.nextInt(100000)
        );
    }
}

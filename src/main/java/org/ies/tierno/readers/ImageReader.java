package org.ies.tierno.readers;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.ies.tierno.models.typefiles.ImageFile;
import java.util.Random;
@Data
@AllArgsConstructor

public class ImageReader implements Reader<ImageFile> {
    private final static String[] PATH = {"/Image","/Desktop/Imagenes/Tarea","/Desktop/Imagenes/Dibujos","/Image/CapturasDePantalla"};
    private final Random random;

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

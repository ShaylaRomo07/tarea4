package org.ies.tierno.readers;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.ies.tierno.models.File;
import org.ies.tierno.models.typefiles.AudioFile;
import org.ies.tierno.models.typefiles.ImageFile;

import java.util.Random;

@Data
@AllArgsConstructor
public class FileReader implements Reader<File> {
    private final Random random;
    private final Reader<AudioFile> audioFileReader;
    private final Reader<ImageFile> imageFileReader;
    private final Reader<TextFile> textFileReader;

    @Override
    public File read() {
        int n = random.nextInt(3);
        if (n == 1) {
            return audioFileReader.read();
        } else if (n == 2) {
            return imageFileReader.read();
        } else {
            return textFileReader.read();
        }
    }
}

package org.ies.tierno.readers;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.ies.tierno.models.File;
import org.ies.tierno.models.Program;
import org.ies.tierno.models.typefiles.TextFile;

import java.util.Random;

@Data
@AllArgsConstructor
public class ProgramReader<T extends File> implements Reader<Program<TextFile>> {
    private final static String[] NAME = {"Audacity", "Word", "Krita", "Photoshop", "MuseHub", "CakeWalk", "Google Chrome"};
    private final Random random;
    private final Reader<TextFile> fileReader;

    @Override
    public Program<TextFile> read() {
        TextFile[] files = (TextFile[]) new Object[random.nextInt(1, 10)];
        for (int i = 0; i < files.length; i++) {
            files[i] = fileReader.read();
        }
        return new Program<>(
                NAME[random.nextInt(NAME.length)],
                files
        );
    }

}

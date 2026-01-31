package org.ies.tierno.readers;


import org.ies.tierno.models.File;
import org.ies.tierno.models.Program;
import org.ies.tierno.models.typefiles.TextFile;

import java.util.Random;

public class ProgramReader<T extends File> implements Reader<Program<TextFile>> {
    private final static String[] NAME = {"Audacity", "Word", "Krita", "Photoshop", "MuseHub", "CakeWalk", "Google Chrome"};
    private final Random random;
    private final Reader<TextFile> fileReader;

    public ProgramReader(Random random, Reader<TextFile> fileReader) {
        this.random = random;
        this.fileReader = fileReader;
    }

    @Override
    public Program<TextFile> read() {
        TextFile[] files = new TextFile[random.nextInt(2,10)];
        for (int i = 0; i < files.length; i++) {
            files[i] = fileReader.read();
        }
        return new Program<>(
                NAME[random.nextInt(NAME.length)],
                files
        );
    }

}

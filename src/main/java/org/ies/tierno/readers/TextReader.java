package org.ies.tierno.readers;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.ies.tierno.models.typefiles.TextFile;

import java.util.Random;

@Data
@AllArgsConstructor
public class TextReader implements Reader<TextFile> {
    private final static String[] PATH = {"/Music", "/Desktop/Audio/Whatshap", "/Desktop/Audio/Edits", "/Music/Records"};
    private final static String[] CONTENT = {"Hola mundo, adios mundo","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla ut lacus enim. Sed euismod in ex a sagittis. Phasellus ullamcorper ut urna sit amet venenatis.","Praesent viverra eros at dolor placerat, vel gravida nulla congue."};
    private final Random random;
    @Override
    public TextFile read() {
        return new TextFile(
                random.nextInt(128),
                PATH[random.nextInt(PATH.length)],
                CONTENT[random.nextInt(CONTENT.length)]
                );
    }
}

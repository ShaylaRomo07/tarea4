package org.ies.tierno.readers;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.ies.tierno.models.typefiles.AudioFile;
import java.util.Random;
@Data
@AllArgsConstructor
public class AudioReader implements Reader<AudioFile> {
    private final static String[] PATH = {"/Music","/Desktop/Audio/Whatshap","/Desktop/Audio/Edits","/Music/Records"};
    private final static String[] LENGHT = {"9:30","2:03","4:50","1:00:43","0:20","4:09"};

    private final Random random;

    @Override
    public AudioFile read() {
        return new AudioFile(
                random.nextInt(128),
                PATH[random.nextInt(PATH.length)],
                LENGHT[random.nextInt(LENGHT.length)]
        );
    }
}

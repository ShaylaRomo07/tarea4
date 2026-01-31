package org.ies.tierno.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Program<T extends File> {
    private final String name;
    private final T[] files;

    public void execute(String outputPath) {
        System.out.println("Programa: " + name);
        System.out.println("Archivos:");
        for (T file : files) {
            file.open();
            file.move(outputPath);
        }
    }
}

package org.ies.tierno.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Program <T extends File> {
    private final String name;
    private final T[] files;

    
}

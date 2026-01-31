package org.ies.tierno.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public abstract class File {
    private int fileSize;
    private String path;


    public abstract void open();

    public void openGeneral() {
        System.out.println("Tamaño del archivo: " + fileSize);
        System.out.println("Ruta: " + path);
    }

    public void move(String newPath) {
        if (newPath.equals(path)) {
            System.out.println("No hay cambios");
        } else {
            setPath(newPath);
            System.out.println("Se ha movido el fichero a" + newPath);
        }
    }
}

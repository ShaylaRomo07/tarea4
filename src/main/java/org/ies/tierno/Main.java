package org.ies.tierno;

import org.ies.tierno.models.Program;
import org.ies.tierno.readers.FileReader;
import org.ies.tierno.readers.ProgramReader;
import org.ies.tierno.readers.TextReader;

import java.util.Properties;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        TextReader textReader = new TextReader(random);
        ProgramReader programReader = new ProgramReader<>(random, textReader);
        Program program = programReader.read();
        System.out.println("");
        program.execute();
    }
}

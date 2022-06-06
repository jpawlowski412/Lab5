package pl.lublin.wsei.java.cwiczenia.lab5.console;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class TestNioCopy {
    public static void main(String[] args) throws IOException {
        long startTime = System.nanoTime();
        File oryginal = new File("src/main/sample_1920x1280.tiff");
        File kopia = new File("img_copy2.tiff");
        Files.copy(oryginal.toPath(), kopia.toPath(), StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Czas kopiowania: " + (float) (System.nanoTime() - startTime) / 1000000 + " ms");
    }
}

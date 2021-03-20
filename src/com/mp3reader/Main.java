package com.mp3reader;

import java.io.IOException;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) throws Exception{
        if (args.length != 1){
            throw new IllegalArgumentException("Enter a path to find music!");
        }
        Path path = Paths.get(args[0]);
        if (!Files.exists(path)) {
            throw new IllegalArgumentException("This path does not exist: " + path);
        }

        PathMatcher match = FileSystems.getDefault().getPathMatcher("glob:*.mp3");

    }
}

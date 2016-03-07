package ch.heigvd.res.io.util;

import java.io.PrintStream;

/**
 * Takes a PrintStream linked to a file and put serialized IData in it.
 */
public class FileRecorder implements IRecorder {

    private final PrintStream printStream;
    private final ISerializer serializer;

    /**
     * Sets the PrintStream and Serializer used to write serialized IData in the file.
     * @param printStream
     * @param serializer
     */
    public FileRecorder(PrintStream printStream, ISerializer serializer) {
        this.printStream = printStream;
        this.serializer = serializer;
    }

    @Override
    public void record(IData data) {
        serializer.serialize(data, printStream);
    }

    /**
     * Records a simple string to the file.
     * @param s The string to be written.
     */
    public void record(String s) {
        printStream.println(s);
        printStream.flush();
    }
}
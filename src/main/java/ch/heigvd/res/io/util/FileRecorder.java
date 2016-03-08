package ch.heigvd.res.io.util;

import java.io.PrintStream;

/**
 * Takes a PrintStream linked to a file and put serialized IData in it.
 *
 * @author Olivier Liechti, Basile Vu
 */
public class FileRecorder implements IRecorder {

    private final PrintStream printStream;
    private final ISerializer serializer;

    /**
     * Sets the PrintStream and Serializer used to write serialized IData in the file.
     * @param printStream The printStream where the serialized IData will be written.
     * @param serializer The serializer used to serialized the IData.
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

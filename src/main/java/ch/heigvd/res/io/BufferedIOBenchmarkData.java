package ch.heigvd.res.io;

import ch.heigvd.res.io.util.IData;
import ch.heigvd.res.io.util.IOStrategy;

import java.util.*;

/**
 * Keeps track of the data generated during the BufferedIOBenchmark.
 *
 * @author Olivier Liechti, Basile Vu
 */
public class BufferedIOBenchmarkData implements IData {

    // public static since the labels of the columns for this class are always the same; therefore it could be useful
    // to know them without instancing this class.
    public static String[] LABELS = {
            "operation",
            "strategy",
            "blockSize",
            "fileSizeInBytes",
            "durationInMs"
    };

    // A LinkedHashMap allows the values to be on the same order as they are inserted (useful when using .values() for ex)
    private final Map<String, Object> values = new LinkedHashMap<>();

    /**
     * Sets the different values composing a BufferedIOBenchmarkData.
     * @param operation The operation executed on the stream.
     * @param strategy The strategy used do a certain operation on the stream.
     * @param blockSize How many blocks to use when running the operation.
     * @param fileSizeInBytes The size of the files created.
     * @param durationInMs The duration of the operation according to all the other parameters.
     */
    public BufferedIOBenchmarkData(String operation, IOStrategy strategy, int blockSize, long fileSizeInBytes, long durationInMs) {
        values.put(LABELS[0], operation);
        values.put(LABELS[1], strategy);
        values.put(LABELS[2], blockSize);
        values.put(LABELS[3], fileSizeInBytes);
        values.put(LABELS[4], durationInMs);
    }

    @Override
    public Object[] getValues() {
        return values.values().toArray();
    }

    @Override
    public Object get(String key) {
        return values.get(key);
    }
}

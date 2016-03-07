package ch.heigvd.res.io.util;

import java.io.PrintStream;

/**
 * Allows serialization of any IData to a CSV format and outputs it to a stream.
 */
public class CsvSerializer implements ISerializer {

    /**
     * Serializes any IData to a CSV format and outputs it to a stream.
     * @param data The IData to be serialized.
     * @param ps The stream where to put the serialized data.
     */
    @Override
    public void serialize(IData data, PrintStream ps) {
        Object[] values = data.getValues();

        for (int i = 0; i < values.length; ++i) {
            ps.print(values[i]);

            if (i != values.length-1) {
                ps.print(",");
            } else {
                ps.println();
            }
        }
        ps.flush();
    }
}

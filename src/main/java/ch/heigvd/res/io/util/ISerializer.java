package ch.heigvd.res.io.util;

import java.io.PrintStream;

/**
 * Allows serialization of any IData. The result is put into a stream.
 */
public interface ISerializer {
    void serialize(IData data, PrintStream ps);
}

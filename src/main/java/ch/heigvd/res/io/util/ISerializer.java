package ch.heigvd.res.io.util;

import java.io.PrintStream;

/**
 * Allows serialization of any IData. The result is put into a stream.
 *
 * @author Olivier Liechti, Basile Vu
 */
public interface ISerializer {
    void serialize(IData data, PrintStream ps);
}

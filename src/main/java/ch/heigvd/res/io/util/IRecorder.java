package ch.heigvd.res.io.util;

/**
 * Records an IData object.
 *
 * @author Olivier Liechti, Basile Vu
 */
public interface IRecorder {
    /**
     * Records an IData object.
     * @param data The IData to be recorded.
     */
    void record(IData data);
}

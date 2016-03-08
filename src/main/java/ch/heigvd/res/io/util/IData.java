package ch.heigvd.res.io.util;

/**
 * Keeps track of the data generated during an experiment.
 *
 * @author Olivier Liechti, Basile Vu
 */
public interface IData {
    /**
     * Gets the values stored in the Data object as an Object array.
     * @return The values an Object array.
     */
    Object[] getValues();

    /**
     * Gets the value stored at a given key in the Data object.
     * @param key The key where the object is located.
     * @return The wanted object.
     */
    Object get(String key);
}

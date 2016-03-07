package ch.heigvd.res.io.util;

/**
 * This enum is used to describe the 4 different strategies for doing the IOs
 */
public enum IOStrategy {
    ByteByByteWithoutBufferedStream,
    ByteByByteWithBufferedStream,
    BlockByBlockWithoutBufferedStream,
    BlockByBlockWithBufferedStream
};

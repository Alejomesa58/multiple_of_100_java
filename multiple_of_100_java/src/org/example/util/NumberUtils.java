package org.example.util;

/**
 * Utility methods for basic number operations.
 */
public final class NumberUtils {

    private NumberUtils() {
        // Prevent instantiation
    }

    /**
     * Returns true if {@code value} is an exact multiple of {@code base}.
     *
     * <p>Notes:
     * <ul>
     *   <li>Zero is considered a multiple of any non-zero base.</li>
     *   <li>Negative values are supported; Java's remainder operator preserves zero remainder for exact multiples.</li>
     * </ul>
     *
     * @param value the number to check
     * @param base  the base to check against (must not be zero)
     * @return {@code true} if value % base == 0; {@code false} otherwise
     * @throws IllegalArgumentException if {@code base} is zero
     */
    public static boolean isMultipleOf(long value, long base) {
        if (base == 0L) {
            throw new IllegalArgumentException("base must not be zero");
        }
        return value % base == 0L;
    }

    /**
     * Convenience method that checks whether {@code value} is a multiple of 100.
     *
     * @param value the number to check
     * @return {@code true} if {@code value} is a multiple of 100; {@code false} otherwise
     */
    public static boolean isMultipleOf100(long value) {
        return isMultipleOf(value, 100L);
    }
}

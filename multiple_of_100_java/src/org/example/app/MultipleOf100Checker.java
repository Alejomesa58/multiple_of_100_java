package org.example.app;

import java.util.Scanner;
import org.example.util.NumberUtils;

/**
 * Console application that reads integers from STDIN and prints
 * "multiple of 100" or "not multiple of 100" for each one.
 */
public class MultipleOf100Checker {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Read integers until EOF (Ctrl+Z then Enter on Windows, Ctrl+D on macOS/Linux)
            while (scanner.hasNextLong()) {
                long value = scanner.nextLong();
                boolean isMultiple = NumberUtils.isMultipleOf100(value);
                System.out.println(isMultiple ? "multiple of 100" : "not multiple of 100");
            }
        }
    }
}


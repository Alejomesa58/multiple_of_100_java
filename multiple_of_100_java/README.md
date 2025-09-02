# Multiple of 100 (Java)

A tiny Java utility and console app that checks whether an integer is a multiple of 100.

## How it works
- `NumberUtils.isMultipleOf100(long)` provides a reusable method.
- `MultipleOf100Checker` reads **one or more integers** from STDIN and, for **each** integer, prints:
  - `multiple of 100` or
  - `not multiple of 100`.

## Build & Run in Eclipse (interactive, multi-input)
- Run `MultipleOf100Checker` as a **Java Application**.
- In the **Console**, type integers (separated by spaces or newlines) and press **Enter**.
- The app keeps reading and printing results **until EOF**:
  - **Windows:** press `Ctrl + Z` and then **Enter**.
  - **macOS / Linux:** press `Ctrl + D`.

## Notes
- Input supports negative numbers and zero.
- Output is exactly **one line per integer** with the required text.
- No extra prompts are printed to keep the output format strict.

## Example
Input (typed in the Eclipse Console):
12600
12345 100
77
Output:
multiple of 100
not multiple of 100
multiple of 100
not multiple

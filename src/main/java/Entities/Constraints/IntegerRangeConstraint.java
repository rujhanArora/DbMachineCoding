package main.java.Entities.Constraints;

import main.java.Entities.Exceptions.InvalidConstraintException;
import main.java.Entities.Cells.Cell;
import main.java.Entities.Cells.IntegerCell;

public class IntegerRangeConstraint implements Constraint {
    private int low, high;
    public IntegerRangeConstraint(int low, int high) {
        this.low = low;
        this.high = high;
    }

    @Override
    public void validateCell(Cell cell) throws InvalidConstraintException {
        // Verify the class match as well initially
        int value = ((IntegerCell)cell).getValue();
        if (value < low || value > high) {
            throw new InvalidConstraintException("Integer cell value out of range");
        }
    }
}

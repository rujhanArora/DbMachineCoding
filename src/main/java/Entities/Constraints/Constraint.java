package main.java.Entities.Constraints;

import main.java.Entities.Exceptions.InvalidConstraintException;
import main.java.Entities.Cells.Cell;

public interface Constraint {
    public void validateCell(Cell data) throws InvalidConstraintException;
}

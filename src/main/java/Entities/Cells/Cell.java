package main.java.Entities.Cells;

import main.java.Entities.Columns.Column;
import main.java.Entities.Exceptions.InvalidConstraintException;

public abstract class Cell {
    public Column column;
    public Cell(Column column) {
        this.column = column;
    }
    public abstract void print();
    public void validate() throws InvalidConstraintException {
        column.validate(this);
    }
}

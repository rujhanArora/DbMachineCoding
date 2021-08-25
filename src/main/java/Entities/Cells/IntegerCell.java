package main.java.Entities.Cells;

import main.java.Entities.Columns.Column;

public class IntegerCell extends Cell{
    private int value;
    public IntegerCell(Column column, int value) {
        super(column);
        this.value = value;
    }

    @Override
    public void print() {
        System.out.println("Column: " + this.column.getName());
        System.out.println("Value: " + this.value);
    }

    public int getValue() {
        return this.value;
    }
}

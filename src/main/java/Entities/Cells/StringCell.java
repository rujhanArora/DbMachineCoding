package main.java.Entities.Cells;

import main.java.Entities.Columns.Column;

public class StringCell extends Cell {
    private String value;
    public StringCell(Column column, String value) {
        super(column);
        this.value = value;
    }

    @Override
    public void print() {
        System.out.println("Column: " + this.column.getName());
        System.out.println("Value: " + this.value);
    }

    public int getStringLength() {
        return this.value.length();
    }

    public String getValue() {
        return value;
    }
}

package main.java.Entities;

import main.java.Entities.Cells.Cell;
import main.java.Entities.Columns.Column;
import main.java.Entities.Exceptions.InvalidConstraintException;
import java.util.*;

public class Table {
    private long CURR_ROW_ID;
    private String name;
    // List of columns
    private List<Column> columns;
    // List of rows
    private Map<Long, Row> rows;

    public Table(String name, List<Column> columns) {
        CURR_ROW_ID = 1;
        this.name = name;
        this.columns = columns;
        this.rows = new HashMap<>();
    }

    public long addRow(List<Cell> cells) throws InvalidConstraintException {
        for (Cell cell: cells) {
            cell.validate();
        }
        Row currRow = new Row(cells, CURR_ROW_ID);
        this.rows.put(CURR_ROW_ID, currRow);
        this.CURR_ROW_ID++;
        return this.CURR_ROW_ID - 1;
    }
//
//    public void updateRow() {
//
//    }
//
//    public void deleteRow() {
//
//    }
//
//    public List<Row> fetchAllRows() {
//    }

    public Row getRowById(Long id) {
        return this.rows.get(id);
    }
}
